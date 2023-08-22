package org.example.controllers;


import org.example.models.Artista;
import org.example.models.Musica;
import org.example.services.ArtistaService;

import java.util.Scanner;

//Em projetos console, controller cuida de preencher os campos,
//Na web isso muda
public class ArtistaController {
    //FACADE do controller
    private ArtistaService artistaService;
    private Scanner scanner;

    public ArtistaController(){
        this.artistaService = new ArtistaService();
        this.scanner = new Scanner(System.in);
    }

    public void capturarEMontarArtista() {
        System.out.println("==== Adicionar Novo Artista ====");

        // Solicita o nome da música
        System.out.print("Digite o nome do artista: ");
        String nome = scanner.nextLine();

        // Monta o objeto artista
        var novoArtista = new Artista(
                null, nome, null);

        // Salva o artista usando o serviço
        try {
            artistaService.save(novoArtista);
            System.out.println("Artista adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar artista: " + e.getMessage());
        }
    }
}
