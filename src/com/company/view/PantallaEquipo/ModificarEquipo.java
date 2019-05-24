package com.company.view.PantallaEquipo;

import com.company.manager.ManagerEquipo;
import com.company.view.PantalladeMenus.MenuEquipos;

import java.io.IOException;
import java.util.Scanner;

public class ModificarEquipo {
    private Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        ManagerEquipo managerEquipo = new ManagerEquipo();

        System.out.println("1.2.¿Que equipo quieres modificar (Introduce su ID o nombre)?");
        String modequipo = scanner.nextLine();


        System.out.println("¿Elige que quieres modificar?");
        System.out.println("1.El nombre del equipo");
        System.out.println("2.Las siglas del equipo:");
        System.out.println("3.El nombre de la ciudad o país:\n");

        int opcion = scanner.nextInt();

        managerEquipo.modificar(modequipo,opcion);
        System.out.println("\nSe han modificado los datos del equipo correctamente");
        System.out.println();
        MenuEquipos menuEquipos = new MenuEquipos();
        menuEquipos.mostrar();

    }
}