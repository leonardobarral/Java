package org.example.repositories;

import org.example.models.Genero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class
GeneroRepository  extends BaseRepository implements IRepository{
    @Override
    public Object findById(Long id) throws Exception {
        String query = "SELECT * FROM genero WHERE id = ?";
        try (Connection connection = getConnection();
            PreparedStatement ps = getConnection().prepareStatement(query)){
            ps.setLong(1,id);
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()){
                    Genero genero = new Genero();
                    genero.setId(rs.getLong("id"));
                    genero.setNome(rs.getString("Nome"));
                    return musica;
                }

            }

        }
        return null;
    }

    @Override
    public List findAll() throws Exception {
        return null;
    }

    @Override
    public void save(Object object) throws Exception {

    }

    @Override
    public void update(Object object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
