// package com.example.demo.entity;

// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
// import lombok.Data;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.JoinColumn;

// @Entity
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class IdEntity{
//      @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Integer id;
//     private int cardNo;
// //     private int student_id;
//     @OneToOne
//     @JoinColumn(name="student_id")
//     private stuEntity stu;
//     }