package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.FichePayment;
import com.example.examspringboot.services.ConsultationService;
import com.example.examspringboot.services.FichePaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FichePayment")
public class FichePaymentController {
    private FichePaymentService fichePaymentService ;

    @GetMapping("/")
    public List<FichePayment> getAll(){
        return this.fichePaymentService.getAll() ;
    }

    @GetMapping("/{id}")
    public  FichePayment getByid(@PathVariable Long id){
        return this.fichePaymentService.getFichePaymentByid(id) ;
    }

    @PostMapping("/add")
    public FichePayment addFichePayment(@RequestBody FichePayment fichePayment) {
        return this.fichePaymentService.addFichePayment(fichePayment) ;
    }

    @DeleteMapping("/delete")
    public void  deleteFichePayment(@RequestBody  FichePayment fichePayment){
        this.fichePaymentService.deleteFichePayment(fichePayment);
    }

    @PutMapping("/update")
    public FichePayment updateFichePayment(@RequestBody FichePayment fichePayment){
        return this.fichePaymentService.updateFichePayment(fichePayment) ;
    }
}
