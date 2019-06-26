package com.mateusz.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = ResponseParseException.class)
    protected ResponseEntity<ErroResponse> parsingError(ResponseParseException e) {
        return new ResponseEntity<>(new ErroResponse("600", "INVALID_USER_DATA", "Error during parsing user data"), HttpStatus.OK);
    }
}
