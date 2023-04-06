package com.api.banco.dataprovider.repository;

import com.api.banco.dataprovider.repository.entity.BoletosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BoletosRepository extends JpaRepository<BoletosEntity, UUID> {

}
