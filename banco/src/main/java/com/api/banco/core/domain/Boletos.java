package com.api.banco.core.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.UUID;

public class Boletos {


  private UUID boletosID;
    private Pagador pagador;
    private String seuNumero;

  /*  as datas vão funcionar para o filtro,
    se tenho uma criação de um boleto ele vem como
    duas datas, e de acordo com a situação vou fazendo os filtros
    lembrando que os filtros podem ser acrescentados*/
    private LocalDate dataEmissao;
    private LocalDate dataAtualizacaoSituacao;
    private String dataVencimento;
    private Mensagem mensagem;
  @ManyToOne
    private Desconto1 desconto1;
    private String valorNominal;
    private Mora mora;
    private Long numDiasAgenda;

  public Pagador getPagador() {
    return pagador;
  }

  public void setPagador(Pagador pagador) {
    this.pagador = pagador;
  }

  public String getSeuNumero() {
    return seuNumero;
  }

  public void setSeuNumero(String seuNumero) {
    this.seuNumero = seuNumero;
  }

  public LocalDate getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(LocalDate dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public LocalDate getDataAtualizacaoSituacao() {
    return dataAtualizacaoSituacao;
  }

  public void setDataAtualizacaoSituacao(LocalDate dataAtualizacaoSituacao) {
    this.dataAtualizacaoSituacao = dataAtualizacaoSituacao;
  }

  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public Mensagem getMensagem() {
    return mensagem;
  }

  public void setMensagem(Mensagem mensagem) {
    this.mensagem = mensagem;
  }

  public Desconto1 getDesconto1() {
    return desconto1;
  }

  public void setDesconto1(Desconto1 desconto1) {
    this.desconto1 = desconto1;
  }

  public String getValorNominal() {
    return valorNominal;
  }

  public void setValorNominal(String valorNominal) {
    this.valorNominal = valorNominal;
  }

  public Mora getMora() {
    return mora;
  }

  public void setMora(Mora mora) {
    this.mora = mora;
  }

  public Long getNumDiasAgenda() {
    return numDiasAgenda;
  }

  public void setNumDiasAgenda(Long numDiasAgenda) {
    this.numDiasAgenda = numDiasAgenda;
  }
}
