package org.example.services;

import org.example.models.Artista;
import org.example.repositories.ArtistaRepository;

import java.util.List;

//CLasse service: realiza validações e outras regras de negócio e chamar as classes de repositorio
public class ArtistaService {

    //FACADE DESIGN PATTERN
    private final ArtistaRepository artistaRepository;

    public ArtistaService(){
        this.artistaRepository = new ArtistaRepository();
    }

    // FIM DO FACADE
    public Artista findById(Long id) throws Exception {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID inválido fornecido: " + id);
        }
        return artistaRepository.findById(id);
    }

    public List<Artista> findAll() throws Exception{
        return artistaRepository.findAll();
    }

    public boolean save(Artista artista) throws Exception {
        if (artista == null)
            throw new IllegalArgumentException("Artista fornecida é nulo");
        if (artista.getNome() == null || artista.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do artista é inválido");

        artistaRepository.save(artista);
        return true;
    }

    public boolean update(Artista artista) throws Exception {
        if (artista == null)
            throw new IllegalArgumentException("Artista fornecida é nulo");
        if (artista.getId() == null || artista.getId() == 0)
            throw new IllegalArgumentException("Id do artista fornecida é nulo");
        if (artista.getNome() == null || artista.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do artista é inválido");

        artistaRepository.update(artista);
        return true;
    }

    public boolean delete(Long id) throws Exception {
        if (id == null || id == 0)
            throw new IllegalArgumentException("Id do artista fornecida é nulo");
        artistaRepository.delete(id);
        return true;
    }
}
