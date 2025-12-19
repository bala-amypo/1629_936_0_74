package com.example.exception;

import org.springframework.web.bind.annotation.RestControlleAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@RestControllerAdvice
public class GlobalException{
  
  @ExceptionHandler(ValidationException.class)
  public ResponseBody<String> handleValidationException(ValidationException e){
    return new ResponseBody<String>(e.getMessage(),HttpStatus.BAD_GTATEWAY);
}
}