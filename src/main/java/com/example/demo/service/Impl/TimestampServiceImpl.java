package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.TimestampService;
import com.example.demo.entity.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimestampRepo;

@Service
public class TimestampServiceImpl implements TimestampService{
    @Autowired TimestampRepo TR; 
    @Override
     public Timestamp postValue1(Timestamp t){
        return TR.save(t);
     }
}
          