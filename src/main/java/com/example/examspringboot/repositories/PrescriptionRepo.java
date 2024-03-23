package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepo extends JpaRepository<Prescription ,Long> {
}
