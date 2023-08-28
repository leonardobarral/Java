package org.example;

import org.example.models.Corrida;
import org.example.repositories.CorridaRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var corridaRepository = new CorridaRepository();
        var sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Origem: ");
        String origem = sc.nextLine();
        System.out.println("Destino: ");
        String destino = sc.nextLine();
        System.out.println("Duração: ");
        int duracao = Integer.parseInt(sc.nextLine());

        var corrida = new Corrida();

        corrida.setOrigem(origem);
        corrida.setDestino(destino);
        corrida.setDuracao(duracao);

    }
}