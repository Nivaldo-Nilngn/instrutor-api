package com.nivaldo.instrutorapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import com.nivaldo.instrutorapi.model.Especialidade;
import com.nivaldo.instrutorapi.model.Instrutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InstrutorController {

    @Operation(summary = "Listar todos os instrutores", description = "Retorna uma lista de instrutores cadastrados com especialidade em programação.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de instrutores retornada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping("/instrutores")
    public List<Instrutor> listarInstrutores(
            @Parameter(description = "Especialidade para filtrar instrutores", schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = Especialidade.class)) @RequestParam(required = false) Especialidade especialidade) {

        List<Instrutor> instrutores = new ArrayList<>();
        instrutores.add(new Instrutor(1L, "João da Silva", Especialidade.JAVA.getNome()));
        instrutores.add(new Instrutor(2L, "Maria Oliveira", Especialidade.PYTHON.getNome()));
        instrutores.add(new Instrutor(3L, "Carlos Pereira", Especialidade.JAVASCRIPT.getNome()));
        instrutores.add(new Instrutor(4L, "Ana Santos", Especialidade.C_SHARP.getNome()));
        instrutores.add(new Instrutor(5L, "Ricardo Almeida", Especialidade.PHP.getNome()));
        instrutores.add(new Instrutor(6L, "Juliana Costa", Especialidade.RUBY.getNome()));

        // Se o parâmetro de especialidade for fornecido, filtra a lista
        if (especialidade != null) {
            instrutores.removeIf(instrutor -> !instrutor.getEspecialidade().equalsIgnoreCase(especialidade.getNome()));
        }

        return instrutores;
    }
}
