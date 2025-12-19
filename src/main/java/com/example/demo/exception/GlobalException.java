package com.example.exception;

import org.springframework.web.bind.annotation.RestControlleAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.http.ResponseEntity;
import org.springframework.http.HttpStatus;
@RestControllerAdvice
public class GlobalException{
  
  @ExceptionHandler(ValidationException.class)
  public ResponseEntity<String> handleValidationException(ValidationException ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GTATEWAY);
}
}