package com.libreria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.libreria.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
    Usuario findByCorreo(String correo);
}
