package com.example.examspringboot.services;

import com.example.examspringboot.entities.FicheDeSoin;
import com.example.examspringboot.entities.Patient;
import com.example.examspringboot.repositories.FicheDeSoinRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FicheDeSoinService {
    private FicheDeSoinRepo ficheDeSoinRepo ;

    public List<FicheDeSoin> getAll() {
        return this.ficheDeSoinRepo.findAll();
    }
    public FicheDeSoin getSoinById(Long id) {
        return this.ficheDeSoinRepo.findById(id).orElseThrow(()->new RuntimeException("pas de fiches de soin")) ;


    }

    public FicheDeSoin addSoin(FicheDeSoin ficheDeSoin){
        return this.ficheDeSoinRepo.save(ficheDeSoin) ;
    }

    public void deleteSoin(FicheDeSoin ficheDeSoin){
        this.ficheDeSoinRepo.delete(ficheDeSoin);
    }

    public FicheDeSoin updateFichedeSoing(FicheDeSoin ficheDeSoin){
        if (this.getSoinById(ficheDeSoin.getNumeroFiche())!= null){
            return this.ficheDeSoinRepo.save(ficheDeSoin) ;
        }
        return  null ;
    }
}
