package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.entites.BibliotecarioEntity;
import com.senai.simulacaobiblioteca.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService {
    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    public BibliotecarioEntity salvarBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }
}
