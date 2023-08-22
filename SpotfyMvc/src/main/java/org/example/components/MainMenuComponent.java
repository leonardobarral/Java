package org.example.components;

import org.example.controllers.ArtistaController;
import org.example.controllers.MusicaController;

import java.util.Scanner;

public class MainMenuComponent {

    private MusicaController musicaController;
    private ArtistaController artistaController;
    private Scanner scanner;

    public MainMenuComponent() {
        this.musicaController = new MusicaController();
        this.artistaController = new ArtistaController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("==== Menu Principal ====");
            System.out.println("1. Adicionar nova música");
            System.out.println("2. Adicionar novo artista");
            System.out.println("3. Adicionar novo genero")
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcao) {
                case 1:
                    musicaController.capturarEMontarMusica();
                    break;

                case 2:
                    artistaController.capturarEMontarArtista();
                    break;

                case 3:
                    generoController.capturarEMontarGenero();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
