package com.company.view.PantalladeMenus;

import com.company.view.PantallaEquipo.EliminarEquipo;
import com.company.view.PantallaEquipo.InscribirEquipo;
import com.company.view.PantallaEquipo.ListaEquipo;
import com.company.view.PantallaEquipo.ModificarEquipo;

import java.io.IOException;
import java.util.Scanner;

public class MenuEquipos {

    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        System.out.println("1)Equipo");
        System.out.println("    1.Inscribir equipo");
        System.out.println("    2.Modificar equipo");
        System.out.println("    3.Borrar equipo");
        System.out.println("    4.Listar equipo");
        System.out.println("    5.Volver al menu principal");
        System.out.println("    6.Salir del programa");
        System.out.println();

        int opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                new InscribirEquipo().mostrar();
                break;
            case 2:
                new ModificarEquipo().mostrar();
                break;
            case 3:
                new EliminarEquipo().mostrar();
                break;
            case 4:
                new ListaEquipo().mostrar();
                break;
            case 5:
                MenuMain menuMain = new MenuMain();
                menuMain.mostrar();
            case 6:
                System.exit(0);
            default:
                System.out.println("Error: Opción no valida");
                System.out.println();
                MenuEquipos menuEquipos = new MenuEquipos();
                menuEquipos.mostrar();
        }
    }
}
