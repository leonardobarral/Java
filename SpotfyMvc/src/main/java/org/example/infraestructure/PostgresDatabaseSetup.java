package org.example.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresDatabaseSetup {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/SpotifyMvc";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "root";

    public static void createTables() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            // Criar tabela Artista
            String createArtistaTable = "CREATE TABLE ARTISTA (" +
                    "ID SERIAL PRIMARY KEY," +
                    "NOME VARCHAR(255) NOT NULL" +
                    ")";
            statement.execute(createArtistaTable);

            // Criar tabela Album
            String createAlbumTable = "CREATE TABLE ALBUM (" +
                    "ID SERIAL PRIMARY KEY," +
                    "TITULO VARCHAR(255) NOT NULL," +
                    "ARTISTA_ID INTEGER REFERENCES ARTISTA(ID)" +
                    ")";
            statement.execute(createAlbumTable);

            // Criar tabela Musica
            String createMusicaTable = "CREATE TABLE MUSICA (" +
                    "ID SERIAL PRIMARY KEY," +
                    "NOME VARCHAR(255) NOT NULL," +
                    "DURACAO DECIMAL(5,2) NOT NULL," +
                    "ALBUM_ID INTEGER REFERENCES ALBUM(ID)" +
                    ")";
            statement.execute(createMusicaTable);

            // Criar tabela Playlist
            String createPlaylistTable = "CREATE TABLE PLAYLIST (" +
                    "ID SERIAL PRIMARY KEY," +
                    "NOME VARCHAR(255) NOT NULL" +
                    ")";
            statement.execute(createPlaylistTable);

            // Criar tabela associativa para relacionamento M:N entre Musica e Playlist
            String createMusicaPlaylistTable = "CREATE TABLE MUSICA_PLAYLIST (" +
                    "MUSICA_ID INTEGER REFERENCES MUSICA(ID)," +
                    "PLAYLIST_ID INTEGER REFERENCES PLAYLIST(ID)," +
                    "PRIMARY KEY (MUSICA_ID, PLAYLIST_ID)" +
                    ")";
            statement.execute(createMusicaPlaylistTable);

            System.out.println("Tabelas criadas com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}
