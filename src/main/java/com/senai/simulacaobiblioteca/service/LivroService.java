package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.entites.LivroEntity;
import com.senai.simulacaobiblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public LivroEntity salvarLivro(LivroEntity livroEntity) {
        return livroRepository.save(livroEntity);
    }
}
