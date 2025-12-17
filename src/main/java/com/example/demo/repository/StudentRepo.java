package com.example.demo.repository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends jpaRepository<StudentEntity,Integer>{

}