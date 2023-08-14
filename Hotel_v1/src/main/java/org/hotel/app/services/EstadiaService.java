package org.hotel.app.services;

import org.hotel.app.models.Estadia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EstadiaService implements IService<Estadia> {
    private final List<Estadia> Estadias;

    public EstadiaService() {
        Estadias = new ArrayList<>();
    }

    private static class SingletonHelper{
        private static final EstadiaService INSTANCEESTADIAS = new EstadiaService();
    }
    public static EstadiaService GetInstance(){
        return SingletonHelper.INSTANCEESTADIAS;
    }


    @Override
    public void Add(Estadia item) {
        Estadias.add(item);

    }

    @Override
    public void Update(Estadia item) {
        Estadias.add(item);

    }

    @Override
    public void remove(Estadia item) {

    }

    @Override
    public List<Estadia> GetAll() {
        return Estadias;
    }

    @Override
    public Optional<Estadia> Get(int id) {
        return Optional.empty();
    }
}
