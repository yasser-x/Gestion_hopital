package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.OperationAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.expression.Operation;

public interface OperationAnalyseRepo extends JpaRepository<OperationAnalyse, Long> {
}
