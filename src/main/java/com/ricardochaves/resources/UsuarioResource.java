package com.ricardochaves.resources;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ricardochaves.domain.Usuario;
import com.ricardochaves.resources.util.URL;
import com.ricardochaves.services.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST funcionando";
	}
	@RequestMapping(value="/fullsearch", method=RequestMethod.GET)
	public ResponseEntity<Usuario> fullSearchIntervalDate(
			@RequestParam(value="nomeUsuario", defaultValue="") String nomeUsuario, 
			@RequestParam(value="dataInicial", defaultValue="")	String dataInicial, 
			@RequestParam(value="dataFinal", defaultValue="")	String dataFinal)	{
			nomeUsuario = URL.decodeParam(nomeUsuario);
			Date inicio = URL.convertDate(dataInicial, new Date(0L));
			Date fim = URL.convertDate(dataFinal, new Date());
			Usuario usuario = usuarioService.fullSearchIntervalDate(nomeUsuario, inicio, fim);
			return ResponseEntity.ok().body(usuario);
	}

}
