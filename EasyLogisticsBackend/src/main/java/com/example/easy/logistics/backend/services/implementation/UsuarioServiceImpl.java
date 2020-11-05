package com.example.easy.logistics.backend.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easy.logistics.backend.models.Usuario;
import com.example.easy.logistics.backend.repository.UsuarioRepository;
import com.example.easy.logistics.backend.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> listAll() {
		return this.usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> listById(String id) {
		return this.usuarioRepository.findById(id);
	}

	@Override
	public Usuario insert(Usuario usuario) {	
		this.usuarioRepository.save(usuario);
		return null;
	}

	@Override
	public Usuario update(Usuario usuario) {
		this.usuarioRepository.save(usuario);
		return null;
	}

	@Override
	public void remove(String id) {
		this.usuarioRepository.deleteById(id);
	}
}
