package br.edu.ifpb.flavio.library.service;

import br.edu.ifpb.flavio.library.model.Book;
import br.edu.ifpb.flavio.library.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class libService {
    private final BookRepository bookRepository;

    public libService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Get Livros at all
    public Collection<Book> getBooks() {
        return bookRepository.findAll();
    }

    // Get Livros por Id
    @Transactional
    public Book getBookById(Long idLivro) {
        return this.bookRepository.findById(idLivro).orElse(null);
    }

    // Inserir ou Atualizar Livros
    @Transactional
    public Book insertOrUpdateBook(Book livroToInsert) {
        return this.bookRepository.save(livroToInsert);
    }

    // Deletar Livro
    @Transactional
    public void deleteBook(Long id) {
        this.bookRepository.deleteById(id);
    }
}
