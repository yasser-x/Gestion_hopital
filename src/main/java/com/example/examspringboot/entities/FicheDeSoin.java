package com.example.examspringboot.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance
public class FicheDeSoin {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numeroFiche ;
    private Date dateDeCreation ;
    private String AgentCreateur ;
    private String adresseCreateur ;
    @OneToMany(fetch = FetchType.EAGER)
    private List<FicheDeSoin> fichesPayes = new ArrayList<>();

    public FicheDeSoin() {
    }

    public FicheDeSoin(Long numeroFiche, Date dateDeCreation, String agentCreateur, String adresseCreateur) {
        this.numeroFiche = numeroFiche;
        this.dateDeCreation = dateDeCreation;
        AgentCreateur = agentCreateur;
        this.adresseCreateur = adresseCreateur;
    }

    public Long getNumeroFiche() {
        return numeroFiche;
    }

    public void setNumeroFiche(Long numeroFiche) {
        this.numeroFiche = numeroFiche;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public String getAgentCreateur() {
        return AgentCreateur;
    }

    public void setAgentCreateur(String agentCreateur) {
        AgentCreateur = agentCreateur;
    }

    public String getAdresseCreateur() {
        return adresseCreateur;
    }

    public void setAdresseCreateur(String adresseCreateur) {
        this.adresseCreateur = adresseCreateur;
    }

    public List<FicheDeSoin> getFichesPayes() {
        return fichesPayes;
    }

    public void setFichesPayes(List<FicheDeSoin> fichesPayes) {
        this.fichesPayes = fichesPayes;
    }
}
