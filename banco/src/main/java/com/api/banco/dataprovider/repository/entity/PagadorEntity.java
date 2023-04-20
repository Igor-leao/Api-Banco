package com.api.banco.dataprovider.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static jakarta.persistence.CascadeType.ALL;

@Embeddable
@Data
@Entity
@Table(name = "pagador")
public class PagadorEntity {
    @Id
private UUID pagadorId;
    private String cpfCnpj;
    @OneToMany(cascade=ALL, mappedBy = "pagador")
    private List<BoletosEntity> boletos = new ArrayList<>();
    private String tipoPessoa;
    private String nome;
    private String endereco;
    private String uf;
    private String cep;
    private String cidade;

}
