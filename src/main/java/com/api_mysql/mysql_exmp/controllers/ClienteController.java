package com.api_mysql.mysql_exmp.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.ClientesModel;
import com.api_mysql.mysql_exmp.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    @Autowired
    ClienteService ClienteService;

    @GetMapping()
    public ArrayList<ClientesModel> listaClientes(){
        return ClienteService.listaClientes();
    }

    @PostMapping()
    public ClientesModel guardarCliente(@RequestBody ClientesModel Cliente){
        
        return this.ClienteService.guardarCliente(Cliente);
    }

    @GetMapping( path = "/{id}")
    public Optional<ClientesModel> obtenerClientePorId(@PathVariable("id") Long id) {
        return this.ClienteService.obtenerPorId(id);
    }

}
