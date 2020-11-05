package com.example.easy.logistics.backend.models;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document
public class Mesa {

	public Mesa(String id, String nome, Integer mesa, Double valorConta, List<Pedido> pedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.mesa = mesa;
		this.valorConta = valorConta;
		this.pedidos = pedidos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	String id;
	String nome;
	Integer mesa;	
	Double valorConta;
	List<Pedido> pedidos;

	// Getters
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getMesa() {
		return mesa;
	}

	public Double getValorConta() {
		return valorConta;
	}

	public void setValorConta(Double valorConta) {
		this.valorConta = valorConta;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
