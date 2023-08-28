package org.example.repositories;

import java.util.List;

public interface IRepository<T> {
    List<T> GetAll();
    T GetById(int Id);
    void Save(T item);
    void update(T item);
    void delete(int id);
}
