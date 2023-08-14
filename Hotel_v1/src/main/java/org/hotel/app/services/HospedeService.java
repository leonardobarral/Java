package org.hotel.app.services;

import org.hotel.app.models.Hospede;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HospedeService implements IService<Hospede>{

    private final List<Hospede> Hospedes;

    public HospedeService() {
        Hospedes = new ArrayList<>();
    }

//    Não entendo esta parte
    private static class SingletonHelper{
        private static final HospedeService INSTANCEHOSPEDES = new HospedeService();
    }
    public static HospedeService GetInstance()
    {
        return SingletonHelper.INSTANCEHOSPEDES;
    }





    @Override
    public void Add(Hospede item) {
        Hospedes.add(item);
    }

    @Override
    public void Update(Hospede item) {
        Hospedes.add(item);
    }

    @Override
    public void remove(Hospede item) {

    }

    @Override
    public List<Hospede> GetAll() {
        return Hospedes;
    }

    @Override
    public Optional<Hospede> Get(int id) {
        return Optional.ofNullable(Hospedes.get(0));
    }
}
