package com.example.exception;

import org.springframework.web.bind.annotation.RestControlleAdvice;
@RestControllerAdvice
public class GlobalException{
  
  @Exceptionhandler(ValidationException.class)

}