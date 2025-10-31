package Agendamento.Sistema.DTO.EventosDTO;

import DTO.DadosEnderecoDto;
import jakarta.validation.constraints.NotNull;

public record AtualizarEventoDto(
    @NotNull
    long id,

    String nome_evento,

    Date data,

    DadosEnderecoDto endereco) {
}
