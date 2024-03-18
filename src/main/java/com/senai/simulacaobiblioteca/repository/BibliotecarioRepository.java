package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
