package com.example.easy.logistics.backend.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easy.logistics.backend.models.Estoque;
import com.example.easy.logistics.backend.repository.EstoqueRepository;
import com.example.easy.logistics.backend.services.EstoqueService;

@Service
public class EstoqueServiceImpl implements EstoqueService {
	
	@Autowired
	private EstoqueRepository estoqueRepository;

	@Override
	public List<Estoque> listAll() {
		return this.estoqueRepository.findAll();
	}

	@Override
	public Optional<Estoque> listById(String id) {
		return this.estoqueRepository.findById(id);
	}

	@Override
	public Estoque insert(Estoque estoque) {	
		this.estoqueRepository.save(estoque);
		return null;
	}

	@Override
	public Estoque update(Estoque estoque) {
		this.estoqueRepository.save(estoque);
		return null;
	}

	@Override
	public void remove(String id) {
		this.estoqueRepository.deleteById(id);
	}
}
