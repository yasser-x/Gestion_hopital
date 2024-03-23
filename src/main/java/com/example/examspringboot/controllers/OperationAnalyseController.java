package com.example.examspringboot.controllers;

import com.example.examspringboot.entities.Consultation;
import com.example.examspringboot.entities.OperationAnalyse;
import com.example.examspringboot.services.ConsultationService;
import com.example.examspringboot.services.OperationAnalyseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OperationAnalyse")
public class OperationAnalyseController {
    private OperationAnalyseService operationAnalyseService ;

    @GetMapping("/")
    public List<OperationAnalyse> getAll(){
        return this.operationAnalyseService.getAll() ;
    }

    @GetMapping("/{id}")
    public  OperationAnalyse getByid(@PathVariable Long id){
        return this.operationAnalyseService.getOperationByID(id) ;
    }

    @PostMapping("/add")
    public OperationAnalyse addOperationAnalyse(@RequestBody OperationAnalyse operationAnalyse) {
        return this.operationAnalyseService.addOperation(operationAnalyse) ;
    }

    @DeleteMapping("/delete")
    public void  deleteOperationAnalyse(@RequestBody  OperationAnalyse operationAnalyse){
        this.operationAnalyseService.deleteOpperation(operationAnalyse);
    }

    @PutMapping("/update")
    public OperationAnalyse updateOperationAnalyse(@RequestBody OperationAnalyse operationAnalyse){
        return this.operationAnalyseService.updateOperation(operationAnalyse) ;
    }
}
