package com.example.easy.logistics.backend.services;

import java.util.List;
import java.util.Optional;

import com.example.easy.logistics.backend.models.Produto;

public interface ProdutoService {
	
	List<Produto> listAll();
	
	Optional<Produto> listById(String id);
	
	Produto insert(Produto produto);
	
	Produto update(Produto produto);
	
	void remove(String id);
	
}
