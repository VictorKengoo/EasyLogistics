package com.example.easy.logistics.backend.models;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.easy.logistics.backend.models.enums.UsuarioType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Document
public class Usuario {	
	public Usuario(String id, 
			@NotNull @Size(min = 1, message = "Field nome must not be null or empty") String nome,
			@NotNull String email, 
			@NotNull String senha, 
			@NotNull UsuarioType tipoUsuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}

	@Id
	@GeneratedValue
	String id;
	
	@NotNull
	@Size(min = 1, message = "Field nome must not be null or empty")
	String nome;

	@NotNull
	String email;
	
	@NotNull
	@JsonProperty(access = Access.WRITE_ONLY)
	String senha;
	
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
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
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
	public void setEmail(String email) {
		this.email = email;
	}	
	public void setSenha(String senha) {
		this.senha = senha;
	}	
}
