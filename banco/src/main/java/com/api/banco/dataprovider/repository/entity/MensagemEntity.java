package com.api.banco.dataprovider.repository.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Embeddable
@Data
@Table(name = "mensagem")
public class MensagemEntity {

    private UUID mensagemId;
    private String linha1;

    private String linha2;

    private String linha3;

    private String linha4;

    private String linha5;
}
