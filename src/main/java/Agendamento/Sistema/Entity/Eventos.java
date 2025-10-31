package Agendamento.Sistema.Entity;


import Agendamento.Sistema.DTO.EventosDTO.AtualizarEventoDto;
import Agendamento.Sistema.DTO.EventosDTO.DadosCadastroEventos;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.util.Date;

@Table(name="eventos")
@Entity(name="Eventos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_evento;
    private Date data;
    private int numero_convidados;

    //@Enumerated(EnumType.STRING)
    //private Tarefa tarefa ;

    /*@OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Tarefas> tarefas = new ArrayList<>();*/

    @Embedded
    private Agendamento.Sistema.Entity.Endereco endereco;

    public Eventos(DadosCadastroEventos dados){
        this.nome_evento = dados.nome_evento();
        this.data= dados.data();
        this.numero_convidados = dados.numero_convidados();
        this.endereco = new Agendamento.Sistema.Entity.Endereco(dados.endereco());

    }


    public void atualizarEvento(@Valid AtualizarEventoDto dados){
        if(dados.data() !=null){
            this.data = dados.data();
        }
        if (dados.endereco() !=null){
            this.endereco.atualizarEndereco(dados.endereco());
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumero_convidados() {
        return numero_convidados;
    }

    public void setNumero_convidados(int numero_convidados) {
        this.numero_convidados = numero_convidados;
    }

    /*public List<Tarefas> getTarefas() {
        return tarefas;
    }*/

    /*public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }*/

    public Agendamento.Sistema.Entity.Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Agendamento.Sistema.Entity.Endereco endereco) {
        this.endereco = endereco;
    }
}
