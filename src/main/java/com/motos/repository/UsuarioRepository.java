package com.motos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.motos.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
    Usuario findByCorreo(String correo);
}
