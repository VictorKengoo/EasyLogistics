package com.example.easy.logistics.backend.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.easy.logistics.backend.models.enums.PedidoStatusType;

@Document
public class Pedido {

	public Pedido(String id, ProdutoEQtd[] produtosEQtd, String idMesa, PedidoStatusType status) {
		super();
		this.id = id;
		this.produtosEQtd = produtosEQtd;
		this.idMesa = idMesa;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq", allocationSize = 1)
	private String id;
	
	@NotNull
	@Size(min = 1, message = "Field produtosEQtd must not be null or empty")
	private ProdutoEQtd[] produtosEQtd;
	
	@NotNull
	@Size(min = 1, message = "Field cliente must not be null or empty")
	private String idMesa;
	
	private PedidoStatusType status;

	// Getters
	public String getId() {
		return id;
	}

	public ProdutoEQtd[] getProdutosEQtd() {
		return produtosEQtd;
	}

	public String getIdMesa() {
		return idMesa;
	}

	public PedidoStatusType getStatus() {
		return status;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setProdutosEQtd(ProdutoEQtd[] produtosEQtd) {
		this.produtosEQtd = produtosEQtd;
	}

	public void setIdMesa(String idMesa) {
		this.idMesa = idMesa;
	}

	public void setStatus(PedidoStatusType status) {
		this.status = status;
	}
}
