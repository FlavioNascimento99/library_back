package br.edu.ifpb.flavio.library.service;

import br.edu.ifpb.flavio.library.model.Livro;
import br.edu.ifpb.flavio.library.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    // Get Livros at all
    public Collection<Livro> getLivro() {
        return livroRepository.findAll();
    }

    // Get Livros por Id
    public Livro getLivroPorId(Long idLivro) {
        return this.livroRepository.findById(idLivro).orElse(null);
    }

    // Inserir ou Atualizar Livros
    public Livro inserirOuAtualizar(Livro livroToInsert) {
        return this.livroRepository.save(livroToInsert);
    }

    // Deletar Livro
    public void deletar(Long id) {
        this.livroRepository.deleteById(id);
    }
}
