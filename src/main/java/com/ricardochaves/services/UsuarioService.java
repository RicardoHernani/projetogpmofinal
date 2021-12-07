package com.ricardochaves.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardochaves.domain.Usuario;
import com.ricardochaves.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> achar(){
		return usuarioRepository.achar();
	}
	
	
}
