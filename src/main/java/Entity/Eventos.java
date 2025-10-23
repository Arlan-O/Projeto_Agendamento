package Entity;


import DTO.EventosDTO.AtualizarEventoDto;
import DTO.EventosDTO.EventosDto;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name="eventos")
@Entity(name="Evento")
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

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Tarefas> tarefas = new ArrayList<>();

    @Embedded
    private Endereco endereco;

    public Eventos(EventosDto dados){
        this.nome_evento = dados.nome_evento();
        this.data= dados.data();
        this.numero_convidados = dados.numero_convidados();
        this.tarefas = dados.tarefa();
        this.endereco = new Endereco(dados.endereco());

    }

    public void atualizarEvento(@Valid AtualizarEventoDto dados){
        if(dados.data() !=null){
            this.data = dados.data();
        }
        if (dados.numero_convidados() !=null){
            this.numero_convidados = dados.numero_convidados();
        }
        if (dados.tarefa() !=null){
            this.tarefa = dados.tarefa();
        }
        if (dados.endereco() !=null){
            this.endereco.atualizarEndereco(dados.endereco());
        }
    }

    public void setNome(@NotBlank String s) {
    }
}
