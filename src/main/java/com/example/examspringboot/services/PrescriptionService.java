package com.example.examspringboot.services;

import com.example.examspringboot.entities.Prescription;
import com.example.examspringboot.repositories.PrescriptionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    private PrescriptionRepo prescriptionRepo ;

    public PrescriptionService() {
    }

    public List<Prescription> getAll(Long id) {
        return this.prescriptionRepo.findAll();
    }
    public Prescription getPrescriptionById(Long id) {
        return this.prescriptionRepo.findById(id).orElseThrow(()->new RuntimeException("pas de prescription")) ;


    }

    public Prescription addPrescription(Prescription prescription){
        return this.prescriptionRepo.save(prescription) ;
    }

    public void deletePrescription(Prescription prescription){
        this.prescriptionRepo.delete(prescription);
    }

    public Prescription updatePrescription(Prescription prescription){
        if (this.getAll(prescription.getId())!= null){
            return this.prescriptionRepo.save(prescription) ;
        }
        return  null ;
    }
}
