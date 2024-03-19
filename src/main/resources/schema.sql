CREATE DATABASE biblioteca;


CREATE TABLE Livro (
                       id SERIAL PRIMARY KEY,
                       titulo VARCHAR(255) NOT NULL,
                       autor VARCHAR(255) NOT NULL,
                       anoPublicacao INT NOT NULL
);


CREATE TABLE Membros (
                         id SERIAL PRIMARY KEY,
                         nome VARCHAR(255) NOT NULL,
                         endereco VARCHAR(255) NOT NULL,
                         telefone VARCHAR(20) NOT NULL
);


CREATE TABLE Emprestimos (
                             id SERIAL PRIMARY KEY,
                             livro_id INT REFERENCES Livro(id),
                             membro_id INT REFERENCES Membros(id),
                             dataEmprestimo DATE NOT NULL,
                             dataDevolucao DATE
);


CREATE TABLE Bibliotecario (
                               id SERIAL PRIMARY KEY,
                               nome VARCHAR(255) NOT NULL,
                               email VARCHAR(255) NOT NULL,
                               senha VARCHAR(255) NOT NULL
);


CREATE TABLE Visitante (
                           id SERIAL PRIMARY KEY,
                           nome VARCHAR(255) NOT NULL,
                           telefone VARCHAR(20) NOT NULL
);