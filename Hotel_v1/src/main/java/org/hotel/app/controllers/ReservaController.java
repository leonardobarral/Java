package org.hotel.app.controllers;

import org.hotel.app.models.Reserva;
import org.hotel.app.services.ReservaService;

import java.util.Scanner;

public class ReservaController {
    private final ReservaService reservaService;
    private Scanner scanner;

    public ReservaController(Scanner scanner){
        reservaService = ReservaService.GetInstance();
        this.scanner = scanner;
    }

    public Scanner getScanner(){
        return scanner;
    }

    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }

    public void IniciarFormularioDeCadastroDeReserva()
    {
        System.out.println("Cadastro de Reserva");
        int id = reservaService.GetAll().size()+1;
        System.out.println("CPF: ");
        long CPF = Long.parseLong(scanner.nextLine());
        System.out.println("Nome: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Número de Telefone: ");
        String telNumber = scanner.nextLine();
        System.out.println("E-mail: ");
        String email = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Data de Check-in: ");
        String dataDeCheckin = scanner.nextLine();
        System.out.println("Data de Check-out: ");
        String dataDeCheckout = scanner.nextLine();
        System.out.println("Tipo de quarto: ");
        String tipoDeQuartoouNumerodoquarto = scanner.nextLine();
        System.out.println("Preferência de cama: ");
        String preferenciaDeCama = scanner.nextLine();
        System.out.println("Forma de pagamento: ");
        int formaDePagamento = Integer.parseInt(scanner.nextLine());
        System.out.println("Número de Hospedes: ");
        int numeroDeHospedes = Integer.parseInt(scanner.nextLine());
        System.out.println("Status da Reserva: ");
        String status = scanner.nextLine();
        System.out.println("Informações Adicionais: ");
        String informacoesAdicionais = scanner.nextLine();
        var reserva = new Reserva(id,CPF,nomeCompleto,telNumber,email,idade,dataDeCheckin,dataDeCheckout,tipoDeQuartoouNumerodoquarto,preferenciaDeCama,formaDePagamento,numeroDeHospedes,status,informacoesAdicionais);
        reservaService.Add(reserva);
        System.out.println("Cadastro realizado com sucesso!!! \nnome: " + "YYY"+ " cpf: "+"XXX");
    }

    public void ConsultarListaDeReservas(){
        for (var reserva:
                reservaService.GetAll()){
            System.out.println(reserva.toString());
        }
    }
}
