package com.example.exception;

import org.springframework.web.bind.annotation.RestControlleAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;
@RestControllerAdvice
public class GlobalException{
  
  @ExceptionHandler(ValidationException.class)
  public ResponseEntity<String> handleValidationException(ValidationException e){
    return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_GTATEWAY);
}
}