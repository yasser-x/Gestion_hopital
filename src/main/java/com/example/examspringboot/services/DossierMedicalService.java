package com.example.examspringboot.services;

import com.example.examspringboot.entities.DossierMedical;
import com.example.examspringboot.entities.FicheDeSoin;
import com.example.examspringboot.repositories.DossierMedicalRepo;
import org.springframework.stereotype.Service;

import javax.xml.crypto.dsig.dom.DOMSignContext;
import java.util.List;

@Service
public class DossierMedicalService {
    private DossierMedicalRepo dossierMedicalRepo;

    public DossierMedicalService() {
    }

    public List<DossierMedical> getAll(){
        return this.dossierMedicalRepo.findAll() ;

    }

    public DossierMedical getDossierByID(Long id){
        return this.dossierMedicalRepo.findById(id).orElseThrow(()->new RuntimeException("pas de dossier"));
    }
    public DossierMedical addDossier(DossierMedical dossierMedical){
        return this.dossierMedicalRepo.save(dossierMedical) ;
    }

    public void deleteDossier(DossierMedical dossierMedical){
        this.dossierMedicalRepo.delete(dossierMedical);
    }
    public DossierMedical updateDossier(DossierMedical dossierMedical){
        if (this.getDossierByID(dossierMedical.getNumero())!= null){
            return this.dossierMedicalRepo.save(dossierMedical) ;

        }
        return null ;
    }

    public List<FicheDeSoin> getAllFiches(DossierMedical dossierMedical){
        return dossierMedical.getFiches() ;
    }
}
