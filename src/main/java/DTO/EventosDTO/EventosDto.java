package Agendamento.Sistema.DTO.EventosDTO;

import Agendamento.Sistema.Entity.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record EventosDto(
        @NotBlank
        String nome_evento,

        @NotBlank
        Date data,

        @NotBlank
        int numero_convidados,

        @NotBlank
        String tarefa,

        @NotNull
        @Valid
        Endereco endereco) {
}
