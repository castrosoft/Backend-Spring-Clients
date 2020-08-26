package com.mybusiness.springboot.backend.apirest.controllers;

import com.mybusiness.springboot.backend.apirest.models.entity.Cliente;
import com.mybusiness.springboot.backend.apirest.models.services.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Esta es mi API Rest
 */

@RestController
//Genero la url (el endpoint)
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private ClienteServiceInterface clienteService;

    //Mapeo la url (el endpoint) al metodo
    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
}
