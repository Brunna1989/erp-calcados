package com.br.brunna.dornelles.erp.calcados.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    private String nomeCompleto;
    private String CPF;
    private String endereco;
    private String numeroCelular;

}
