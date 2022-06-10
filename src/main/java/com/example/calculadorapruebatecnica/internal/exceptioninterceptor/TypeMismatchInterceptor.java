package com.example.calculadorapruebatecnica.internal.exceptioninterceptor;

import com.example.calculadorapruebatecnica.internal.responsehandler.ResponseHandler;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class TypeMismatchInterceptor extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
                                                        HttpStatus status, WebRequest request) {

        return ResponseHandler.genResponse(status, false, "Parameters must be numbers");
    }
}
