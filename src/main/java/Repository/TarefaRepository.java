package Agendamento.Sistema.Repository;

import Agendamento.Sistema.Entity.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefas, Long> {

}
