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

import com.example.easy.logistics.backend.models.Usuario;
import com.example.easy.logistics.backend.responses.Response;
import com.example.easy.logistics.backend.services.UsuarioService;

@RestController
@RequestMapping(path="/usuario")
public class UsuarioController<T> {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<Response<List<Usuario>>> listAll(){
		return ResponseEntity.ok(new Response<List<Usuario>>(this.service.listAll()));
	}

	@GetMapping(path="/{id}")
	public ResponseEntity<Response<Optional<Usuario>>> listById(@PathVariable(name="id") String id){
		return ResponseEntity.ok(new Response<Optional<Usuario>>(this.service.listById(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Usuario>> insert(@Valid @RequestBody Usuario usuario, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Usuario>(errors));
		}
		
		return ResponseEntity.ok(new Response<Usuario>(this.service.insert(usuario)));
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<Response<Usuario>> update(@Valid @RequestBody Usuario usuario, @PathVariable(name="id") String id, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Usuario>(errors));
		}
		
		usuario.setId(id);
		return ResponseEntity.ok(new Response<Usuario>(this.service.update(usuario)));
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Response<String>> remove(@PathVariable(name="id") String id){
		this.service.remove(id);
		return ResponseEntity.ok(new Response<String>("Item de id: " + id + " removido com sucesso"));		
	}
}
