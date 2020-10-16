package com.api_mysql.mysql_exmp.services;

import com.api_mysql.mysql_exmp.models.CuentasModel;
import com.api_mysql.mysql_exmp.repositories.CuentaRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService {
    @Autowired
    CuentaRepository CuentaRepository;
    
    public ArrayList<CuentasModel> listaCuentas(){
        return (ArrayList<CuentasModel>) CuentaRepository.findAll();
    }

    public CuentasModel guardarCuenta(CuentasModel Cuenta){
        return CuentaRepository.save(Cuenta);
    }

    public Optional<CuentasModel> obtenerPorId(Long id){
        return CuentaRepository.findById(id);
    }

    
}
