package org.hotel.app.services;

import java.util.Optional;
import java.util.List;

public interface IService<T> {
    void Add(T item);
    void Update(T item);
    void remove(T item);
    List<T> GetAll();
    Optional<T> Get(int id);
}
