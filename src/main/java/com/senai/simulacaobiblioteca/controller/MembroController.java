package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.entites.MembroEntity;
import com.senai.simulacaobiblioteca.service.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membro")
@RequiredArgsConstructor
public class MembroController {

    private final MembroService membroService;

    @PostMapping
    public MembroEntity salvarMembro(@RequestBody MembroEntity membroEntity) {
        return membroService.salvarMembro(membroEntity);
    }
}
