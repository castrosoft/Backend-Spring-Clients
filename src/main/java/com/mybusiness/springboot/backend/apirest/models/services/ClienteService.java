package com.mybusiness.springboot.backend.apirest.models.services;

import com.mybusiness.springboot.backend.apirest.models.dao.ClienteDaoInterface;
import com.mybusiness.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteDaoInterface clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
