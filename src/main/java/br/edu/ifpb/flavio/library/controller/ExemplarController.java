package br.edu.ifpb.flavio.library.controller;

import br.edu.ifpb.flavio.library.model.Exemplar;
import br.edu.ifpb.flavio.library.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/{idLivro}/e")
public class ExemplarController {
    @Autowired
    private ExemplarService exemplarService;

    // Get Exemplares at all
    @GetMapping
    public Collection<Exemplar> listarExemplar() {
        return this.exemplarService.getExemplar();
    }

    // Get Exemplares por ID
    @GetMapping("/{id}")
    public Exemplar getExemplarPorId(@PathVariable("id") Long idExemplar) {
        return this.exemplarService.getExemplarPorId(idExemplar);
    }


    // Inserir ou Atualizar Exemplares
    @PostMapping
    public Exemplar inserir(@RequestBody Exemplar exemplar) {
        return this.exemplarService.inserirOuAtualizar(exemplar);
    }

    @PutMapping("/{id}")
    public Exemplar atualizar(@RequestBody Exemplar exemplar) {
        return this.exemplarService.inserirOuAtualizar(exemplar);
    }


    // Deletar Exemplares
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable("id") Long id) {
        this.exemplarService.deletar(id);
    }
}
