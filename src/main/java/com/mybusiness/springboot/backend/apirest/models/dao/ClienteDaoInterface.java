package com.mybusiness.springboot.backend.apirest.models.dao;

import com.mybusiness.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 * Esta interface es para acceso CRUD a una DB
 * El CrudRepository tiene todos los metodos CRUD
 */

public interface ClienteDaoInterface extends CrudRepository <Cliente, Long>{

}
