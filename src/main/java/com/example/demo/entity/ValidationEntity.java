package com.example.demo.Entity;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;  

@Entity
public class ValidationEntity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min =2,max=0,message="must be 2 to 10 character")
    private String username;
    private String email;
    private String password;
    private int age;
}