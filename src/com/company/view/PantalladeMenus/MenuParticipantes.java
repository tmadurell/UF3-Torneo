package com.company.view.PantalladeMenus;

import com.company.view.PantallaParticipante.EliminarParticipante;
import com.company.view.PantallaParticipante.InscribirParticipante;
import com.company.view.PantallaParticipante.ListaParticipante;
import com.company.view.PantallaParticipante.ModificarParticipante;

import java.io.IOException;
import java.util.Scanner;


public class MenuParticipantes {
    public void mostrar() throws IOException {

        Scanner scanner = new Scanner(System.in);


        System.out.println("2)Participantes");
        System.out.println("    1.Inscribir participantes");
        System.out.println("    2.Modificar participantes");
        System.out.println("    3.Borrar participantes");
        System.out.println("    4.Listar participantes");
        System.out.println("    5.Volver al menu principal");
        System.out.println("    6.Salir del programa");
        System.out.println();

        int opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                new InscribirParticipante().mostrar();
                break;
            case 2:
                new ModificarParticipante().mostrar();
                break;
            case 3:
                new EliminarParticipante().mostrar();
                break;
            case 4:
                new ListaParticipante().mostrar();
                break;
            case 5:
                MenuMain menuMain = new MenuMain();
                menuMain.mostrar();
            default:
                System.out.println("Error: Opción no valida");
                System.out.println();
                MenuParticipantes menuParticipantes = new MenuParticipantes();
                menuParticipantes.mostrar();
        }

    }
}
