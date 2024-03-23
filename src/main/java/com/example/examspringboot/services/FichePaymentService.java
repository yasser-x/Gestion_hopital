package com.example.examspringboot.services;

import com.example.examspringboot.entities.FicheConsultation;
import com.example.examspringboot.entities.FichePayment;
import com.example.examspringboot.repositories.FicheConsultationRepo;
import com.example.examspringboot.repositories.FichePaymentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichePaymentService {
    private FichePaymentRepo fichePaymentRepo;

    public FichePaymentService() {
    }
    public FichePayment getFichePaymentByid(Long id){
        return this.fichePaymentRepo.findById(id).orElseThrow(()->new RuntimeException("pas de fiches de payment")) ;
    }

    public List<FichePayment>  getAll(){
        return  this.fichePaymentRepo.findAll() ;
    }

    public FichePayment addFichePayment(FichePayment fichePayment){
        return this.fichePaymentRepo.save(fichePayment) ;
    }

    public void deleteFichePayment(FichePayment fichePayment) {
        this.fichePaymentRepo.delete(fichePayment) ;
    }

    public FichePayment updateFichePayment( FichePayment fichePayment){
        if (this.getFichePaymentByid(fichePayment.getNumeroFiche())!= null){
            return this.fichePaymentRepo.save(fichePayment);
        }
        return  null ;
    }

    public double getMontantPaye(FichePayment fichePayment){
        return fichePayment.getMontantPaye();
    }

}
