package com.motos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.motos.entity.Administrador;

public interface AdministradorRepository extends MongoRepository<Administrador, String> {
    Administrador findByUsername(String username);
}
