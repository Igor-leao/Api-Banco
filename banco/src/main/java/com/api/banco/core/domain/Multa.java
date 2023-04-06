package com.api.banco.core.domain;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Multa {

    private BigDecimal taxa        = BigDecimal.ZERO;
    private BigDecimal  valor       = BigDecimal.ZERO;
    private LocalDate data;

    public BigDecimal getTaxa() {
        return taxa;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
