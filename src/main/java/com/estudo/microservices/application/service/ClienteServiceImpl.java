package com.estudo.microservices.application.service;

import com.estudo.microservices.domain.Cliente;
import com.estudo.microservices.infra.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository clienteRepository;

    @Transactional
    @Override
    public String save(Cliente cliente) {
        try {
            clienteRepository.save(cliente);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        return "Cliente salvo com sucesso";

    }

    @Override
    public Optional<Cliente> getByCpf(String cpf) {
        return clienteRepository
                .findByCpf(cpf);
    }
}
