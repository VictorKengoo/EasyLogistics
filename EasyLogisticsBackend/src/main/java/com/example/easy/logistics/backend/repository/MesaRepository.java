package com.example.easy.logistics.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.easy.logistics.backend.models.Mesa;

public interface MesaRepository extends MongoRepository<Mesa, String>{
	
}
