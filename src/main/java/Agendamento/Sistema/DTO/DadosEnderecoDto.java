package Agendamento.Sistema.DTO;

import Agendamento.Sistema.Entity.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEnderecoDto(
        @NotBlank
        String local,
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf) {

        public DadosEnderecoDto(Endereco endereco) {
                this(
                        endereco.getLocal(),
                        endereco.getLogradouro(),
                        endereco.getNumero(),
                        endereco.getCep(),
                        endereco.getCidade(),
                        endereco.getUf()
                );
        }
}
