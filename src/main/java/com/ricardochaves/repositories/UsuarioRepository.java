package com.ricardochaves.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ricardochaves.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	
	@Query(value = "SELECT * FROM USUARIO INNER JOIN PROCEDIMENTO pro ON USUARIO.ID=USUARIO_ID WHERE USUARIO.nome= :nomeUsuario AND pro.data>= :dataInicial AND pro.data<= :dataFinal", nativeQuery= true)
	Usuario findByNome(@Param("nomeUsuario") String nomeUsuario, @Param("dataInicial") Date dataInicial, @Param("dataFinal") Date dataFinal);
	
}



// findByNomeEqualsAndUsuario_ProcedimentofindByDataBetween

// 	@Query(value="SELECT u FROM Usuario u INNER JOIN u.Procedimento p WHERE u.nome= :nomeUsuario AND u.p.data>= :dataInicial AND u.p.data<= :dataFinal")

/*  SELECT * FROM USUARIO, PROCEDIMENTO
WHERE USUARIO.NOME = 'Ana' AND
PROCEDIMENTO.DATA >= '2000-02-06' AND
PROCEDIMENTO.DATA <= '2010-12-26' AND 
USUARIO.ID  = USUARIO_ID

//FUNCIONOU	@Query(value = "SELECT USUARIO.* FROM USUARIO INNER JOIN PROCEDIMENTO pro ON USUARIO.PROCEDIMENTO_ID = pro.ID WHERE USUARIO.nome= :nomeUsuario AND pro.data>= :dataInicial AND pro.data<= :dataFinal", nativeQuery= true)

*/