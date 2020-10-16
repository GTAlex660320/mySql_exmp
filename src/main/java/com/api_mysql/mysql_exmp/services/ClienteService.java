
package com.api_mysql.mysql_exmp.services;

import java.util.ArrayList;
import java.util.Optional;

import com.api_mysql.mysql_exmp.models.ClientesModel;
import com.api_mysql.mysql_exmp.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository ClienteRepository;
    
    public ArrayList<ClientesModel> listaClientes(){
        return (ArrayList<ClientesModel>) ClienteRepository.findAll();
    }

    public ClientesModel guardarCliente(ClientesModel Cliente){
        return ClienteRepository.save(Cliente);
    }

    public Optional<ClientesModel> obtenerPorId(Long id){
        return ClienteRepository.findById(id);
    }

    //public ArrayList<ClientesModel> obtenerPorRFC(String rfc) {
    //    return ClienteRepository.findByRfc(rfc);
    //}

    
}
