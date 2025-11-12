package Agendamento.Sistema.DTO.EventosDTO;

import Agendamento.Sistema.DTO.DadosEnderecoDto;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record AtualizarEventoDto(

    String nome_evento,

    Date data,

    DadosEnderecoDto endereco) {
}
