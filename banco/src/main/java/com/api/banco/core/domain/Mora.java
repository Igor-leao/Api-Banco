package com.api.banco.core.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;


public class Mora {


    private UUID moraId;
    private CodigoMora codigoMora;
    private String data;
    private Long taxa;
    private Long valor;

    public CodigoMora getCodigoMora() {
        return codigoMora;
    }

    public void setCodigoMora(CodigoMora codigoMora) {
        this.codigoMora = codigoMora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getTaxa() {
        return taxa;
    }

    public void setTaxa(Long taxa) {
        this.taxa = taxa;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
}
