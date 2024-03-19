package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.MembroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    Optional<MembroEntity> findMembroById(Long id);

    @Transactional
    @Modifying
    @Query("update MembroEntity membro set membro.nome = :nome," +
            "membro.endereco = :endereco, " +
            "membro.telefone = :telefone " +
            "where membro.id = :id")
    int update(@Param("nome") String nome,
               @Param("endereco") String endereco,
               @Param("telefone") String telefone,
               @Param("id") Long id);
}
