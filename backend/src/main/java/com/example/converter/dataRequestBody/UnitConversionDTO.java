package com.example.converter.dataRequestBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitConversionDTO {

    private String type;
    private String value;
    private String fromUnit;
    private String toUnit;
    private String conversionResult;
}
