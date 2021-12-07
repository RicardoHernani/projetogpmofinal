package com.ricardochaves.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardochaves.domain.Procedimento;
import com.ricardochaves.services.ProcedimentoService;


@RestController
@RequestMapping(value="/procedimentos")
public class ProcedimentoResource {

	@Autowired
	private ProcedimentoService procedimentoService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Procedimento>> achar() {
		List<Procedimento> list = procedimentoService.achar();
		return ResponseEntity.ok().body(list);
	}
	
	
}

