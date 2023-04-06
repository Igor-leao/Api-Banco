package com.api.banco.entrypoint.controller;

import com.api.banco.core.useCase.FindBoletosByIdUseCase;
import com.api.banco.core.useCase.FindColecaoDeBoletos;
import com.api.banco.dataprovider.repository.entity.BoletosEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cobranca/v2/boletos")
public class BoletosController {

    private FindBoletosByIdUseCase findBoletosById;

    private FindColecaoDeBoletos findColecaoDeBoletos;
    public  BoletosController (
            FindBoletosByIdUseCase findBoletosById,
            FindColecaoDeBoletos findColecaoDeBoletos) {
        this.findBoletosById = findBoletosById;
        this.findColecaoDeBoletos = findColecaoDeBoletos;
    }

    @GetMapping
    public List<BoletosEntity> findAll() {
        return findColecaoDeBoletos.findAll();
    }

}
