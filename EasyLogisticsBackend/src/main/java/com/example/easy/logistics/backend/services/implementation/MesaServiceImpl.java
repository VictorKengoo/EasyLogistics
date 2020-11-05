package com.example.easy.logistics.backend.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easy.logistics.backend.models.Mesa;
import com.example.easy.logistics.backend.repository.MesaRepository;
import com.example.easy.logistics.backend.services.MesaService;

@Service
public class MesaServiceImpl implements MesaService {
	
	@Autowired
	private MesaRepository mesaRepository;

	@Override
	public List<Mesa> listAll() {
		return this.mesaRepository.findAll();
	}

	@Override
	public Optional<Mesa> listById(String id) {
		return this.mesaRepository.findById(id);
	}

	@Override
	public Mesa insert(Mesa mesa) {	
		this.mesaRepository.save(mesa);
		return null;
	}

	@Override
	public Mesa update(Mesa mesa) {
		this.mesaRepository.save(mesa);
		return null;
	}

	@Override
	public void remove(String id) {
		this.mesaRepository.deleteById(id);
	}
}
