package com.example.easy.logistics.backend.models;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Entity
public class Produto {

	public Produto(String id, String nome, Boolean disponivel, Map<String, Integer> ingredientesEQtd, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.disponivel = disponivel;
		this.ingredientesEQtd = ingredientesEQtd;
		this.preco = preco;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	String id;
	
	@NotNull
	@Size(min = 1, message = "Field nome must not be null or empty")
	String nome;
	
	@NotNull
	@Size(min = 1, message = "Field preco must not be null or empty")
	Double preco;
	
	@NotNull
	@Size(min = 1, message = "Field disponivel must not be null or empty")
	Boolean disponivel;
	
	@NotNull
	@Size(min = 1, message = "Field ingredientesEQtd must not be null or empty")
	Map<String, Integer> ingredientesEQtd;

	// Getters
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Map<String, Integer> getIngredientesEQtd() {
		return ingredientesEQtd;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public Double getPreco() {
		return preco;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIngredientesEQtd(Map<String, Integer> ingredientesEQtd) {
		this.ingredientesEQtd = ingredientesEQtd;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
