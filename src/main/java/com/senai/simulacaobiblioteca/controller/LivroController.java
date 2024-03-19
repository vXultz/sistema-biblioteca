package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.LivroEntity;
import com.senai.simulacaobiblioteca.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/livro")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;


    @PostMapping
    public LivroEntity salvarLivro(@RequestBody LivroEntity livroEntity) {
        return livroService.salvarLivro(livroEntity);
    }

    @GetMapping
    public List<LivroEntity> listarLivros() {
        return livroService.listarLivros();
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
    }

    @PutMapping
    public int atualizarLivro(@RequestBody LivroEntity livroEntity) {
        return livroService.atualizarLivro(new LivroEntity(
                livroEntity.getId(),
                livroEntity.getTitulo(),
                livroEntity.getAutor(),
                livroEntity.getAnoPublicacao()
        ));
    }
}
