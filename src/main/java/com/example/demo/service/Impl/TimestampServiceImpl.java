package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
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
          