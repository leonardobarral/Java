package org.hotel.app.controllers;

import org.hotel.app.models.Quarto;
import org.hotel.app.services.QuartoService;

import java.util.Scanner;

public class QuartoController {

    private final QuartoService quartoService;

    private Scanner scanner;

    public QuartoController(Scanner scanner) {
        quartoService = QuartoService.GetInstance();
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void IniciarFormularioDeCadastroDeQuarto()
    {
        System.out.println("Cadastro de Quarto");

        System.out.println("Número: ");
        int id = Integer.parseInt(scanner.next());

        System.out.println("Tipo: ");
        String tipo = scanner.next();

        System.out.println("Andar: ");
        String andar = scanner.next();

        System.out.println("Número máximo de Hospedes: " );
        int  numeroMaximoDeHospedes = Integer.parseInt(scanner.next());

        System.out.println("Status: " );
        String status = scanner.next();

        var quarto = new Quarto(id,tipo,andar,status,numeroMaximoDeHospedes);

        quartoService.Add(quarto);

        System.out.println("Cadastro realizado com sucesso!!! \nQuarto número: " + id + " Andar: "+andar);
    }

    public void ConsultarListaDeQuartos(){
        for (var quarto:
            quartoService.GetAll()){
                System.out.println(quarto.toString());
        }
    }
}
