package com.ricardochaves.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ricardochaves.domain.Procedimento;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Integer>{
	
	@Query("select p from Procedimento p where p.data>='2000-02-07' and p.data<='2013-08-15'")
	List<Procedimento> achar();
	
}
