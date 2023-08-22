package org.example.models;

import java.util.List;

public class Artista extends BaseEntity{
    private String nome;
    private List<Album> albuns;

    public Artista(Long id, String nome, List<Album> albuns) {
        super(id);
        this.nome = nome;
        this.albuns = albuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }
}
