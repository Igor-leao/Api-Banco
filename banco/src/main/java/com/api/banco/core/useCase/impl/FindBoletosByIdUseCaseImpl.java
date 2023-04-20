package com.api.banco.core.useCase.impl;

import com.api.banco.core.dataprovider.FindBoletosById;
import com.api.banco.core.useCase.FindBoletosByIdUseCase;
import com.api.banco.core.domain.Boletos;

import java.util.UUID;

public class FindBoletosByIdUseCaseImpl implements FindBoletosByIdUseCase {

    private final FindBoletosById findBoletosById;

    public FindBoletosByIdUseCaseImpl (FindBoletosById findBoletosById) {
        this.findBoletosById = findBoletosById;
    }
    @Override
    public Boletos find(UUID id) {
        return findBoletosById.find(id).orElseThrow(() ->
                new RuntimeException("Boletos não encontrados"));
    }
}
