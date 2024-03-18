package com.senai.simulacaobiblioteca.service;

import com.senai.simulacaobiblioteca.dto.EmprestimoDTO;
import com.senai.simulacaobiblioteca.entites.EmprestimoEntity;
import com.senai.simulacaobiblioteca.entites.LivroEntity;
import com.senai.simulacaobiblioteca.entites.MembroEntity;
import com.senai.simulacaobiblioteca.repository.EmprestimoRepository;
import com.senai.simulacaobiblioteca.repository.LivroRepository;
import com.senai.simulacaobiblioteca.repository.MembroRepository;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    private final LivroRepository livroRepository;
    private final MembroRepository membroRepository;
    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository, LivroRepository livroRepository, MembroRepository membroRepository) {
        this.emprestimoRepository = emprestimoRepository;
        this.livroRepository = livroRepository;
        this.membroRepository = membroRepository;
    }

    public EmprestimoEntity salvarEmprestimo(EmprestimoDTO emprestimoDTO) {
        EmprestimoEntity emprestimoEntity = new EmprestimoEntity();

        LivroEntity livro = livroRepository.findLivroById(emprestimoDTO.getLivroId()).orElseThrow(() -> new IllegalArgumentException("O livro com o ID passado não foi encontrado"));
        MembroEntity membro = membroRepository.findMembroById(emprestimoDTO.getMembroId()).orElseThrow(() -> new IllegalArgumentException("O membro com o ID passado não foi encontrado"));

        emprestimoEntity.setLivro(livro);
        emprestimoEntity.setMembro(membro);
        emprestimoEntity.setDataEmprestimo(emprestimoDTO.getDataEmprestimo());
        emprestimoEntity.setDataDevolucao(emprestimoDTO.getDataDevolucao());

        return emprestimoRepository.save(emprestimoEntity);
    }
}
