package com.ricardochaves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardochaves.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
