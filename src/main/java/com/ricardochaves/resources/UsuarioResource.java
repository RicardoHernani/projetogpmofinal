package com.ricardochaves.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardochaves.domain.Usuario;
import com.ricardochaves.services.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> achar() {
		List<Usuario> list = usuarioService.achar();
		return ResponseEntity.ok().body(list);
	}
	
}