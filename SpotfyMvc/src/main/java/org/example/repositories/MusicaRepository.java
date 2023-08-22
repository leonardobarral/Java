package org.example.repositories;

import org.example.models.Musica;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class
MusicaRepository extends BaseRepository implements IRepository<Musica>{

    @Override
    public Musica findById(Long id) throws Exception {
        String query = "SELECT * FROM musica WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Musica musica = new Musica();
                    musica.setId(rs.getLong("id"));
                    musica.setNome(rs.getString("nome"));
                    musica.setDuracao(rs.getDouble("duracao"));
                    // Aqui, você pode também obter o artista associado se necessário
                    return musica;
                }
            }
        }
        catch (SQLException e) {
            if(e.getErrorCode() == 1017) { // Erro de login/senha inválido
                throw new Exception("Falha de autenticação ao conectar ao banco de dados.", e);
            } else if(e.getErrorCode() == 904) { // Erro de coluna inválida
                throw new Exception("A query contém uma coluna inválida.", e);
            } else {
                throw new Exception("Erro ao executar a query.", e);
            }
        }
        return null;
    }

    public List<Musica> findAll() throws Exception {
        List<Musica> musicas = new ArrayList<>();
        String query = "SELECT * FROM musica";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Musica musica = new Musica();
                musica.setId(rs.getLong("id"));
                musica.setNome(rs.getString("nome"));
                musica.setDuracao(rs.getDouble("duracao"));
                musicas.add(musica);
            }
        }
        return musicas;
    }

    public void save(Musica musica) throws Exception {
        String query = "INSERT INTO MUSICA (NOME, DURACAO, ALBUM_ID) VALUES (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, musica.getNome());
            ps.setDouble(2, musica.getDuracao());
            if (musica.getAlbum() != null) {
                ps.setLong(3, musica.getAlbum().getId());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }
            ps.executeUpdate();
        }
    }

    public void update(Musica musica) throws Exception {
        String query = "UPDATE musica SET nome = ?, duracao = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, musica.getNome());
            ps.setDouble(2, musica.getDuracao());
            ps.setLong(3, musica.getId());
            ps.executeUpdate();
        }
    }

    public void delete(Long id) throws Exception {
        String query = "DELETE FROM musica WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }
}

