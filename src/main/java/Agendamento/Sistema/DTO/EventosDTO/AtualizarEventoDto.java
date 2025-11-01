package Agendamento.Sistema.DTO.EventosDTO;

import Agendamento.Sistema.DTO.DadosEnderecoDto;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record AtualizarEventoDto(
    @NotNull
    long id,

    String nome_evento,

    Date data,

    DadosEnderecoDto endereco) {
}
