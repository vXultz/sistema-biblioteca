package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.entites.LivroEntity;
import com.senai.simulacaobiblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public LivroEntity salvarLivro(LivroEntity livroEntity) {
        return livroRepository.save(livroEntity);
    }

    public List<LivroEntity> listarLivros() {
        return livroRepository.findAll();
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public int atualizarLivro(LivroEntity livroEntity) {
        return livroRepository.update(
                livroEntity.getTitulo(),
                livroEntity.getAutor(),
                livroEntity.getAnoPublicacao(),
                livroEntity.getId());
    }
}
