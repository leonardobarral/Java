package org.hotel.app.controllers;

import org.hotel.app.services.EstadiaService;

import java.util.Scanner;

public class EstadiaController {
    private final EstadiaService estadiaService;
    private Scanner scanner;

    public EstadiaController(Scanner scanner){
        estadiaService = EstadiaService.GetInstance();
        this.scanner = scanner;
    }
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }
    public Scanner getScanner(){
        return scanner;
    }

    public void IniciarFormularioDeCadastroDeEstadia()
    {
        System.out.println("Cadastro de Reserva");
        int id = estadiaService.GetAll().size()+1;

    }


    public void ConsultaListaDeEstadias(){
        for (var estadia:
                estadiaService.GetAll()){
            System.out.println(estadia.toString());
        }
    }

}
