package com.example.examspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prescription {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id ;
    private String designation ;
    private String periode ;
    private String indication ;



    public Prescription(Long id, String designation, String periode, String indication) {
        Id = id;
        this.designation = designation;
        this.periode = periode;
        this.indication = indication;
    }

    public Prescription() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }
}
