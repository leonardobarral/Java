package org.example.repositories;

import org.example.models.Musica;

import java.util.List;

public interface IRepository<T> {

    public T findById(Long id) throws Exception;
    public List<T> findAll() throws Exception;
    public void save(T object) throws Exception;
    public void update(T object) throws Exception;
    public void delete(Long id) throws Exception;
}
