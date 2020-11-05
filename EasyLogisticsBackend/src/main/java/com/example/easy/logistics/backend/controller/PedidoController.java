package com.example.easy.logistics.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easy.logistics.backend.models.Pedido;
import com.example.easy.logistics.backend.responses.Response;
import com.example.easy.logistics.backend.services.PedidoService;

@RestController
@RequestMapping(path="/pedido")
public class PedidoController<T> {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping
	public ResponseEntity<Response<List<Pedido>>> listAll(){
		return ResponseEntity.ok(new Response<List<Pedido>>(this.service.listAll()));
	}

	@GetMapping(path="/{id}")
	public ResponseEntity<Response<Optional<Pedido>>> listById(@PathVariable(name="id") String id){
		return ResponseEntity.ok(new Response<Optional<Pedido>>(this.service.listById(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Pedido>> insert(@Valid @RequestBody Pedido estoque, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Pedido>(errors));
		}
		
		return ResponseEntity.ok(new Response<Pedido>(this.service.insert(estoque)));
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<Response<Pedido>> update(@Valid @RequestBody Pedido estoque, @PathVariable(name="id") String id, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Pedido>(errors));
		}
		
		estoque.setId(id);
		return ResponseEntity.ok(new Response<Pedido>(this.service.update(estoque)));
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Response<String>> remove(@PathVariable(name="id") String id){
		this.service.remove(id);
		return ResponseEntity.ok(new Response<String>("Item de id: " + id + " removido com sucesso"));		
	}
}
