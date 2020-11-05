package com.example.easy.logistics.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.easy.logistics.backend.models.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String>{
	
}
