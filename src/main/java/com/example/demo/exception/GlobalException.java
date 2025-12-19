package com.example.exception;

import org.springframework.web.bind.annotation.RestControlleAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@RestControllerAdvice
public class GlobalException{
  
  @ExceptionHandler(ValidationException.class)
public ResponseBody<String> handleValidation
}