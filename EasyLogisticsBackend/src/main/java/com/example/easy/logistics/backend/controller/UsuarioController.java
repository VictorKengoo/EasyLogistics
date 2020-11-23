package com.example.easy.logistics.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easy.logistics.backend.Utils;
import com.example.easy.logistics.backend.models.Usuario;
import com.example.easy.logistics.backend.responses.Response;
import com.example.easy.logistics.backend.services.UsuarioService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController<T> {

	@Autowired
	private UsuarioService service;

	private Utils utils = new Utils();

	@GetMapping
	public ResponseEntity<Response<List<Usuario>>> listAll() {
		return ResponseEntity.ok(new Response<List<Usuario>>(this.service.listAll()));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Optional<Usuario>>> listById(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Response<Optional<Usuario>>(this.service.listById(id)));
	}

	@PostMapping
	public ResponseEntity<Response<String>> insert(@Valid @RequestBody Usuario usuario, BindingResult result) throws JsonProcessingException{		
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();			
			for (ObjectError error : result.getAllErrors()) {
				String field = ((FieldError) error).getField();
				String errorMessage = error.getDefaultMessage();
				errors.add("ERROR with message: {" + errorMessage +  "} for field: {" + field + "}");
			}			
			return ResponseEntity.badRequest().body(new Response<String>(errors));
		}
		
		this.service.insert(usuario);
		
		String parsedData = utils.convertAndIndentToJsonString(usuario);
		return ResponseEntity.ok(new Response<String>(parsedData));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<String>> update(@Valid @RequestBody Usuario usuario,
			@PathVariable(name = "id") String id, BindingResult result) {
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();			
			for (ObjectError error : result.getAllErrors()) {
				String field = ((FieldError) error).getField();
				String errorMessage = error.getDefaultMessage();
				errors.add("ERROR with message: {" + errorMessage +  "} for field: {" + field + "}");
			}			
			return ResponseEntity.badRequest().body(new Response<String>(errors));
		}

		usuario.setId(id);
		this.service.update(usuario);
		return ResponseEntity.ok(new Response<String>("Item de id: " + id + " alterado com sucesso"));
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<String>> remove(@PathVariable(name = "id") String id) {
		this.service.remove(id);
		return ResponseEntity.ok(new Response<String>("Item de id: " + id + " removido com sucesso"));
	}
}
