package com.api.banco.dataprovider.repository;

import com.api.banco.dataprovider.repository.entity.MoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MoraRepository extends JpaRepository<MoraEntity, UUID> {
}
