package com.br.brunna.dornelles.erp.calcados.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String descricao;
    private String marca;
    private String modelo;
    private Integer numeracao;
    private String cor;
    private Double preco;
    private String quantidadeEstoque;
}
