package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.DossierMedical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierMedicalRepo extends JpaRepository<DossierMedical , Long> {
}
