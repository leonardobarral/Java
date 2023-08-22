package org.example.services;

import org.example.models.Musica;
import org.example.repositories.MusicaRepository;

import java.util.List;

public class MusicaService {

    private MusicaRepository musicaRepository;

    public MusicaService() {

        this.musicaRepository = new MusicaRepository();
    }

    public Musica findById(Long id) throws Exception {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID inválido fornecido: " + id);
        }
        return musicaRepository.findById(id);
    }

    public List<Musica> findAll() throws Exception{
        return musicaRepository.findAll();
    }

    public boolean save(Musica musica) throws Exception {
        if (musica == null) {
            throw new IllegalArgumentException("Música fornecida é nula");
        }
        if (musica.getNome() == null || musica.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da música é inválido");
        }
        if (musica.getDuracao() <= 0) {
            throw new IllegalArgumentException("Duração da música é inválida: " + musica.getDuracao());
        }
        musicaRepository.save(musica);
        return true;
    }

    // Métodos similares para update e delete, com validações pertinentes.
}

