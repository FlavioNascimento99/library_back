package br.edu.ifpb.flavio.library.controller;

import br.edu.ifpb.flavio.library.model.Livro;
import br.edu.ifpb.flavio.library.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/l")
public class LivroController {
    @Autowired
    private LivroService livroService;

    // Get Livros at all
    @GetMapping
    public Collection<Livro> listarLivros() {
        return this.livroService.getLivro();
    }

    // Get Livros por Id
    @GetMapping("/{id}")
    public Livro getUsuarioPorId(@PathVariable("id") Long idLivro) {
        return this.livroService.getLivroPorId(idLivro);
    }

    // Inserir ou Atualizar Livros
    @PostMapping
    public Livro inserir(@RequestBody Livro livro) {
        return this.livroService.inserirOuAtualizar(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizar(@RequestBody Livro livro) {
        return this.livroService.inserirOuAtualizar(livro);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable("id") Long id) {
        this.livroService.deletar(id);
    }
}
