package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.FicheConsultation;
import com.example.examspringboot.services.ConsultationService;
import com.example.examspringboot.services.FicheConsultationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FicheConsultation")
public class FicheConsultationController {
    private FicheConsultationService ficheConsultationService ;



    @GetMapping("/")
    public List<FicheConsultation> getAll(){
        return this.ficheConsultationService.getAll() ;
    }

    @GetMapping("/{id}")
    public  FicheConsultation getByid(@PathVariable Long id){
        return this.ficheConsultationService.getConsultationById(id) ;
    }

    @PostMapping("/add")
    public FicheConsultation addConsultation(@RequestBody FicheConsultation ficheConsultation) {
        return this.ficheConsultationService.addConsultation(ficheConsultation) ;
    }

    @DeleteMapping("/delete")
    public void  deleteFicheConsultation(@RequestBody  FicheConsultation ficheConsultation){
        this.ficheConsultationService.deleteFicheConsultation(ficheConsultation);
    }

    @PutMapping("/update")
    public FicheConsultation updateFicheConsultation(@RequestBody FicheConsultation ficheConsultation){
        return this.ficheConsultationService.updateFicheConsulation(ficheConsultation);
    }

}
