package com.ricardochaves.repositories;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ricardochaves.domain.Procedimento;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, String>{

	
	

}
