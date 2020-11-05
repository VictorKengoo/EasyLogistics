package com.example.easy.logistics.backend.models;

import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pedido {

	public Pedido(String id, Map<Produto, Integer> produtosEQtd, Double valorTotal, Usuario cliente) {
		super();
		this.id = id;
		this.produtosEQtd = produtosEQtd;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	private String id;
	
	@NotNull
	@Size(min = 1, message = "Field produtosEQtd must not be null or empty")
	private Map<Produto, Integer> produtosEQtd;
	
	
	private Double valorTotal;
	
	@NotNull
	@Size(min = 1, message = "Field cliente must not be null or empty")
	private Usuario cliente;

	// Getters
	public String getId() {
		return id;
	}

	public Map<Produto, Integer> getProdutosEQtd() {
		return produtosEQtd;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public Usuario getCliente() {
		return cliente;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setProdutosEQtd(Map<Produto, Integer> produtosEQtd) {
		this.produtosEQtd = produtosEQtd;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
}
