package com.api_mysql.mysql_exmp.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.CreditosModel;
import com.api_mysql.mysql_exmp.services.CreditoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Credito")
public class CreditoController {
    @Autowired
    CreditoService CreditoService;

    @GetMapping()
    public ArrayList<CreditosModel> listaCreditos(){
        return CreditoService.listaCreditos();
    }

    @PostMapping()
    public CreditosModel guardarCredito(@RequestBody CreditosModel Credito){
        return this.CreditoService.guardarCredito(Credito);
    }

    @GetMapping( path = "/{id}")
    public Optional<CreditosModel> obtenerCreditoPorId(@PathVariable("id") Long id) {
        return this.CreditoService.obtenerPorId(id);
    }

}