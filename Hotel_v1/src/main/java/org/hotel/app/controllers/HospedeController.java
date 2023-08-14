package org.hotel.app.controllers;

import org.hotel.app.models.Hospede;
import org.hotel.app.services.HospedeService;

import java.util.Scanner;

public class HospedeController {
    private final HospedeService hospedeService;
    private Scanner scanner;

    public HospedeController(Scanner scanner) {
        hospedeService = HospedeService.GetInstance();
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void IniciarFormularioDeCadastroDeHospede()
    {
        System.out.println("Cadastro de Hospede");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("CPF: ");
        long cpf = Long.parseLong(scanner.next());

        System.out.println("Celular: ");
        String telNumber = scanner.next();

        System.out.println("E-mail: ");
        String email = scanner.next();

        System.out.println("idade:" );
        int idade = Integer.parseInt(scanner.next());

        System.out.println("CPF do Responsável:" );
        long idResponsavel = Long.parseLong(scanner.next());

        var hospede = new Hospede(cpf,nome,telNumber,email,idade,idResponsavel);

        hospedeService.Add(hospede);

        System.out.println("Cadastro realizado com sucesso!!! \nnome: " + nome + " cpf: "+cpf);
    }
    public void ConsultarListaDeHospedes()
    {
        for (var hospede:
                hospedeService.GetAll()){
            System.out.println(hospede.toString());
        }
    }

    public void ColsultaListaDeHospedesPorId()
    {
        System.out.println("CPF do Hospede:" );
        int id = Integer.parseInt(scanner.nextLine());

        var hospedeBuscado = hospedeService.Get(id);
        System.out.println(hospedeBuscado.toString());
    }


}
