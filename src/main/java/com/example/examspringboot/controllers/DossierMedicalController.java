package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.DossierMedical;
import com.example.examspringboot.entities.FicheDeSoin;
import com.example.examspringboot.services.ConsultationService;
import com.example.examspringboot.services.DossierMedicalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DossierMedical")
public class DossierMedicalController {
    private DossierMedicalService dossierMedicalService ;

    @GetMapping("/")
    public List<DossierMedical> getAll(){
        return this.dossierMedicalService.getAll() ;
    }

    @GetMapping("/{id}")
    public  DossierMedical getByid(@PathVariable Long id){
        return this.dossierMedicalService.getDossierByID(id) ;
    }

    @GetMapping("{id}/fiches")
    public List<FicheDeSoin> getAllFiches(Long id ){
        DossierMedical dossierMedical = this.dossierMedicalService.getDossierByID(id) ;
        return this.dossierMedicalService.getAllFiches(dossierMedical) ;
    }

    @PostMapping("/add")
    public DossierMedical addDossierMedical(@RequestBody DossierMedical dossierMedical) {
        return this.dossierMedicalService.addDossier(dossierMedical) ;
    }

    @DeleteMapping("/delete")
    public void  deleteDossierMedicalService(@RequestBody  DossierMedical dossierMedical){
        this.dossierMedicalService.deleteDossier(dossierMedical);
    }

    @PutMapping("/update")
    public DossierMedical updateDossierMedical(@RequestBody DossierMedical dossierMedical){
        return this.dossierMedicalService.updateDossier(dossierMedical) ;
    }
}
