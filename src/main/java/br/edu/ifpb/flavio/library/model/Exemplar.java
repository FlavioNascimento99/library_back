package br.edu.ifpb.flavio.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Exemplar")
public class Exemplar {
    @Id
    private Long id;
    private Number numero;
    private Boolean disponivel;
    @ManyToOne
    @JoinColumn(name = "Livro_id")
    private Livro livro;

    public Exemplar() {

        // Construtor

    }
    public Number getNumero() {
        return numero;
    }
    public Boolean isDisponivel() {
        return disponivel;
    }
    public Livro getLivro() {
        return livro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
