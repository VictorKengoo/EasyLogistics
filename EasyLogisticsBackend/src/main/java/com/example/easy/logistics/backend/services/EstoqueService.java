package com.example.easy.logistics.backend.services;

import java.util.List;
import java.util.Optional;

import com.example.easy.logistics.backend.models.Estoque;

public interface EstoqueService {
	
	List<Estoque> listAll();
	
	Optional<Estoque> listById(String id);
	
	Estoque insert(Estoque estoque);
	
	Estoque update(Estoque estoque);
	
	void remove(String id);
	
}
