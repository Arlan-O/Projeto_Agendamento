package Agendamento.Sistema.Controller;

import Agendamento.Sistema.DTO.EventosDTO.AtualizarEventoDto;
import Agendamento.Sistema.DTO.EventosDTO.DadosCadastroEventos;
import Agendamento.Sistema.DTO.EventosDTO.DadosListagemEventos;
import Agendamento.Sistema.Entity.Eventos;
import Agendamento.Sistema.Repository.EventosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
@CrossOrigin(origins = "*")
public class EventosController {

    @Autowired
    private EventosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarEvento(@RequestBody @Valid DadosCadastroEventos dados){
        repository.save(new Eventos(dados));
    }

    @GetMapping
    public Page<DadosListagemEventos> listar(@PageableDefault (size= 6, sort = {"data"})Pageable page){
        return repository.findAll(page).map(DadosListagemEventos::new);
    }
    @PutMapping
    @Transactional
    public void atualizarEventos(@RequestBody @Valid AtualizarEventoDto dados){
        var evento = repository.getReferenceById(dados.id());
        evento.atualizarEvento(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable long id){
        repository.deleteById(id);
    }
}
