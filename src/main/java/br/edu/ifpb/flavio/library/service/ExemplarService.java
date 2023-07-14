package br.edu.ifpb.flavio.library.service;

import br.edu.ifpb.flavio.library.model.Exemplar;
import br.edu.ifpb.flavio.library.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ExemplarService {
    @Autowired
    private ExemplarRepository exemplarRepository;

    // Get Exemplares
    public Collection<Exemplar> getExemplar() {
        return exemplarRepository.findAll();
    }

    // Get Exemplares por ID
    public Exemplar getExemplarPorId(Long idExemplar) {
        return this.exemplarRepository.findById(idExemplar).orElse(null);
    }

    // Inserir ou Deletar Exemplares
    public Exemplar inserirOuAtualizar(Exemplar exemplarToInsert) {
        return this.exemplarRepository.save(exemplarToInsert);
    }

    // Deletar Exemplar
    public void deletar(Long id) {
        this.exemplarRepository.deleteById(id);
    }
}
