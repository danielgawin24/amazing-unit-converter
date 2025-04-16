package com.example.converter.converter;

import com.example.converter.dataRequestBody.UnitConversionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class ConverterController {

    private final ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @PostMapping("/convertLengthWeight")
    public ResponseEntity<UnitConversionDTO> convertLengthWeight(@RequestBody UnitConversionDTO body) {
        return new ResponseEntity<>(converterService.convertLengthWeight(body), HttpStatus.OK);
    }

    @PostMapping("/convertTemperature")
    public ResponseEntity<UnitConversionDTO> convertTemperature(@RequestBody UnitConversionDTO body) {
        return new ResponseEntity<>(converterService.convertTemperature(body), HttpStatus.OK);
    }
}
