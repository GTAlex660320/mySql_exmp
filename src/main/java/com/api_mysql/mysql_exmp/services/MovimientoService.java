package com.api_mysql.mysql_exmp.services;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.MovimientosModel;
import com.api_mysql.mysql_exmp.repositories.MovimientoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimientoService {
    @Autowired
    MovimientoRepository MovimientoRepository;
    
    public ArrayList<MovimientosModel> listaMovimientos(){
        return (ArrayList<MovimientosModel>) MovimientoRepository.findAll();
    }

    public MovimientosModel guardarMovimiento(MovimientosModel Movimiento){
        return MovimientoRepository.save(Movimiento);
    }

    public Optional<MovimientosModel> obtenerPorId(Long id){
        return MovimientoRepository.findById(id);
    }
    
}
