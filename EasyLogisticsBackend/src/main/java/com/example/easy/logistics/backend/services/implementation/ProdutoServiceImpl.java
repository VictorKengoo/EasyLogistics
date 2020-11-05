package com.example.easy.logistics.backend.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easy.logistics.backend.models.Produto;
import com.example.easy.logistics.backend.repository.ProdutoRepository;
import com.example.easy.logistics.backend.services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> listAll() {
		return this.produtoRepository.findAll();
	}

	@Override
	public Optional<Produto> listById(String id) {
		return this.produtoRepository.findById(id);
	}

	@Override
	public Produto insert(Produto produto) {	
		this.produtoRepository.save(produto);
		return null;
	}

	@Override
	public Produto update(Produto produto) {
		this.produtoRepository.save(produto);
		return null;
	}

	@Override
	public void remove(String id) {
		this.produtoRepository.deleteById(id);
	}
}
