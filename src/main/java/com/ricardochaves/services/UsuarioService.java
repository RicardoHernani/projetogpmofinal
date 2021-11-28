package com.ricardochaves.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardochaves.domain.Usuario;
import com.ricardochaves.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario fullSearchIntervalDate(String nomeUsuario, Date dataInicial, Date dataFinal) {
		dataFinal = new Date(dataFinal.getTime() + 24 * 60 * 60 * 1000);
		
		return usuarioRepository.findByNome(nomeUsuario, dataInicial, dataFinal);
	}
	
}
