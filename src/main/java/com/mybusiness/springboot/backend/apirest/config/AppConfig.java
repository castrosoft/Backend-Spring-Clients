package com.mybusiness.springboot.backend.apirest.config;

import com.mybusiness.springboot.backend.apirest.models.entity.Cliente;
import com.mybusiness.springboot.backend.apirest.models.services.ClienteService;
import com.mybusiness.springboot.backend.apirest.models.services.ClienteServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public ClienteServiceInterface createClienteServiceInterface(){
        return new ClienteService();
    }

}
