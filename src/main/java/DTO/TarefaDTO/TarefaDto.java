package DTO.TarefaDTO;

import Entity.Tarefas;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TarefaDto(
        @NotNull
        Long id,

        @NotBlank
        String nome_tarefa
) {
    public TarefaDto(Tarefas tarefas){
        this(tarefas.getId(), tarefas.getNome_tarefa());
    }
}
