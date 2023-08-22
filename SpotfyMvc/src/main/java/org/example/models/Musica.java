package org.example.models;

import java.util.List;

public class Musica extends BaseEntity{
    private String nome;
    private double duracao; // Em minutos
    private Artista artista;
    private Album album;

    public Musica(){}

    public Musica(Long id, String nome, double duracao, Artista artista, Album album) {
        super(id);
        this.nome = nome;
        this.duracao = duracao;
        this.artista = artista;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}

