package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.entites.MembroEntity;
import com.senai.simulacaobiblioteca.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {
    private final MembroRepository membroRepository;

    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public MembroEntity salvarMembro(MembroEntity membroEntity) {
        return membroRepository.save(membroEntity);
    }

    public List<MembroEntity> listarMembros() {
        return membroRepository.findAll();
    }
}
