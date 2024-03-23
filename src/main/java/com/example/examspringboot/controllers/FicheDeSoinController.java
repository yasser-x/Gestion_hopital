package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.FicheDeSoin;
import com.example.examspringboot.services.FicheDeSoinService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/FicheDeSoin")
public class FicheDeSoinController {
    private FicheDeSoinService ficheDeSoinService ;

    @GetMapping("/")
    public List<FicheDeSoin> getAll(){
        return this.ficheDeSoinService.getAll() ;
    }

    @GetMapping("/{id}")
    public FicheDeSoin getByid(@PathVariable Long id){
        return this.ficheDeSoinService.getSoinById(id) ;
    }

    @PostMapping("/add")
    public FicheDeSoin addFicheDeSoin(@RequestBody FicheDeSoin ficheDeSoin) {
        return this.ficheDeSoinService.addSoin(ficheDeSoin) ;
    }

    @DeleteMapping("/delete")
    public void  deleteFicheDESoin(@RequestBody  FicheDeSoin ficheDeSoin){
        this.ficheDeSoinService.deleteSoin(ficheDeSoin);
    }

    @PutMapping("/update")
    public FicheDeSoin updateFicheSoin(@RequestBody FicheDeSoin ficheDeSoin){
        return this.ficheDeSoinService.updateFichedeSoing(ficheDeSoin) ;
    }

}
