package com.estudo.microservices.application.service;

import com.estudo.microservices.domain.Cliente;

import java.util.Optional;

public interface ClienteService {

    String save(Cliente cliente);
    Optional<Cliente> getByCpf(String cpf);
}
