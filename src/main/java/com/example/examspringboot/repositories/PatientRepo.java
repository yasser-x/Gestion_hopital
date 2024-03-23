package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient , Long> {
}
