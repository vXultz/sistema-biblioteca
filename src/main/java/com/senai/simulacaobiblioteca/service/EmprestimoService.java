package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.entites.EmprestimoEntity;
import com.senai.simulacaobiblioteca.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public EmprestimoEntity salvarEmprestimo(EmprestimoEntity emprestimoEntity) {
        return emprestimoRepository.save(emprestimoEntity);
    }
}
