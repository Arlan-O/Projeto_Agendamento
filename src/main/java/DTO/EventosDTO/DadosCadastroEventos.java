package Agendamento.Sistema.DTO.EventosDTO;

import Agendamento.Sistema.DTO.DadosEnderecoDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

public record DadosCadastroEventos(
        @NotBlank (message = "Nome do evento é obrigatória!")
        String nome_evento,

        @NotNull (message = "Data para o evento é obrigatória!")
        Date data,

        @NotNull (message = "Adicione no mínimo um convidado!")
        @Min(1)
        int numero_convidados,

        @NotNull (message = "Adicione o local do evento!")
        @Valid
        DadosEnderecoDto endereco,

        List<String> nomeTarefas

) {
}
