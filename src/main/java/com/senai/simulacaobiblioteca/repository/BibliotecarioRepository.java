package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.BibliotecarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Transactional
    @Modifying
    @Query("update BibliotecarioEntity bibliotecario set bibliotecario.nome = :nome," +
            "bibliotecario.email = :email, " +
            "bibliotecario.senha = :senha " +
            "where bibliotecario.id = :id")
    int update(@Param("nome") String nome,
               @Param("email") String email,
               @Param("senha") String senha,
               @Param("id") Long id);
}
