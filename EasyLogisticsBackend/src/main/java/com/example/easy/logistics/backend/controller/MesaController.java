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

import com.example.easy.logistics.backend.models.Mesa;
import com.example.easy.logistics.backend.responses.Response;
import com.example.easy.logistics.backend.services.MesaService;

@RestController
@RequestMapping(path="/mesa")
public class MesaController<T> {
	
	@Autowired
	private MesaService service;
	
	@GetMapping
	public ResponseEntity<Response<List<Mesa>>> listAll(){
		return ResponseEntity.ok(new Response<List<Mesa>>(this.service.listAll()));
	}

	@GetMapping(path="/{id}")
	public ResponseEntity<Response<Optional<Mesa>>> listById(@PathVariable(name="id") String id){
		return ResponseEntity.ok(new Response<Optional<Mesa>>(this.service.listById(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Mesa>> insert(@Valid @RequestBody Mesa mesa, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Mesa>(errors));
		}
		
		return ResponseEntity.ok(new Response<Mesa>(this.service.insert(mesa)));
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<Response<Mesa>> update(@Valid @RequestBody Mesa mesa, @PathVariable(name="id") String id, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Mesa>(errors));
		}
		
		mesa.setId(id);
		return ResponseEntity.ok(new Response<Mesa>(this.service.update(mesa)));
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Response<String>> remove(@PathVariable(name="id") String id){
		this.service.remove(id);
		return ResponseEntity.ok(new Response<String>("Item de id: " + id + " removido com sucesso"));		
	}
}
