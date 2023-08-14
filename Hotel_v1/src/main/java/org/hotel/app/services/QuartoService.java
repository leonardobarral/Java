package org.hotel.app.services;

import org.hotel.app.models.Quarto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuartoService implements IService<Quarto> {

    private final List<Quarto> Quartos;

    public QuartoService() {
        Quartos = new ArrayList<>();
    }

    //    Não entendo esta parte
    private static class SingletonHelper{
        private static final QuartoService INSTANCEQUARTOS = new QuartoService();
    }
    public static QuartoService GetInstance()
    {
        return SingletonHelper.INSTANCEQUARTOS;
    }





    @Override
    public void Add(Quarto item) {
        Quartos.add(item);
    }

    @Override
    public void Update(Quarto item) {
        Quartos.add(item);
    }

    @Override
    public void remove(Quarto item) {

    }

    @Override
    public List<Quarto> GetAll() {
        return Quartos;
    }

    @Override
    public Optional<Quarto> Get(int id) {
        return Optional.empty();
    }
}
