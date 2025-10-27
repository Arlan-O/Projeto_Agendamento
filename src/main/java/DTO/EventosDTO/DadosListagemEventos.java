package DTO.EventosDTO;

import DTO.DadosEnderecoDto;
import DTO.TarefaDTO.TarefaDto;
import Entity.Endereco;
import Entity.Eventos;

import java.util.Date;
import java.util.List;

public record DadosListagemEventos(String nome_evento, Date data, int numero_convidados,
                                   List<TarefaDto> tarefas, DadosEnderecoDto endereco) {
    public DadosListagemEventos(Eventos eventos){
        this(eventos.getNome_evento(), eventos.getData(),eventos.getNumero_convidados(),
                eventos.getTarefas().stream().map(TarefaDto::new).toList(),
                new DadosEnderecoDto(eventos.getEndereco()));
    }
}
