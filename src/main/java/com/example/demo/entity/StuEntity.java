package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
// import java.time.LocalDateTime;
import jakarta.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class stuEntity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private String name;
    private String email;
    private String address;
    }