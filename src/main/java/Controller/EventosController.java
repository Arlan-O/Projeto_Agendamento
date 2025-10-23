package Controller;

import DTO.EventosDTO.DadosCadastroEventos;
import Entity.Eventos;
import Repository.EventosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventosController {

    @Autowired
    private EventosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarEvento(@RequestBody @Valid DadosCadastroEventos dados){
        repository.save(new Eventos(dados));
    }
    @GetMapping
    public Page<DadosListagemEventos> listar(@PageableDefault (size= 6, sort = {"nome_evento"})Pageable page){
        return repository.findAll(page).map(DadosListagemEventos::new);
    }
}
