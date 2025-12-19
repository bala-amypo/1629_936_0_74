package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timestamp{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    
    @PrePersist
    public void OnCreate(){
    LocalDateTime now=LocalDateTime.now();
    if(this.createAt==null){
        this.createAt=now;
    }
    this.updateAt=now;
    }
    @PreUpdate
    public void OnUpdate(){
    LocalDateTime now=LocalDateTime.now();
      this.updateAt=now;
    }
}