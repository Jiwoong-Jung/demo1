package com.example.demo.repository;

import com.example.demo.entity.MyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDataRepository extends JpaRepository<MyData, Long> {
}
