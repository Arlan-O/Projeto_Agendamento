package DTO;

import jakarta.validation.constraints.NotNull;

public record AtualizarEventoDto(
    @NotNull
    long id,

    String nome_evento,

    Date data,

    DadosEnderecoDto endereco) {
}
