package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Timestamp;


@Repository
public interface TimstampRepo extends JpaRepository<Timestamp,Long>{

}