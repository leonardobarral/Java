package org.example.repositories;

import org.example.models.Corrida;
import org.example.models.TipoCorrida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class CorridaRepository implements IRepository{

    protected static final String DB_URL = "jdbc:oracle:thin:@oralce.fiap.com.br:1521:orcl";
    protected static final String USER = "seu_usuario";
    protected static final String PASS = "sua_senha";

    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }


    @Override
    public List GetAll() {
        return null;
    }

    @Override
    public Object GetById(int Id) {
        return null;
    }

    @Override
    public void Save(Corrida item) throws Exception {

        //Define a query
        var query = "INSERT INTO CORRIDA (ORIGEM,DESTINO,DURACAO,VALOR,DISTANCIA,TIPO,MOTORISTA,PASSAGEIRO) VALUES (?,?,?,?,?,?,?,?)";


        //Tenta conectar com o banco
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            //seta os parametros
            ps.setString(1, item.getOrigem());
            ps.setString(2, item.getDestino());
            ps.setString(3, String.valueOf(item.getDuracao()));
            ps.setString(4, String.valueOf(item.getValor()));
            ps.setString(5, String.valueOf(item.getDistancia()));
            ps.setString(6, String.valueOf(item.getTipo()));
            ps.setString(7, item.getMotorista());
            ps.setString(8, item.getPassageiro());
            //Executa o comando
            ps.executeUpdate();
        }

    }

    @Override
    public void update(Object item) {

    }

    @Override
    public void delete(int id) {

    }
}
