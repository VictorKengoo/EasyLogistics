package com.example.easy.logistics.backend.services;

import java.util.List;
import java.util.Optional;

import com.example.easy.logistics.backend.models.Mesa;

public interface MesaService {
	
	List<Mesa> listAll();
	
	Optional<Mesa> listById(String id);
	
	Mesa insert(Mesa mesa);
	
	Mesa update(Mesa mesa);
	
	void remove(String id);
	
}
