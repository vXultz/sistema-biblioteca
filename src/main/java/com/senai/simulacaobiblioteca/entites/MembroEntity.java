package com.senai.simulacaobiblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "membros")
@Data
@NoArgsConstructor
public class MembroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;

    @Column(unique = true)
    private String telefone;

}
