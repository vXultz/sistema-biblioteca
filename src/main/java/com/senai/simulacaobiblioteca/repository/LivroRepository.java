package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    Optional<LivroEntity> findLivroByTitulo(String titulo);

    Optional<LivroEntity> findLivroById(Long id);


    @Transactional
    @Modifying
    @Query("update LivroEntity livro set livro.titulo = :titulo," +
            "livro.autor = :autor, " +
            "livro.anoPublicacao = :anoPublicacao " +
            "where livro.id = :id")
    int update(@Param("titulo") String titulo,
               @Param("autor") String autor,
               @Param("anoPublicacao") Long anoPublicacao,
               @Param("id") Long id);
}

