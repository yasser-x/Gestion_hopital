package com.example.examspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class FicheConsultation extends FicheDeSoin{
    private String CompteRendu  ;

    public FicheConsultation() {
    }
    @OneToMany(fetch = FetchType.EAGER)
    private List<Prescription> prescriptions ;

    @OneToOne(fetch = FetchType.EAGER)
    private Consultation origineFiche ;

    @OneToMany( fetch = FetchType.EAGER)
    private List<OperationAnalyse> analyses = new ArrayList<>() ;

    public FicheConsultation(Long numeroFiche, Date dateDeCreation, String agentCreateur, String adresseCreateur, String compteRendu) {
        super(numeroFiche, dateDeCreation, agentCreateur, adresseCreateur);
        CompteRendu = compteRendu;
    }

    public String getCompteRendu() {
        return CompteRendu;
    }

    public void setCompteRendu(String compteRendu) {
        CompteRendu = compteRendu;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public Consultation getOrigineFiche() {
        return origineFiche;
    }

    public void setOrigineFiche(Consultation origineFiche) {
        this.origineFiche = origineFiche;
    }

    public List<OperationAnalyse> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<OperationAnalyse> analyses) {
        this.analyses = analyses;
    }
}
