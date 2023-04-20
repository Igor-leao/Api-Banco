package com.api.banco.dataprovider.repository.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

import java.util.UUID;
@Embeddable
@Entity
@Table(schema = "descontos")
public class DescontosEntity {
    @EqualsAndHashCode.Include
    @Id
    private UUID descontoId;
    private CodigoDescontoEntity codigoDesconto;
    private Long valor;
    private Long taxa;

}
