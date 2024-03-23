package com.example.examspringboot.entities;

import jakarta.persistence.Entity;

import java.util.Date;
@Entity
public class FichePayment extends FicheDeSoin{
    private Date dateExigibilite;
    private Date datePayment ;
    private double montantPaye ;
    private boolean indicateurPayment ;

    public FichePayment() {
    }

    public FichePayment(Long numeroFiche, Date dateDeCreation, String agentCreateur, String adresseCreateur, Date dateExigibilite, Date datePayment, double montantPaye, boolean indicateurPayment) {
        super(numeroFiche, dateDeCreation, agentCreateur, adresseCreateur);
        this.dateExigibilite = dateExigibilite;
        this.datePayment = datePayment;
        this.montantPaye = montantPaye;
        this.indicateurPayment = indicateurPayment;
    }

    public Date getDateExigibilite() {
        return dateExigibilite;
    }

    public void setDateExigibilite(Date dateExigibilite) {
        this.dateExigibilite = dateExigibilite;
    }

    public Date getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public boolean isIndicateurPayment() {
        return indicateurPayment;
    }

    public void setIndicateurPayment(boolean indicateurPayment) {
        this.indicateurPayment = indicateurPayment;
    }
}
