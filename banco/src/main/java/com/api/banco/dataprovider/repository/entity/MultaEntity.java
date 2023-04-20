package com.api.banco.dataprovider.repository.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Embeddable
@Data
@Table(name = "multa")
public class MultaEntity {

    private BigDecimal taxa        = BigDecimal.ZERO;
    private BigDecimal  valor       = BigDecimal.ZERO;
    private LocalDate data;

}
