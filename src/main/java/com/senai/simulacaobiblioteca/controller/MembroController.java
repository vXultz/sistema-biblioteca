package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.MembroEntity;
import com.senai.simulacaobiblioteca.service.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membro")
@RequiredArgsConstructor
public class MembroController {

    private final MembroService membroService;

    @PostMapping
    public MembroEntity salvarMembro(@RequestBody MembroEntity membroEntity) {
        return membroService.salvarMembro(membroEntity);
    }

    @GetMapping
    public List<MembroEntity> listarMembros() {
        return membroService.listarMembros();
    }

    @DeleteMapping("/{id}")
    public void deletarMembro(@PathVariable Long id) {
        membroService.deletarMembro(id);
    }
}
