package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.FicheDeSoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheDeSoinRepo extends JpaRepository<FicheDeSoin, Long> {
}
