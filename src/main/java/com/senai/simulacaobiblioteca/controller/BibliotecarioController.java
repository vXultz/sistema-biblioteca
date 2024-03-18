package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.BibliotecarioEntity;
import com.senai.simulacaobiblioteca.service.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bibliotecario")
@RequiredArgsConstructor
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @PostMapping
    public BibliotecarioEntity salvarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.salvarBibliotecario(bibliotecarioEntity);
    }
}
