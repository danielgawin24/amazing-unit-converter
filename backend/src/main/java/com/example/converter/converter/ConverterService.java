package com.example.converter.converter;

import com.example.converter.dataRequestBody.UnitConversionDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConverterService {

    public UnitConversionDTO convertLengthWeight(UnitConversionDTO body) {
        Map<String, Double> rates = switch (body.getType()) {
            case "length" -> getLengthConversionRates();
            case "weight" -> getWeightConversionRates();
            default -> new HashMap<>();
        };
        double value = Double.parseDouble(body.getValue());
        double fromUnit = rates.get(body.getFromUnit());
        double toUnit = rates.get(body.getToUnit());
        String conversionResult = BigDecimal.valueOf(value / fromUnit * toUnit)
                .setScale(6, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString();
        return new UnitConversionDTO(body.getType(), String.valueOf(value), body.getFromUnit(), body.getToUnit(), conversionResult);
    }

    public UnitConversionDTO convertTemperature(UnitConversionDTO body) {
        double value = switch (body.getFromUnit()) {
            case "°C" -> Double.parseDouble(body.getValue());
            case "°F" -> (Double.parseDouble(body.getValue()) - 32) / 1.8d;
            case "K" -> Double.parseDouble(body.getValue()) - 273.15d;
            case "°R" -> (Double.parseDouble(body.getValue()) - 491.67d) / 1.8d;
            default -> -1;
        };
        Map<String, Double> rates = getCelsiusConversionRates(value);
        BigDecimal conversionResult = BigDecimal.valueOf(rates.get(body.getToUnit()))
                .setScale(2, RoundingMode.HALF_UP);

        if (body.getToUnit().equals("°C")) {
            return new UnitConversionDTO(body.getType(), String.valueOf(body.getValue()), body.getFromUnit(), body.getToUnit(), String.valueOf(value));
        }
        return new UnitConversionDTO(body.getType(), String.valueOf(body.getValue()), body.getFromUnit(), body.getToUnit(), String.valueOf(conversionResult));
    }

    private Map<String, Double> getLengthConversionRates() {
        Map<String, Double> lengthRates = new HashMap<>();
        lengthRates.put("mm", 1000.0d);
        lengthRates.put("cm", 100.0d);
        lengthRates.put("dm", 10.0d);
        lengthRates.put("m", 1.0d);
        lengthRates.put("km", 0.001d);

        lengthRates.put("in", 39.37007874d);
        lengthRates.put("ft", 3.280839895d);
        lengthRates.put("yd", 1.0936132983d);
        lengthRates.put("mi", 0.0006213712d);

        lengthRates.put("nmi", 0.0005399568d);
        lengthRates.put("ly", 1.057008707E-16d);
        lengthRates.put("au", 6.6845871226706E-12d);
        return lengthRates;
    }

    private Map<String, Double> getWeightConversionRates() {
        Map<String, Double> weightRates = new HashMap<>();
        weightRates.put("t", 0.001);
        weightRates.put("kg", 1.0);
        weightRates.put("g", 1000.0);
        weightRates.put("mg", 1000000.0);

        weightRates.put("tl_uk", 0.0009842065);
        weightRates.put("ts_us", 0.0011023113);
        weightRates.put("qtr", 0.088184904873951);
        weightRates.put("st", 0.1574730444);
        weightRates.put("lb", 2.2046226218);
        weightRates.put("oz", 35.2739619496);
        weightRates.put("gr", 15432.3583529);

        weightRates.put("lb_t", 2.6792288807);
        weightRates.put("oz_t", 32.1507466);
        weightRates.put("pwt", 643.0149313708);
        return weightRates;
    }

    private Map<String, Double> getCelsiusConversionRates(double celsius) {
        Map<String, Double> tempRates = new HashMap<>();
        tempRates.put("°C", celsius);
        tempRates.put("°F", celsius * 1.8d + 32);
        tempRates.put("K", celsius + 273.15d);
        tempRates.put("°R", (celsius + 273.15d) * 1.8d);
        return tempRates;
    }
}
