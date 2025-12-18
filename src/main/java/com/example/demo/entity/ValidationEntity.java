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
    @Size(min = 5, max=10,message="password length must be between 5 to 10")
    @NotNull
    private String password;
    @Max(30)
    @Positive(message="age must be a positive number")
    private int age;

    public Integer getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}
public String getUsername(){
    return name;
}
public void setUsername(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}

public ValidationEntity(){

}
public ValidationEntity(Long id,String name,String email,String password){
    this.id=id;
    this.username=username;
    this.email=email;
    this.password=password;
    
}
}