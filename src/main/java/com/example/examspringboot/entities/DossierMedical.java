package com.example.examspringboot.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class DossierMedical {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero  ;
    private Date dateCreation ;
    private String codeAccessPatient ;
    @OneToMany@Column(name = "fiches")
    private List<FicheDeSoin> fiches  = new ArrayList<>() ;

    public DossierMedical() {
    }


    public DossierMedical(Long numero, Date dateCreation, String codeAccessPatient) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.codeAccessPatient = codeAccessPatient;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getCodeAccessPatient() {
        return codeAccessPatient;
    }

    public void setCodeAccessPatient(String codeAccessPatient) {
        this.codeAccessPatient = codeAccessPatient;
    }

    public List<FicheDeSoin> getFiches() {
        return fiches;
    }

    public void setFiches(List<FicheDeSoin> fiches) {
        this.fiches = fiches;
    }
}
