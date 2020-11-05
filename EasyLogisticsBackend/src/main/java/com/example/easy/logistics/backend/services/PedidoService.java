package com.example.easy.logistics.backend.services;

import java.util.List;
import java.util.Optional;

import com.example.easy.logistics.backend.models.Pedido;

public interface PedidoService {
	
	List<Pedido> listAll();
	
	Optional<Pedido> listById(String id);
	
	Pedido insert(Pedido pedido);
	
	Pedido update(Pedido pedido);
	
	void remove(String id);
	
}
