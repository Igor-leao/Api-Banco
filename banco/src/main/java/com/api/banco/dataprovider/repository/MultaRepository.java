package com.api.banco.dataprovider.repository;

import com.api.banco.dataprovider.repository.entity.MultaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MultaRepository extends JpaRepository<MultaEntity, UUID> {
}
