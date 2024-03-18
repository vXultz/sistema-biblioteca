package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.VisitanteEntity;
import com.senai.simulacaobiblioteca.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitante")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitanteService;

    @PostMapping
    public VisitanteEntity salvarVisitante(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvarVisitante(visitanteEntity);
    }
}
