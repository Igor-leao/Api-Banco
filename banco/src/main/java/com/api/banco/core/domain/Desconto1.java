package com.api.banco.core.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;

public class Desconto1 {
    private UUID descontoId;
    private CodigoDesconto codigoDesconto;
    private Long valor;
    private Long taxa;

}
