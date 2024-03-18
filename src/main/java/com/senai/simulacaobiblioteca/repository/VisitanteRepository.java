package com.senai.simulacaobiblioteca.repository;

import com.senai.simulacaobiblioteca.entites.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
}
