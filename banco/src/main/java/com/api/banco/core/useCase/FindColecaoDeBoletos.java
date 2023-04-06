package com.api.banco.core.useCase;

import com.api.banco.dataprovider.repository.entity.BoletosEntity;

import java.util.List;

public interface FindColecaoDeBoletos {

    List<BoletosEntity> findAll();
}
