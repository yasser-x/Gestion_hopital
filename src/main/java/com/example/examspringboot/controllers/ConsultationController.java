package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.services.ConsultationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Consultation")
public class ConsultationController {
    private ConsultationService consultationService ;

    @GetMapping("/")
    public List<Consultation> getAll(){
        return this.consultationService.getAll() ;
    }

    @GetMapping("/{id}")
    public  Consultation getByid(@PathVariable Long id){
        return this.consultationService.getConsultationById(id) ;
    }

    @PostMapping("/add")
    public Consultation addConsultation(@RequestBody Consultation consultation) {
        return this.consultationService.addConsultation(consultation) ;
    }

    @DeleteMapping("/delete")
    public void  deleteConsultation(@RequestBody  Consultation consultation){
        this.consultationService.deleteConsultation(consultation);
    }

    @PutMapping("demandeConsultation")
    public void demandeConsultation(@RequestBody Long PatientId){
        this.consultationService.demandeConsultation(PatientId);

    }



    @PutMapping("/update")
    public Consultation updateConsultation(@RequestBody Consultation consultation){
        return this.consultationService.updateConsultation(consultation) ;
    }
}
