package com.senai.simulacaobiblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "emprestimo")
@Data
@NoArgsConstructor
public class EmprestimoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "membro_id")
    private MembroEntity membro;

    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;

}
