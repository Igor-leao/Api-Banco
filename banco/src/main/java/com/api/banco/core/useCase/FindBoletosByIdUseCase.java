package com.api.banco.core.useCase;

import com.api.banco.core.domain.Boletos;

import java.util.UUID;

public interface FindBoletosByIdUseCase {
    Boletos find(final UUID id);
}
