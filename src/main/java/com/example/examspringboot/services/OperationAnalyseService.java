package com.example.examspringboot.services;

import com.example.examspringboot.entities.OperationAnalyse;
import com.example.examspringboot.repositories.OperationAnalyseRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OperationAnalyseService {
    private OperationAnalyseRepo operationAnalyseRepo ;

    public OperationAnalyseService() {
    }

    public List<OperationAnalyse> getAll(){
        return this.operationAnalyseRepo.findAll() ;
    }

    public OperationAnalyse getOperationByID(Long id){
        return this.operationAnalyseRepo.findById(id).orElseThrow(()->new RuntimeException("pas d'opérations"));

    }

    public OperationAnalyse addOperation(OperationAnalyse operationAnalyse){
        return this.operationAnalyseRepo.save(operationAnalyse) ;
    }

    public void deleteOpperation(OperationAnalyse operationAnalyse){
        this.operationAnalyseRepo.delete(operationAnalyse);
    }

    public OperationAnalyse updateOperation(OperationAnalyse operationAnalyse){
        if (this.getOperationByID(operationAnalyse.getId())!= null){
            return this.operationAnalyseRepo.save(operationAnalyse) ;
        }
        return  null ;
    }


}
