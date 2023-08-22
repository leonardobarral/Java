package org.example;

import org.example.components.MainMenuComponent;
import org.example.infraestructure.OracleDatabaseSetup;
import org.example.infraestructure.PostgresDatabaseSetup;
import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Strings;

public class Main {
    //A classe main é preparar tudo do seu programa antes de você começar a usar
    public static void main(String[] args) {
        OracleDatabaseSetup setup = new OracleDatabaseSetup();
//        PostgresDatabaseSetup setup = new PostgresDatabaseSetup();
        setup.createTables();
        MainMenuComponent menu = new MainMenuComponent();
        menu.exibirMenu();
    }
}