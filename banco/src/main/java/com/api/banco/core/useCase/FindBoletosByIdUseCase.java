package com.api.banco.core.useCase;

import com.api.banco.dataprovider.repository.entity.BoletosEntity;

import java.util.UUID;

public interface FindBoletosByIdUseCase {
    BoletosEntity find(final UUID id);
}
