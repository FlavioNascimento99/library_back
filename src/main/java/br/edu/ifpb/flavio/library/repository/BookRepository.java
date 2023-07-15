package br.edu.ifpb.flavio.library.repository;

import br.edu.ifpb.flavio.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    // Logica

}
