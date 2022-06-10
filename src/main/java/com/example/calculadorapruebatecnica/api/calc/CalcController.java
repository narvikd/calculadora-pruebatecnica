package com.example.calculadorapruebatecnica.api.calc;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
@AllArgsConstructor
@RequestMapping("/v1")
public class CalcController {
    private final CalcService calcService;

    @PostMapping(value = "/{operation}")
    public ResponseEntity<Object> calc(
            @PathVariable("operation") String operation,
            @RequestParam(required = false, name = "num1") BigDecimal num1,
            @RequestParam(required = false, name = "num2") BigDecimal num2) {
        return calcService.calc(operation, num1, num2);
    }
}
