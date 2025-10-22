package Entity;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name="eventos")
@Entity(name="Eventos")
@Getter
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

    @Enumerated(EnumType.STRING)
    private Tarefa tarefa ;

    @Embedded
    private Endereco endereco;

    public Eventos(EventosDto dados){
        this.nome_evento = dados.nome_evento();
        this.data= dados.data();
        this.numero_convidados = dados.numero_convidados();
        this.tarefa = dados.tarefa();
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
}
