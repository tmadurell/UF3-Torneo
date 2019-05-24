package com.company.view.PantallaEquipo;

import com.company.manager.ManagerEquipo;
import com.company.view.PantalladeMenus.MenuEquipos;

import java.io.IOException;
import java.util.Scanner;

public class EliminarEquipo {
    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        ManagerEquipo managerEquipo = new ManagerEquipo();

        System.out.println("1.3.¿Que equipo quieres eliminar (Introduce su ID o nombre)?\n");
        String equip = scanner.nextLine();

        managerEquipo.eliminar(equip);
        System.out.println("Se ha eliminado el equipo correctamente");
        System.out.println();
        MenuEquipos menuEquipos = new MenuEquipos();
        menuEquipos.mostrar();
    }
}
