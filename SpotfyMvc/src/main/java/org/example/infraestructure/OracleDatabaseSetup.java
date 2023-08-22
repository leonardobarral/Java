package org.example.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleDatabaseSetup {

    private static final String DB_URL = "jdbc:oracle.fiap.com.br:thin:@localhost:1521:ORCL";
    private static final String DB_USER = "RM551472";
    private static final String DB_PASSWORD = "041093";

    public static void createTables() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            // Criar tabela Artista
            String createArtistaTable = "CREATE TABLE ARTISTA (" +
                    "ID NUMBER PRIMARY KEY," +
                    "NOME VARCHAR2(255) NOT NULL" +
                    ")";
            statement.execute(createArtistaTable);

            // Criar tabela Album
            String createAlbumTable = "CREATE TABLE ALBUM (" +
                    "ID NUMBER PRIMARY KEY," +
                    "TITULO VARCHAR2(255) NOT NULL," +
                    "ARTISTA_ID NUMBER," +
                    "FOREIGN KEY (ARTISTA_ID) REFERENCES ARTISTA(ID)" +
                    ")";
            statement.execute(createAlbumTable);

            // Criar tabela Musica
            String createMusicaTable = "CREATE TABLE MUSICA (" +
                    "ID NUMBER PRIMARY KEY," +
                    "NOME VARCHAR2(255) NOT NULL," +
                    "DURACAO DECIMAL(5,2) NOT NULL," +
                    "ALBUM_ID NUMBER," +
                    "FOREIGN KEY (ALBUM_ID) REFERENCES ALBUM(ID)" +
                    ")";
            statement.execute(createMusicaTable);

            // Criar tabela Playlist
            String createPlaylistTable = "CREATE TABLE PLAYLIST (" +
                    "ID NUMBER PRIMARY KEY," +
                    "NOME VARCHAR2(255) NOT NULL" +
                    ")";
            statement.execute(createPlaylistTable);

            // Criar tabela associativa para relacionamento M:N entre Musica e Playlist
            String createMusicaPlaylistTable = "CREATE TABLE MUSICA_PLAYLIST (" +
                    "MUSICA_ID NUMBER," +
                    "PLAYLIST_ID NUMBER," +
                    "PRIMARY KEY (MUSICA_ID, PLAYLIST_ID)," +
                    "FOREIGN KEY (MUSICA_ID) REFERENCES MUSICA(ID)," +
                    "FOREIGN KEY (PLAYLIST_ID) REFERENCES PLAYLIST(ID)" +
                    ")";
            statement.execute(createMusicaPlaylistTable);

            System.out.println("Tabelas criadas com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}
