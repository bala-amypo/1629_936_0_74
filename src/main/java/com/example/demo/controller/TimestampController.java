package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.TimestampService;


@RestController
public class TimestampController{

    @Autowired TimestampService TR;
    
    @PostMapping("/posting")
    public Timestamp postData(@RequestBody Timestamp t){
        return TR.postValue1(t);
    }
}