package com.api.banco.dataprovider;

import com.api.banco.core.dataprovider.FindBoletosById;
import com.api.banco.core.domain.Boletos;
import com.api.banco.dataprovider.repository.BoletosRepository;
import com.api.banco.dataprovider.repository.entity.BoletosEntity;
import com.api.banco.dataprovider.repository.mapper.BoletosEntityMapper;

import java.util.Optional;
import java.util.UUID;

public class FindBoletosByIdImpl implements FindBoletosById {

    private BoletosRepository boletosRepository;

    private BoletosEntityMapper boletosEntityMapper;

    public FindBoletosByIdImpl (BoletosRepository boletosRepository) {
        this.boletosRepository = boletosRepository;
    }
    @Override
    public Optional<Boletos> find(UUID id) {
        var boletosEntity = boletosRepository.findById(id);
        return boletosEntity.map(entity -> boletosEntityMapper.toBoletos(entity));

    }


}
