package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    Optional<MembroEntity> findMembroEntityById(Long id);
}
