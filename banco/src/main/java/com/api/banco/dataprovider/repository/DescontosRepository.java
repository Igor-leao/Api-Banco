package com.api.banco.dataprovider.repository;

import com.api.banco.dataprovider.repository.entity.DescontosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DescontosRepository extends JpaRepository <DescontosEntity, UUID> {
}
