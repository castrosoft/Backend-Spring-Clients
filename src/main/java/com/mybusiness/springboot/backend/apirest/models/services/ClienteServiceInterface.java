package com.mybusiness.springboot.backend.apirest.models.services;

import com.mybusiness.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface ClienteServiceInterface {

    public List<Cliente> findAll();
}
