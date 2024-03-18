package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.BibliotecarioEntity;
import com.senai.simulacaobiblioteca.service.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
@RequiredArgsConstructor
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @PostMapping
    public BibliotecarioEntity salvarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.salvarBibliotecario(bibliotecarioEntity);
    }

    @GetMapping
    public List<BibliotecarioEntity> listarBibliotecarios() {
        return bibliotecarioService.listarBibliotecarios();
    }

    @DeleteMapping("/{id}")
    public void deletarBibliotecario(@PathVariable Long id) {
        bibliotecarioService.deletarBibliotecario(id);
    }
}
