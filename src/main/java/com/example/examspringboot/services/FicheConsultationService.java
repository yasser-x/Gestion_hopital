package com.example.examspringboot.services;

import com.example.examspringboot.entities.FicheConsultation;
import com.example.examspringboot.repositories.FicheConsultationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FicheConsultationService {
    private FicheConsultationRepo ficheConsultationRepo ;

    public FicheConsultationService() {
    }
    public List<FicheConsultation> getAll(){
        return  this.ficheConsultationRepo.findAll() ;
    }

    public FicheConsultation getConsultationById(Long id){
        return this.ficheConsultationRepo.findById(id).orElseThrow(()->new RuntimeException("Consultation"));
    }

    public FicheConsultation addConsultation(FicheConsultation ficheConsultation){
        return this.ficheConsultationRepo.save(ficheConsultation) ;
    }

    public void  deleteFicheConsultation(FicheConsultation ficheConsultation){
        this.ficheConsultationRepo.delete(ficheConsultation) ;
    }

    public FicheConsultation updateFicheConsulation(FicheConsultation ficheConsultation){
        if (this.getConsultationById(ficheConsultation.getNumeroFiche())!= null){
            return this.ficheConsultationRepo.save(ficheConsultation) ;
        }
        return null ;
    }


}
