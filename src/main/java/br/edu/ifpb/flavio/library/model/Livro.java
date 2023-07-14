package br.edu.ifpb.flavio.library.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "Livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String autor;
    private String descricao;
    @OneToMany(mappedBy = "Livro", cascade = CascadeType.ALL)
    private Collection<Exemplar> exemplares;

    public Livro() {

        this.exemplares = new HashSet<>();

    }

    // Getters
    public Collection<Exemplar> getExemplares() {
        return exemplares;
    }

    public Long getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getDescricao() {
        return descricao;
    }


    // Setters
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
