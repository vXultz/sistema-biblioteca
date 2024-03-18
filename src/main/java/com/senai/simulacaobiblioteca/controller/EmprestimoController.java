package com.senai.simulacaobiblioteca.controller;

import com.senai.simulacaobiblioteca.dto.EmprestimoDTO;
import com.senai.simulacaobiblioteca.entites.EmprestimoEntity;
import com.senai.simulacaobiblioteca.service.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
@RequiredArgsConstructor
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    @PostMapping
    public EmprestimoEntity salvarEmprestimo(@RequestBody EmprestimoDTO emprestimoDTO) {
        return emprestimoService.salvarEmprestimo(emprestimoDTO);
    }

    @GetMapping
    public List<EmprestimoEntity> listarEmprestimos() {
        return emprestimoService.listarEmprestimos();
    }
}
