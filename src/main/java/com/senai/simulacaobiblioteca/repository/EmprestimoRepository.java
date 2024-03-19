package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.EmprestimoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Transactional
    @Modifying
    @Query("update EmprestimoEntity emprestimo set emprestimo.livro = :livro_id," +
            "emprestimo.membro = :membro_id, " +
            "emprestimo.dataEmprestimo = :dataEmprestimo, " +
            "emprestimo.dataDevolucao = :dataDevolucao " +
            "where emprestimo.id = :id")
    int update(@Param("livro_id") Long livro_id,
               @Param("membro_id") Long membro_id,
               @Param("dataEmprestimo") LocalDateTime dataEmprestimo,
               @Param("dataDevolucao") LocalDateTime dataDevolucao,
               @Param("id") Long id);
}
