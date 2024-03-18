package com.senai.simulacaobiblioteca.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmprestimoDTO {
    private Long livroId;
    private Long membroId;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;
}