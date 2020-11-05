package com.example.easy.logistics.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.easy.logistics.backend.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
}
