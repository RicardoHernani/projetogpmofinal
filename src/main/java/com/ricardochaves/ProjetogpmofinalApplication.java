package com.ricardochaves;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardochaves.domain.Procedimento;
import com.ricardochaves.domain.Referencia;
import com.ricardochaves.domain.Usuario;
import com.ricardochaves.repositories.ProcedimentoRepository;
import com.ricardochaves.repositories.ReferenciaRepository;
import com.ricardochaves.repositories.UsuarioRepository;

@SpringBootApplication
public class ProjetogpmofinalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetogpmofinalApplication.class, args);
	}
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ReferenciaRepository referenciaRepository;
	
	@Autowired
	private ProcedimentoRepository procedimentoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Usuario ricardo = new Usuario(null, "Ricardo", "ricardo@gmail", "12345");
		Usuario debora = new Usuario(null, "Débora", "debora@gmail", "1234");
		Usuario ana = new Usuario(null, "Ana", "ana@gmail", "123");
		
		usuarioRepository.saveAll(Arrays.asList(ricardo, debora, ana));
		
		Referencia ref1 = new Referencia(null, "31102360", "Ureterorrenolitotripisia Flexivel Unilateral", 41.0, 992.0);
		Referencia ref2 = new Referencia(null, "31102077", "descrição 1", 41.0, 992.0);
		Referencia ref3 = new Referencia(null, "30908027", "descrição 2", 40.0, 1000.0);
		Referencia ref4 = new Referencia(null, "30202094", "descrição 3", 40.0, 1100.0);
		Referencia ref5 = new Referencia(null, "30715016", "descrição 4", 42.0, 800.0);
		Referencia ref6 = new Referencia(null, "31201113", "descrição 5", 43.0, 700.0);
		Referencia ref7 = new Referencia(null, "30914070", "descrição 6", 444.0, 600.0);
		Referencia ref8 = new Referencia(null, "30908027", "descrição 7", 45.0, 500.0);
		Referencia ref9 = new Referencia(null, "31003567", "descrição 8", 46.0, 400.0);
		Referencia ref10 = new Referencia(null, "30729017", "descrição 9", 47.0, 300.0);
		
		referenciaRepository.saveAll(Arrays.asList(ref1, ref2, ref3, ref4, ref5, ref6, ref7, ref8, ref9, ref10));
		
		
		
	}
	
	

}
