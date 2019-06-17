package br.com.alura.forum.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private Long id;
    private String nome;
    private List<Subcategoria> subcategorias = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }
}
