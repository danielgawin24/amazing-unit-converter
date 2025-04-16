package com.example.converter.converter;

import com.example.converter.dataRequestBody.UnitConversionDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterServiceTest {

    private final ConverterService converterService = new ConverterService();

    @Test
    void testLengthConversions() {
        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "m", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("0", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "0", "m", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1000", "mm", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "100", "cm", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "10", "dm", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1000", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1.0", "km", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "0.001", "km", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1234.567", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1234567", "mm", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("0.0254", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "in", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("0.3048", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "ft", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("0.9144", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "yd", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1609.34398", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "mi", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("39.370079", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "m", "in", null)
        ).getConversionResult());

        Assertions.assertEquals("3.28084", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "m", "ft", null)
        ).getConversionResult());

        Assertions.assertEquals("1.093613", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "m", "yd", null)
        ).getConversionResult());

        Assertions.assertEquals("0.000621", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "m", "mi", null)
        ).getConversionResult());

        Assertions.assertEquals("0", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "0", "mm", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "0.000001", "km", "mm", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "0.001", "m", "mm", null)
        ).getConversionResult());

        Assertions.assertEquals("10", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "0.1", "m", "cm", null)
        ).getConversionResult());

        Assertions.assertEquals("149597870.691", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "au", "km", null)
        ).getConversionResult());

        Assertions.assertEquals("9460660005707.977", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "ly", "km", null)
        ).getConversionResult());

        Assertions.assertEquals("1852.000012", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "nmi", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("0.001", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "mm", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("100", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "10", "cm", "mm", null)
        ).getConversionResult());

        Assertions.assertEquals("1609.34398", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "mi", "m", null)
        ).getConversionResult());

        Assertions.assertEquals("0.000001", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "1", "mm", "km", null)
        ).getConversionResult());

        Assertions.assertEquals("-100", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "-1", "m", "cm", null)
        ).getConversionResult());

        Assertions.assertEquals("-10000", converterService.convertLengthWeight(
                new UnitConversionDTO("length", "-10", "km", "m", null)
        ).getConversionResult());
    }

    @Test
    void testWeightConversions() {
        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "kg", null)
        ).getConversionResult());

        Assertions.assertEquals("1000", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "g", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1000", "g", "kg", null)
        ).getConversionResult());

        Assertions.assertEquals("1000000", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "mg", null)
        ).getConversionResult());

        Assertions.assertEquals("0.001", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "t", null)
        ).getConversionResult());

        Assertions.assertEquals("0.000984", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "tl_uk", null)
        ).getConversionResult());

        Assertions.assertEquals("0.001102", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "ts_us", null)
        ).getConversionResult());

        Assertions.assertEquals("0.088185", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "qtr", null)
        ).getConversionResult());

        Assertions.assertEquals("0.157473", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "st", null)
        ).getConversionResult());

        Assertions.assertEquals("2.204623", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "lb", null)
        ).getConversionResult());

        Assertions.assertEquals("35.273962", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "oz", null)
        ).getConversionResult());

        Assertions.assertEquals("15432.358353", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "gr", null)
        ).getConversionResult());

        Assertions.assertEquals("2.679229", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "lb_t", null)
        ).getConversionResult());

        Assertions.assertEquals("32.150747", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "oz_t", null)
        ).getConversionResult());

        Assertions.assertEquals("643.014931", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "kg", "pwt", null)
        ).getConversionResult());

        Assertions.assertEquals("1", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "0.001", "t", "kg", null)
        ).getConversionResult());

        Assertions.assertEquals("0.001", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "g", "kg", null)
        ).getConversionResult());

        Assertions.assertEquals("0.000001", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "1", "mg", "kg", null)
        ).getConversionResult());

        Assertions.assertEquals("-1000", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "-1", "kg", "g", null)
        ).getConversionResult());

        Assertions.assertEquals("0", converterService.convertLengthWeight(
                new UnitConversionDTO("weight", "0", "kg", "g", null)
        ).getConversionResult());
    }

    @Test
    void testTemperatureConversions() {
        Assertions.assertEquals("32", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "°C", "°F", null)).getConversionResult());
        Assertions.assertEquals("273.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "°C", "K", null)).getConversionResult());
        Assertions.assertEquals("491.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "°C", "°R", null)).getConversionResult());

        Assertions.assertEquals("0.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "32", "°F", "°C", null)).getConversionResult());
        Assertions.assertEquals("273.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "32", "°F", "K", null)).getConversionResult());
        Assertions.assertEquals("491.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "32", "°F", "°R", null)).getConversionResult());

        Assertions.assertEquals("0.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "273.15", "K", "°C", null)).getConversionResult());
        Assertions.assertEquals("32", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "273.15", "K", "°F", null)).getConversionResult());
        Assertions.assertEquals("491.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "273.15", "K", "°R", null)).getConversionResult());

        Assertions.assertEquals("0.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "491.67", "°R", "°C", null)).getConversionResult());
        Assertions.assertEquals("32", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "491.67", "°R", "°F", null)).getConversionResult());
        Assertions.assertEquals("273.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "491.67", "°R", "K", null)).getConversionResult());

        Assertions.assertEquals("212", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "100", "°C", "°F", null)).getConversionResult());
        Assertions.assertEquals("373.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "100", "°C", "K", null)).getConversionResult());
        Assertions.assertEquals("671.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "100", "°C", "°R", null)).getConversionResult());

        Assertions.assertEquals("100.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "212", "°F", "°C", null)).getConversionResult());
        Assertions.assertEquals("373.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "212", "°F", "K", null)).getConversionResult());
        Assertions.assertEquals("671.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "212", "°F", "°R", null)).getConversionResult());

        Assertions.assertEquals("100.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "373.15", "K", "°C", null)).getConversionResult());
        Assertions.assertEquals("212", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "373.15", "K", "°F", null)).getConversionResult());
        Assertions.assertEquals("671.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "373.15", "K", "°R", null)).getConversionResult());
        Assertions.assertEquals("212", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "671.67", "°R", "°F", null)).getConversionResult());
        Assertions.assertEquals("373.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "671.67", "°R", "K", null)).getConversionResult());

        Assertions.assertEquals("-40", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-40", "°C", "°F", null)).getConversionResult());
        Assertions.assertEquals("233.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-40", "°C", "K", null)).getConversionResult());
        Assertions.assertEquals("419.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-40", "°C", "°R", null)).getConversionResult());

        Assertions.assertEquals("-40.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-40", "°F", "°C", null)).getConversionResult());
        Assertions.assertEquals("233.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-40", "°F", "K", null)).getConversionResult());
        Assertions.assertEquals("419.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-40", "°F", "°R", null)).getConversionResult());

        Assertions.assertEquals("-40.0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "419.67", "°R", "°C", null)).getConversionResult());
        Assertions.assertEquals("-40", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "419.67", "°R", "°F", null)).getConversionResult());
        Assertions.assertEquals("233.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "419.67", "°R", "K", null)).getConversionResult());

        Assertions.assertEquals("-273.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "K", "°C", null)).getConversionResult());
        Assertions.assertEquals("-459.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "K", "°F", null)).getConversionResult());
        Assertions.assertEquals("0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "K", "°R", null)).getConversionResult());

        Assertions.assertEquals("0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-273.15", "°C", "K", null)).getConversionResult());
        Assertions.assertEquals("-459.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-273.15", "°C", "°F", null)).getConversionResult());
        Assertions.assertEquals("0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-273.15", "°C", "°R", null)).getConversionResult());

        Assertions.assertEquals("-273.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-459.67", "°F", "°C", null)).getConversionResult());
        Assertions.assertEquals("0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-459.67", "°F", "K", null)).getConversionResult());
        Assertions.assertEquals("0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "-459.67", "°F", "°R", null)).getConversionResult());

        Assertions.assertEquals("-273.15", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "°R", "°C", null)).getConversionResult());
        Assertions.assertEquals("-459.67", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "°R", "°F", null)).getConversionResult());
        Assertions.assertEquals("0", converterService.convertTemperature(
                new UnitConversionDTO("temperature", "0", "°R", "K", null)).getConversionResult());
    }
}