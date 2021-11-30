package com.ricardochaves.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ricardochaves.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	
	@Query("SELECT u FROM Usuario u JOIN u.procedimentos p WHERE u.nome= :nomeUsuario AND p.data='2010-12-24'")
	Page<Usuario> findByNomeEntreDatas(@Param("nomeUsuario") String nomeUsuario, Pageable pageRequest);
	
}