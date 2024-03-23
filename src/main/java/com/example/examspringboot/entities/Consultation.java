package com.example.examspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Consultation {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date dateConsultation ;
    private String heure ;
    private String lieu ;
    private char etatConsult ;

    public Consultation(Long id, Date dateConsultation, String heure, String lieu, char etatConsult) {
        this.id = id;
        this.dateConsultation = dateConsultation;
        this.heure = heure;
        this.lieu = lieu;
        this.etatConsult = etatConsult;
    }

    public Consultation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public char getEtatConsult() {
        return etatConsult;
    }

    public void setEtatConsult(char etatConsult) {
        this.etatConsult = etatConsult;
    }
}
