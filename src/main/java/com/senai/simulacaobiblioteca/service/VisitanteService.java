package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.entites.VisitanteEntity;
import com.senai.simulacaobiblioteca.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {
    private final VisitanteRepository visitanteRepository;

    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    public VisitanteEntity salvarVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }

    public List<VisitanteEntity> listarVisitantes() {
        return visitanteRepository.findAll();
    }
}
