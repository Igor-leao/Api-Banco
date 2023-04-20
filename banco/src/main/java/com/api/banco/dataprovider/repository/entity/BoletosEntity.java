package com.api.banco.dataprovider.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static jakarta.persistence.CascadeType.ALL;

@Embeddable
@Entity
@Data
@Table(name = "boletos")
public class BoletosEntity {

  @EqualsAndHashCode.Include
  @Id
  private UUID boletosID;
  @ManyToOne
  @JoinColumn(name = "pagadorId", nullable = false)
    private PagadorEntity pagador;
    private String seuNumero;

  /*  as datas vão funcionar para o filtro,
    se tenho uma criação de um boleto ele vem como
    duas datas, e de acordo com a situação vou fazendo os filtros
    lembrando que os filtros podem ser acrescentados*/
    private LocalDate dataEmissao;
    private LocalDate dataAtualizacaoSituacao;
    private String dataVencimento;
    private MensagemEntity mensagem;
  @ManyToOne
    private DescontosEntity desconto1;
    private String valorNominal;
    @OneToMany(cascade=ALL, mappedBy="boletos")
    private List<MoraEntity> mora = new ArrayList<>();
    private Long numDiasAgenda;


}
