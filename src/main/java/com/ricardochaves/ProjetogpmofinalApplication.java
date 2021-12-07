package com.ricardochaves;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardochaves.domain.Procedimento;
import com.ricardochaves.repositories.ProcedimentoRepository;

@SpringBootApplication
public class ProjetogpmofinalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetogpmofinalApplication.class, args);
	}
	
	@Autowired
	private ProcedimentoRepository procedimentoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		Procedimento pro1 = new Procedimento(null, 11111111, sdf.parse("2020-02-20"), 1, 1, 31102360);
		Procedimento pro2 = new Procedimento(null, 11111111, sdf.parse("2020-02-26"), 2, 1, 31102077);
		Procedimento pro3 = new Procedimento(null, 11111111, sdf.parse("2011-05-26"), 1, 1, 30908027);
		Procedimento pro4 = new Procedimento(null, 22222222, sdf.parse("2009-10-10"), 1, 2, 30202094);
		Procedimento pro5 = new Procedimento(null, 33333333, sdf.parse("2013-08-15"), 1, 1, 30715016);
		Procedimento pro6 = new Procedimento(null, 44444444, sdf.parse("2000-02-07"), 1, 2, 31003567);
		Procedimento pro7 = new Procedimento(null, 44444444, sdf.parse("2000-02-07"), 2, 2, 30729017);
		Procedimento pro8 = new Procedimento(null, 44444444, sdf.parse("2010-12-24"), 1, 1, 30908027);
		Procedimento pro9 = new Procedimento(null, 55555555, sdf.parse("1998-05-13"), 1, 2, 31201113);
		Procedimento pro10 = new Procedimento(null, 66666666, sdf.parse("2019-06-27"), 1, 2, 30908027);
		
		procedimentoRepository.saveAll(Arrays.asList(pro1, pro2, pro3, pro4, pro5, pro6, pro7, pro8, pro9, pro10));	
		
	}
	

}
