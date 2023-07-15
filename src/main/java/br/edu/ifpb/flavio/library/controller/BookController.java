package br.edu.ifpb.flavio.library.controller;

import br.edu.ifpb.flavio.library.model.Book;
import br.edu.ifpb.flavio.library.service.libService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/library")
public class BookController {
    @Autowired
    private libService libService;

    // Get Livros at all
    @GetMapping
    public Collection<Book> getBooks() {
        return this.libService.getBooks();
    }

    // Get Livros por Id
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long idBook) {
        return this.libService.getBookById(idBook);
    }

    // Inserir ou Atualizar Livros
    @PostMapping
    public Book insertBook(@RequestBody Book book) {
        return this.libService.insertOrUpdateBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book) {
        return this.libService.insertOrUpdateBook(book);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        this.libService.deleteBook(id);
    }
}
