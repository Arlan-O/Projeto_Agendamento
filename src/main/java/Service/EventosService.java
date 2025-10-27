package Service;

import DTO.EventosDTO.DadosCadastroEventos;
import Entity.Eventos;
import Repository.EventosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventosService {
    @Autowired
    private EventosRepository eventosRepository;

    @Transactional
    public Eventos criarEvento(DadosCadastroEventos dados){
        Eventos novoEvento = new Eventos();
        novoEvento.setNome(dados.nome_evento());
        novoEvento.setData(dados.data());
    }
}
