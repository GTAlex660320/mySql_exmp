package com.api_mysql.mysql_exmp.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.CuentasModel;
import com.api_mysql.mysql_exmp.services.CuentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/Cuenta")
public class CuentaController {
    @Autowired
    CuentaService CuentaService;

    @GetMapping()
    public ArrayList<CuentasModel> listaCuentas(){
        return CuentaService.listaCuentas();
    }

    @PostMapping()
    public CuentasModel guardarMovimiento(@RequestBody CuentasModel Cuenta){
        return this.CuentaService.guardarCuenta(Cuenta);
    }

    @GetMapping( path = "/{id}")
    public Optional<CuentasModel> obtenerCuentaPorId(@PathVariable("id") Long id) {
        return this.CuentaService.obtenerPorId(id);
    }


}