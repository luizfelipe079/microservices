package com.estudo.microservices.dto;

import com.estudo.microservices.domain.Cliente;
import lombok.Data;

@Data
public class ClienteRequest {

    private String cpf;
    private String nome;
    private int idade;

    public Cliente convertToModel(){
        return new Cliente(null, this.cpf, this.nome, this.idade);
}
}
