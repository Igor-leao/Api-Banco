package com.api.banco.dataprovider.repository.mapper;

import com.api.banco.dataprovider.repository.entity.BoletosEntity;
import org.mapstruct.Mapper;
import com.api.banco.core.domain.Boletos;

@Mapper(componentModel = "spring")
public interface BoletosEntityMapper {

    Boletos toBoletos(BoletosEntity boletosentity);
}
