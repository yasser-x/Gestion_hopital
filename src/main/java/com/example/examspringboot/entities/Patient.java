package com.example.examspringboot.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Patient {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    private String prenom ;

    private String nss ;
    private Date dateNaissance ;
    private  char sex ;
    private String adresse ;
    private int numTelephone ;
    @OneToOne
    private DossierMedical dossier ;

    public Patient() {
    }

    public Patient(Long id, String nom, String prenom, String nss, Date dateNaissance, char sex, String adresse, int numTelephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nss = nss;
        this.dateNaissance = dateNaissance;
        this.sex = sex;
        this.adresse = adresse;
        this.numTelephone = numTelephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }

    public DossierMedical getDossier() {
        return dossier;
    }

    public void setDossier(DossierMedical dossier) {
        this.dossier = dossier;
    }
}
