package com.api.banco.core.dataprovider;

import com.api.banco.core.domain.Boletos;
import java.util.Optional;
import java.util.UUID;

public interface FindBoletosById {

    Optional<Boletos> find(final UUID id);
}
