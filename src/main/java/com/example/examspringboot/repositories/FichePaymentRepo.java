package com.example.examspringboot.repositories;

import com.example.examspringboot.entities.FichePayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichePaymentRepo extends JpaRepository<FichePayment,Long> {
}
