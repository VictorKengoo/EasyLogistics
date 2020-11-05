package com.example.easy.logistics.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.easy.logistics.backend.models.Estoque;

public interface EstoqueRepository extends MongoRepository<Estoque, String>{
	
}
