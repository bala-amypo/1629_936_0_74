package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.Restcontroller;
import org.springframework.web.bind.annotation.Restcontroller;

@Restcontroller
public class StudentController{
 @Autowired StudentService ser;

 @PostMapping("/post")

 public StudentEntity sendData(@RequestBody StudentEntity stu){
    return ser.postData(stu);
 }
}