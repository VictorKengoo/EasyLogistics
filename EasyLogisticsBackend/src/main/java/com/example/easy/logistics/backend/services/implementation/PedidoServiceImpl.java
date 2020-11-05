package com.example.easy.logistics.backend.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easy.logistics.backend.models.Pedido;
import com.example.easy.logistics.backend.repository.PedidoRepository;
import com.example.easy.logistics.backend.services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public List<Pedido> listAll() {
		return this.pedidoRepository.findAll();
	}

	@Override
	public Optional<Pedido> listById(String id) {
		return this.pedidoRepository.findById(id);
	}

	@Override
	public Pedido insert(Pedido pedido) {	
		this.pedidoRepository.save(pedido);
		return null;
	}

	@Override
	public Pedido update(Pedido pedido) {
		this.pedidoRepository.save(pedido);
		return null;
	}

	@Override
	public void remove(String id) {
		this.pedidoRepository.deleteById(id);
	}
}
