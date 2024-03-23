package com.example.examspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class OperationAnalyse {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String description ;
    private Date dateheureOperation ;
    private String resultat;

    public OperationAnalyse(Long id, String description, Date dateheureOperation, String resultat) {
        this.id = id;
        this.description = description;
        this.dateheureOperation = dateheureOperation;
        this.resultat = resultat;
    }

    public OperationAnalyse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateheureOperation() {
        return dateheureOperation;
    }

    public void setDateheureOperation(Date dateheureOperation) {
        this.dateheureOperation = dateheureOperation;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
}
