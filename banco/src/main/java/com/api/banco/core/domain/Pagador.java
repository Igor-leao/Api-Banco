package com.api.banco.core.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;


public class Pagador {

    private String cpfCnpj;
    private String tipoPessoa;
    private String nome;
    private String endereco;
    private String uf;
    private String cep;
    private String cidade;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pagador{" +
                "cpfCnpj='" + cpfCnpj + '\'' +
                ", tipoPessoa='" + tipoPessoa + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
