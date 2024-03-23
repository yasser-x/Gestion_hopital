package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.Patient;
import com.example.examspringboot.services.ConsultationService;
import com.example.examspringboot.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")
public class PatientController {
    private PatientService patientService ;

    @GetMapping("/")
    public List<Patient> getAll(){
        return this.patientService.getAll() ;
    }

    @GetMapping("/{id}")
    public  Patient getByid(@PathVariable Long id){
        return this.patientService.getPatientById(id) ;
    }

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return this.patientService.addPatient(patient) ;
    }

    @DeleteMapping("/delete")
    public void  deletePatient(@RequestBody  Patient patient){
        this.patientService.deletePatient(patient);
    }

    @PutMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient){
        return this.patientService.updatePatient(patient) ;
    }
}
