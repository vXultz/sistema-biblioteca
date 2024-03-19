package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Transactional
    @Modifying
    @Query("update VisitanteEntity visitante set visitante.nome = :nome," +
            "visitante.telefone = :telefone " +
            "where visitante.id = :id")
    int update(@Param("nome") String nome,
               @Param("telefone") String telefone,
               @Param("id") Long id);
}
