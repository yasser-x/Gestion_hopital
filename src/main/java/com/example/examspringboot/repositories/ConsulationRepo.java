package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsulationRepo extends JpaRepository<Consultation,Long> {
}
