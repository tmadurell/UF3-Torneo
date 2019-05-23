package com.company.view.PantallaEquipo;

import com.company.manager.ManagerEquipo;

import java.io.IOException;
import java.util.Scanner;

public class ModificarEquipo {
    private Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        ManagerEquipo managerEquipo = new ManagerEquipo();

        System.out.println("1.2.Introduce la ID o el nombre del Equipo quieres modificar:");
        String equipo = scanner.nextLine();


        System.out.println("Que quieres modificar???");
        System.out.println("1.El nombre del equipo");
        System.out.println("2.Las siglas del equipo:");
        System.out.println("3.El nombre de la ciudad o país:\n");

        int opcion = scanner.nextInt();

        managerEquipo.modificar(equipo,opcion);


    }
}