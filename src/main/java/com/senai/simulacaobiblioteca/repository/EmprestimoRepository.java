package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {


    @Modifying
    @Query("UPDATE EmprestimoEntity e SET e.livro.id = :livroId, e.membro.id = :membroId, e.dataEmprestimo = :dataEmprestimo, e.dataDevolucao = :dataDevolucao WHERE e.id = :id")
    int update(@Param("id") Long id,
               @Param("livroId") Long livroId,
               @Param("membroId") Long membroId,
               @Param("dataEmprestimo") LocalDateTime dataEmprestimo,
               @Param("dataDevolucao") LocalDateTime dataDevolucao);

}
