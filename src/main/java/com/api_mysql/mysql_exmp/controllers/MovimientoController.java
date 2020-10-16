package com.api_mysql.mysql_exmp.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.MovimientosModel;
import com.api_mysql.mysql_exmp.services.MovimientoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Movimiento")
public class MovimientoController {
    @Autowired
    MovimientoService MovimientoService;

    @GetMapping()
    public ArrayList<MovimientosModel> listaMovimientos(){
        System.out.println("Enviando Movimiento");
        return MovimientoService.listaMovimientos();
    }

    @PostMapping()
    public MovimientosModel guardarMovimiento(@RequestBody MovimientosModel Movimiento){
        return this.MovimientoService.guardarMovimiento(Movimiento);
    }

    @GetMapping( path = "/{id}")
    public Optional<MovimientosModel> obtenerMovimientoPorId(@PathVariable("id") Long id) {
        return this.MovimientoService.obtenerPorId(id);
    }

}