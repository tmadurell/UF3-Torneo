package com.company.view.PantalladeMenus;

import com.company.manager.ManagerClasificacion;
import com.company.view.PantallaClasificacion.MenuEquipoClasificacion;

import java.io.IOException;
import java.util.Scanner;


public class MenuClasificacion {

    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {

        System.out.println("4)Clasificacion");
        System.out.println("    1.Por equipos");
        System.out.println("    2.Por participantes");
        System.out.println("    3.Volver al menu principal");
        System.out.println("    4.Salir del programa");
        System.out.println();

        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                new MenuEquipoClasificacion().mostrar();
                break;
            case 2:
                new ManagerClasificacion().ClasificationParticipantes();
                break;
            case 3:
                MenuMain menuMain = new MenuMain();
                menuMain.mostrar();
            case 4:
                System.exit(0);
            default:
                System.out.println("Error: Opción no valida");
                System.out.println();
                MenuClasificacion menuClasificacion = new MenuClasificacion();
                menuClasificacion.mostrar();
        }
    }
}
