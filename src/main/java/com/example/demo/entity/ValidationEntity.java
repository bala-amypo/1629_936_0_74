package com.example.demo.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.validation.constraints.NotNull; 
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min =2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min = 2)
    @NotNull
    private String password;
    @Max(30)
    @Positive(message="age must be a positive number")
    private int age;
}