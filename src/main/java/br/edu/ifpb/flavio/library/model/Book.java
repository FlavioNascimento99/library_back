package br.edu.ifpb.flavio.library.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String autor;
    @NotNull
    private String description;
    @NotNull
    private Integer exemplar;


    public Book() {

    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAutor() {
        return autor;
    }
    public String getDescription() {
        return description;
    }

    public Integer getExemplar() {
        return exemplar;
    }


    // Setters
    public void setTitle(String titulo) {
        this.title = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDescription(String descricao) {
        this.description = descricao;
    }

    public void setExemplar(Integer exemplar) {
        this.exemplar = exemplar;
    }
}
