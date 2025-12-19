package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;


@RestController
public class ValidationController{

    @Autowired ValidationService valid;
    
    @PostMapping("/valpost")
    public ValidationEntity postData(@Valid @RequestBody ValidationEntity val){
        return valid.postValue(val);
    }
                                     
    @GetMapping("/getvalid/{id}")
        public ValidationEntity getvaldataid(@PathVariable Long id){
            return valid.getvalData(id);
}
}  
