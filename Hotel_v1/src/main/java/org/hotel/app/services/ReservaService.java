package org.hotel.app.services;

import org.hotel.app.models.Reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservaService implements IService<Reserva>{
    private final List<Reserva> Reservas;

    public ReservaService(){
        Reservas = new ArrayList<>();
    }

    private static class SingletonHelper{
        private static final ReservaService INSTANCERESERVAS = new ReservaService();
    }

    public static ReservaService GetInstance(){
        return SingletonHelper.INSTANCERESERVAS;
    }

    @Override
    public void Add(Reserva item) {
        Reservas.add(item);
    }

    @Override
    public void Update(Reserva item) {
        Reservas.add(item);
    }

    @Override
    public void remove(Reserva item) {

    }

    @Override
    public List<Reserva> GetAll() {
        return Reservas;
    }

    @Override
    public Optional<Reserva> Get(int id) {
        return Optional.empty();
    }
}
