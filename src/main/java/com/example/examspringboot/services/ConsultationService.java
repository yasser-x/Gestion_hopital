package com.example.examspringboot.services;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.DossierMedical;
import com.example.examspringboot.entities.FicheConsultation;
import com.example.examspringboot.entities.Patient;
import com.example.examspringboot.repositories.ConsulationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {
    private ConsulationRepo consulationRepo;
    private DossierMedicalService dossierMedicalService ;

    private PatientService patientService ;
    private FicheConsultationService ficheConsultationService ;



    public ConsultationService() {
    }
    public List<Consultation> getAll() {
        return this.consulationRepo.findAll();
     }
    public Consultation getConsultationById(Long id) {
        return this.consulationRepo.findById(id).orElseThrow(()->new RuntimeException("pas de consultation")) ;


    }

    public Consultation addConsultation(Consultation consultation){
        return this.consulationRepo.save(consultation) ;
    }

    public void deleteConsultation(Consultation consultation){
        this.consulationRepo.delete(consultation);
    }

    public Consultation updateConsultation(Consultation consultation){
        if (this.getConsultationById(consultation.getId())!= null){
            return this.consulationRepo.save(consultation) ;
        }
        return  null ;
    }

    public void demandeConsultation(Long patientId ){
        Patient patient = this.patientService.getPatientById(patientId) ;
        DossierMedical dossierMedical = patient.getDossier();
        FicheConsultation ficheConsultation = new FicheConsultation() ;
        Consultation consultation= new Consultation() ;
        ficheConsultation.setOrigineFiche(consultation);
        this.ficheConsultationService.addConsultation(ficheConsultation) ;
        this.addConsultation(consultation) ;
        this.patientService.addPatient(patient);
        this.dossierMedicalService.addDossier(dossierMedical) ;

    }

    public void annulerConsultation(Long consultationId){
        Consultation consultation = this.getConsultationById(consultationId) ;
        this.deleteConsultation(consultation);

    }



}
