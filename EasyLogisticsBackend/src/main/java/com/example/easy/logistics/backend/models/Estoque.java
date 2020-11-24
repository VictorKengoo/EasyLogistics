package com.example.easy.logistics.backend.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Estoque {
	
	public Estoque(String id, String nome, Integer qtdDisponivel, Integer qtdMinima) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdDisponivel = qtdDisponivel;
		this.qtdMinima = qtdMinima;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	private String id;	
	
	private String nome;
	
	private Integer qtdDisponivel;
	
	private Integer qtdMinima;
	
	// Getters
	public String getId() {
		return id;
	}
	
	@NotNull(message="qtdDisponivel não pode ser vazio")
	public Integer getQtdDisponivel() {
		return qtdDisponivel;
	}
	
	@NotNull(message="qtdDisponivel não pode ser vazio")
	public String getNome() {
		return nome;
	}
	
	public Integer getQtdMinima() {
		return qtdMinima;
	}
	
	// Setters
	public void setId(String id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQtdDisponivel(Integer qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}

	public void setQtdMinima(Integer qtdMinima) {
		this.qtdMinima = qtdMinima;
	}	
}
