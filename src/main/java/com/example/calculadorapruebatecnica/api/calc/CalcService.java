package com.example.calculadorapruebatecnica.api.calc;

import com.example.calculadorapruebatecnica.internal.responsehandler.ResponseHandler;
import io.corp.calculator.TracerImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@AllArgsConstructor
@Service
public class CalcService {
    public ResponseEntity<Object> calc(String operation, BigDecimal num1, BigDecimal num2) {
        if (num1 == null || num2 == null) {
            return ResponseHandler.genResponse(
                    HttpStatus.BAD_REQUEST, false, "num1 and num2 are required"
            );
        }

        BigDecimal result;

        switch (operation) {
            case "add":
                result = add(num1, num2);
                break;
            case "subtract":
                result = subtract(num1, num2);
                break;
            case "multiply":
                result = multiply(num1, num2);
                break;
            case "divide":
                if (num2.equals(BigDecimal.ZERO)) {
                    return ResponseHandler.genResponse(HttpStatus.BAD_REQUEST, false,
                            "Division by zero not allowed");
                }
                result = divide(num1, num2);
                break;
            default:
                return ResponseHandler.genResponse(HttpStatus.BAD_REQUEST, false,
                        "Operation not recognized");
        }

        invokeTracer(result);

        return ResponseHandler.genResponse(HttpStatus.OK, true, "Calculation successful", result);
    }

    private BigDecimal add(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    private BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    private BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    private BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        final int decimals = 2;
        return num1.divide(num2, decimals, RoundingMode.HALF_EVEN);
    }

    private void invokeTracer(BigDecimal result) {
        TracerImpl tracer = new TracerImpl();
        tracer.trace(result);
    }
}
