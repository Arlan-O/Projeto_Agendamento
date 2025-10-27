package Agendamento.Sistema.DTO.EventosDTO;

import Agendamento.Sistema.DTO.DadosEnderecoDto;
import Agendamento.Sistema.DTO.TarefaDTO.TarefaDto;
import Agendamento.Sistema.Entity.Eventos;

import java.util.Date;
import java.util.List;

public record DadosListagemEventos(Long id,String nome_evento, Date data, int numero_convidados,DadosEnderecoDto endereco) {

    public DadosListagemEventos(Eventos eventos){
        this(eventos.getId(),eventos.getNome_evento(), eventos.getData(),eventos.getNumero_convidados(), new DadosEnderecoDto(eventos.getEndereco()));
    }
}
