package com.nivaldo.instrutorapi.model;

public enum Especialidade {
    JAVA("Java"),
    PYTHON("Python"),
    JAVASCRIPT("JavaScript"),
    C_SHARP("C#"),
    PHP("PHP"),
    RUBY("Ruby");

    private final String nome;

    Especialidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
