package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;

import com.example.demo.entity.Timestamp;
import com.example.demo.service.TimestampService;


@RestController
public class ValidationController{

    @Autowired TimestampService TR;
    
    @PostMapping("/posting")
    public Timestamp postData(@Valid @RequestBody Timestamp t){
        return valid.postValue1(t);
    }
}