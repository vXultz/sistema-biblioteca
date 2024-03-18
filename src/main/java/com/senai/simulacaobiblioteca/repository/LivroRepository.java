package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    Optional<LivroEntity> findLivroByTitulo(String titulo);

    Optional<LivroEntity> findLivroById(Long id);
}
