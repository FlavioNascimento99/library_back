package br.edu.ifpb.flavio.library.repository;

import br.edu.ifpb.flavio.library.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    // Logica

}
