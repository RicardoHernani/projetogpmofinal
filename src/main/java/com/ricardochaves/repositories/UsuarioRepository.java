package com.ricardochaves.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ricardochaves.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query("select distinct u from Usuario u join u.procedimentos p where u.id=1")
	List<Usuario> achar();
}
