package com.ricardochaves.resources;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ricardochaves.domain.Usuario;
import com.ricardochaves.services.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")

public class UsuarioResource {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST funcionando";
	}
	@RequestMapping(value="/fullsearch/page", method=RequestMethod.GET)
	public ResponseEntity<Page<Usuario>> findPage (
			@RequestParam(value="nomeUsuario", defaultValue="") String nomeUsuario,
			@RequestParam(value="page", defaultValue="0") Integer page,
			@RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage,
			@RequestParam(value="orderBy", defaultValue="nome") String orderBy,
			@RequestParam(value="direction", defaultValue="ASC") String direction) {		
			Page<Usuario> list = usuarioService.search(nomeUsuario, page, linesPerPage, orderBy, direction);
			return ResponseEntity.ok().body(list);
	}

}
