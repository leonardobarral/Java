package org.example.repositories;

import org.example.models.Artista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Classe repository: Executa queries e comandos no banco de dados
public class ArtistaRepository extends BaseRepository implements IRepository<Artista>{
    @Override
    public Artista findById(Long id) throws Exception {
        //Defino a query que eu vou realizar no meu método de repositório
        var query = "SELECT * " +
                "FROM artista " +
                "WHERE id= ?";

        //Tento conectar no banco de dados e a partir desta conexão
        // ele prepara um comando a ser executado
        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query)){

            //Seta o parametro da minha query que está com ?
            ps.setLong(1, id);
            //Tentar criar uma execução de uma query
            try(ResultSet rs = ps.executeQuery()){
                //Se tiver um resultado
                if(rs.next()) {
                    //Tendo resultado, instancia um novo artista e devolve ele
                    return new Artista(
                      rs.getLong("id"),
                      rs.getString("nome"),
                            null
                    );
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

    public Artista findByName(String nome) throws  Exception
    {
        //Defino a query que eu vou realizar no meu método de repositório
        var query = "SELECT * " +
                "FROM artista " +
                "WHERE nome= ?";

        //Tento conectar no banco de dados e a partir desta conexão
        // ele prepara um comando a ser executado
        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query)){

            //Seta o parametro da minha query que está com ?
            ps.setString(1, nome);
            //Tentar criar uma execução de uma query
            try(ResultSet rs = ps.executeQuery()){
                //Se tiver um resultado
                if(rs.next()) {
                    //Tendo resultado, instancia um novo artista e devolve ele
                    return new Artista(
                            rs.getLong("id"),
                            rs.getString("nome"),
                            null
                    );
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

    @Override
    public List<Artista> findAll() throws Exception {
        var artistas = new ArrayList<Artista>();
        var query = "SELECT * FROM artista";

        //Tento conectar no banco de dados e a partir desta conexão
        // ele prepara um comando a ser executado
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            //Enquanto tiver resultados
            while(rs.next()){
                //Adicionar artista em artistas
                artistas.add(new Artista(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        null
                ));
            }

            return artistas;
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
    }

    public List<Artista> findAllByName(String nome) throws Exception {
        var artistas = new ArrayList<Artista>();
        var query = "SELECT * FROM artista WHERE nome LIKE '% ? %'";

        //Tento conectar no banco de dados e a partir desta conexão
        // ele prepara um comando a ser executado
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)){
            //Setar parametro
            ps.setString(1, nome);

            //Executar query
            ResultSet rs = ps.executeQuery();

            //Enquanto tiver resultados
            while(rs.next()){
                //Adicionar artista em artistas
                artistas.add(new Artista(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        null
                ));
            }

            return artistas;
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
    }
    @Override
    public void save(Artista artista) throws Exception {
        //Define a query
        var query = "INSERT INTO ARTISTA (NOME) VALUES (?)";
        //Tenta conectar com o banco
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            //seta os parametros
            ps.setString(1, artista.getNome());
            //Executa o comando
            ps.executeUpdate();
        }
    }

    @Override
    public void update(Artista artista) throws Exception {
        //Define a query
        var query = "UPDATE artista SET nome = ? WHERE id = ?";
        //Tenta conectar com o banco
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            //seta os parametros
            ps.setString(1, artista.getNome());
            ps.setLong(2, artista.getId());
            //Executa o comando
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(Long id) throws Exception {
        //Define a query
        var query = "DELETE artista WHERE id = ?";
        //Tenta conectar com o banco
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            //seta os parametros
            ps.setLong(1, id);
            //Executa o comando
            ps.executeUpdate();
        }
    }
}
