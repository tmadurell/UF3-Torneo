package com.company.view.PantallaEquipo;

import com.company.manager.ManagerEquipo;

import java.io.IOException;
import java.util.Scanner;

public class EliminarEquipo {
    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        ManagerEquipo managerEquipo = new ManagerEquipo();

        System.out.println("Introduce ID o Nombre de Equipo quieres eliminar???\n");
        String equip = scanner.nextLine();

        //ManagerEquipo.eliminar(equip);
    }
}
