package com.example.easy.logistics.backend.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.easy.logistics.backend.models.enums.UsuarioType;

@Document
public class Usuario {	
	public Usuario(String id, String nome, UsuarioType tipoUsuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	String id;
	
	@NotNull
	@Size(min = 1, message = "Field nome must not be null or empty")
	String nome;
	
	@NotNull
	UsuarioType tipoUsuario;
	
	// Getters
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public UsuarioType getTipoUsuario() {
		return tipoUsuario;
	}
	
	// Setters
	public void setId(String id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipoUsuario(UsuarioType tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
}
