package com.ricardochaves.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardochaves.domain.Procedimento;
import com.ricardochaves.repositories.ProcedimentoRepository;

@Service
public class ProcedimentoService {

	@Autowired
	private ProcedimentoRepository procedimentoRepository;
	
	public List<Procedimento> achar(){
		return procedimentoRepository.achar();
	}
	
	
}
