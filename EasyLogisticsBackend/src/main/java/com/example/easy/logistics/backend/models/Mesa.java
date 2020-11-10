package com.example.easy.logistics.backend.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Mesa {

	public Mesa(String id, Integer numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	String id;
	
	Integer numero;

	// Getters
	public String getId() {
		return id;
	}

	public Integer getNumero() {
		return numero;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
