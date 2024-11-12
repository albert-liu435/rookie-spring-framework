package com.rookie.bigdata.config.exception;

import com.rookie.bigdata.lang.ClientException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Class GlobalExceptionHandler
 * @Description
 * @Author rookie
 * @Date 2024/11/12 14:17
 * @Version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ClientException.class)
    public ResponseEntity<?> handleClientException(ClientException exception) {
        return ResponseEntity.status(400).body(exception.getMessage());
    }
}
