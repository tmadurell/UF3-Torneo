package com.company.view.PantalladeMenus;

import java.io.IOException;
import java.util.Scanner;


public class MenuMain {

    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        while(true) {
            System.out.println("TORNEO PLUS");
            System.out.println("Menu Principal");
            System.out.println("1. Equipos");
            System.out.println("2. Participantes");
            System.out.println("3. Resultado ");
            System.out.println("4. Clasificación");
            System.out.println("5. Salir del programa");
            System.out.println();


            Scanner scanner = new Scanner(System.in);

            String opcion = scanner.nextLine();
            if ("1".equals(opcion)) {
                new MenuEquipos().mostrar();
                break;

            } else if ("2".equals(opcion)) {
                new MenuParticipantes().mostrar();
                break;

            } else if ("3".equals(opcion)) {
                new MenuResultado().mostrar();
                break;

            } else if ("4".equals(opcion)) {
                new MenuClasificacion().mostrar();
                break;

            } else if ("5".equals(opcion)) {
                System.exit(0);
            }

            else{
                System.out.println("Error: Opción no valida");
                System.out.println();
                MenuMain menuMain = new MenuMain();
                menuMain.mostrar();


            }
        }
    }
}
