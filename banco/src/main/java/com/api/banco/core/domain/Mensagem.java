package com.api.banco.core.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;


public class Mensagem {

    private UUID mensagemId;
    private String linha1;

    private String linha2;

    private String linha3;

    private String linha4;

    private String linha5;

    public String getLinha1() {
        return linha1;
    }

    public void setLinha1(String linha1) {
        this.linha1 = linha1;
    }

    public String getLinha2() {
        return linha2;
    }

    public void setLinha2(String linha2) {
        this.linha2 = linha2;
    }

    public String getLinha3() {
        return linha3;
    }

    public void setLinha3(String linha3) {
        this.linha3 = linha3;
    }

    public String getLinha4() {
        return linha4;
    }

    public void setLinha4(String linha4) {
        this.linha4 = linha4;
    }

    public String getLinha5() {
        return linha5;
    }

    public void setLinha5(String linha5) {
        this.linha5 = linha5;
    }
}
