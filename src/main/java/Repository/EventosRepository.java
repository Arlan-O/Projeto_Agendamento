package Agendamento.Sistema.Repository;

import Agendamento.Sistema.Entity.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventosRepository extends JpaRepository<Eventos, Long> {
}
