package org.example.models;

import java.util.List;

public class Album {
    private Long id;
    private String nome;
    private int anoLancamento;
    private List<Musica> musicas;
    private Artista artista;

    public Album(Long id, String nome, int anoLancamento, List<Musica> musicas, Artista artista) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
        this.artista = artista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
