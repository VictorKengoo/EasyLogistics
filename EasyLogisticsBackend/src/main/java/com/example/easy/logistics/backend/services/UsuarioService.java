package com.example.easy.logistics.backend.services;

import java.util.List;
import java.util.Optional;

import com.example.easy.logistics.backend.models.Usuario;

public interface UsuarioService {
	
	List<Usuario> listAll();
	
	Optional<Usuario> listById(String id);
	
	Usuario insert(Usuario usuario);
	
	Usuario update(Usuario usuario);
	
	void remove(String id);
}
