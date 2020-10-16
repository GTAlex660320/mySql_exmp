package com.api_mysql.mysql_exmp.services;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.CreditosModel;
import com.api_mysql.mysql_exmp.repositories.CreditoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditoService {
    @Autowired
    CreditoRepository CreditoRepository;
    
    public ArrayList<CreditosModel> listaCreditos(){
        return (ArrayList<CreditosModel>) CreditoRepository.findAll();
    }

    public CreditosModel guardarCredito(CreditosModel Credito){
        return CreditoRepository.save(Credito);
    }

    public Optional<CreditosModel> obtenerPorId(Long id){
        return CreditoRepository.findById(id);
    }
    
}
