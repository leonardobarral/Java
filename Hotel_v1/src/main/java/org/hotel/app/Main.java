package org.hotel.app;

    //1 - classes model (Reserva, quarto, hospede, Etc...)
    //2 - Classes services (ListaDeObjetos, CRUD, singleton)
    //3 - Classes controller (formularios para preenhcer as informações)
    //4 - Classes main de menu....

import org.hotel.app.controllers.EstadiaController;
import org.hotel.app.controllers.HospedeController;
import org.hotel.app.controllers.QuartoController;
import org.hotel.app.controllers.ReservaController;
import org.hotel.app.models.Reserva;

import java.util.Scanner;

public class Main {
    static HospedeController hospedeController;
    static QuartoController quartoController;
    static ReservaController reservaController;
    static EstadiaController estadiaController;
    public static void main(String[] args) {
        System.out.println("Bem vindo a Rede de Hotel!");
        var scanner = new Scanner(System.in);
        hospedeController = new HospedeController(scanner);
        quartoController = new QuartoController(scanner);
        reservaController = new ReservaController(scanner);
        estadiaController = new EstadiaController(scanner);
        MenuPrincipal(scanner);

    }
    public static void MenuPrincipal(Scanner scanner){
        System.out.println("""
                1 - Cadastrar Hospedes
                2 - Consultar Hospedes      
                3 - Cadastrar Quartos          
                4 - Consultar Quartos          
                5 - Cadastrar Reservas          
                6 - Consultar Reservas   
                7 - Cadastrar Estadia
                8 - Consultar Estadia      
                """);

        var opcao = 0;

        while (opcao == 0 ){

            try{
                var textoOpcao = scanner.nextLine();
                opcao = Integer.parseInt(textoOpcao);
            }catch (Exception e){
                System.out.println("Opção Inválida");
            }
        }

        while (opcao != 0){
            switch (opcao){

                case 1 -> hospedeController.IniciarFormularioDeCadastroDeHospede();
                case 2 -> hospedeController.ConsultarListaDeHospedes();
                case 3 -> quartoController.IniciarFormularioDeCadastroDeQuarto();
                case 4 -> quartoController.ConsultarListaDeQuartos();
                case 5 -> reservaController.IniciarFormularioDeCadastroDeReserva();
                case 6 -> reservaController.ConsultarListaDeReservas();
//                case 7 -> estadiaController.IniciarFormularioDeCadastroDeEstadias();
                case 8 -> estadiaController.ConsultaListaDeEstadias();
                case 9 -> hospedeController.ColsultaListaDeHospedesPorId();

            }
            MenuPrincipal(scanner);
            opcao = scanner.nextInt();
        }

        System.exit(0);



    }



}