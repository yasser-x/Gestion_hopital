package com.example.examspringboot.services;

import com.example.examspringboot.entities.Patient;
import com.example.examspringboot.entities.Patient;
import com.example.examspringboot.repositories.PatientRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {
    private PatientRepo patientRepo;

    public PatientService() {
    }

    public List<Patient> getAll() {
        return this.patientRepo.findAll();
    }
    public Patient getPatientById(Long id) {
        return this.patientRepo.findById(id).orElseThrow(()->new RuntimeException("pas de consultation")) ;


    }

    public Patient addPatient(Patient patient){
        return this.patientRepo.save(patient) ;
    }

    public void deletePatient(Patient consultation){
        this.patientRepo.delete(consultation);
    }

    public Patient updatePatient(Patient patient){
        if (this.getPatientById(patient.getId())!= null){
            return this.patientRepo.save(patient) ;
        }
        return  null ;
    }
}
