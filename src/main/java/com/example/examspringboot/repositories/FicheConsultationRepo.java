package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.FicheConsultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheConsultationRepo extends JpaRepository<FicheConsultation,Long> {
}
