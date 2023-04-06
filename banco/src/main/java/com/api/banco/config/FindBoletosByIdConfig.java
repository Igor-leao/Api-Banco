package com.api.banco.config;

import com.api.banco.core.useCase.impl.FindBoletosByIdUseCaseImpl;
import com.api.banco.dataprovider.FindBoletosByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindBoletosByIdConfig {
    @Bean
    public FindBoletosByIdUseCaseImpl findBoletosByIdUseCase(
            FindBoletosByIdImpl findCustomerById
    ) {
        return new FindBoletosByIdUseCaseImpl(findCustomerById);
    }
}
