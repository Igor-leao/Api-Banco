package com.api.banco.dataprovider.repository.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Embeddable
@Entity
@Table(name = "mora")
public class MoraEntity {

    @EqualsAndHashCode.Include
    @Id
    private UUID moraId;
    private CodigoMoraEntity codigoMora;
    @ManyToOne
    @JoinColumn(name = "boletosID", nullable = false)
    private BoletosEntity boletos;
    private String data;
    private Long taxa;
    private Long valor;
}
