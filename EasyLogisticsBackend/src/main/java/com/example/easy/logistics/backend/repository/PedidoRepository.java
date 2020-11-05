package com.example.easy.logistics.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.easy.logistics.backend.models.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido, String>{
	
}
