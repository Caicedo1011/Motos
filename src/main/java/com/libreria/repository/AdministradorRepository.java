package com.libreria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.libreria.entity.Administrador;

public interface AdministradorRepository extends MongoRepository<Administrador, String> {
    Administrador findByUsername(String username);
}
