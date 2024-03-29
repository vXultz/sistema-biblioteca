package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.VisitanteEntity;
import com.senai.simulacaobiblioteca.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitante")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitanteService;

    @PostMapping
    public VisitanteEntity salvarVisitante(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvarVisitante(visitanteEntity);
    }

    @GetMapping
    public List<VisitanteEntity> listarVisitantes() {
        return visitanteService.listarVisitantes();
    }

    @DeleteMapping("/{id}")
    public void deletarVisitante(@PathVariable Long id) {
        visitanteService.deletarVisitante(id);
    }

    @PutMapping
    public int atualizarVisitante(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.atualizarVisitante(new VisitanteEntity(
                visitanteEntity.getId(),
                visitanteEntity.getNome(),
                visitanteEntity.getTelefone()
        ));
    }
}
