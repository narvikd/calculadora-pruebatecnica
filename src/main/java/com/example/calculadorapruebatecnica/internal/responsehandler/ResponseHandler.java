package com.example.calculadorapruebatecnica.internal.responsehandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> genResponse(HttpStatus status, boolean success, String message, Object data) {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("success", success);
            map.put("message", message);
            map.put("data", data);
            return new ResponseEntity<>(map, status);
        } catch (Exception e) {
            map.clear();
            map.put("success", false);
            map.put("message", "server couldn't process request");
            map.put("data", null);
            return new ResponseEntity<>(map, status);
        }
    }

    public static ResponseEntity<Object> genResponse(HttpStatus status, boolean success, String message) {
        return genResponse(status, success, message, "");
    }
}
