package com.mybusiness.springboot.backend.apirest.controllers;

import com.mybusiness.springboot.backend.apirest.models.entity.Cliente;
import com.mybusiness.springboot.backend.apirest.models.services.ClienteService;
import com.mybusiness.springboot.backend.apirest.models.services.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Esta es mi API Rest
 */

//Implemento CORS. Doy acceso a este dominio (Front de Angular) para que pueda enviar/recibir datos. Por default, permito todo
@CrossOrigin(origins = {"http://localhost:4200"})
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


    @GetMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente show(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id){
        Cliente clienteActual = clienteService.findById(id);

        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setEmail(cliente.getEmail());

        return clienteService.save(clienteActual);
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }
}
