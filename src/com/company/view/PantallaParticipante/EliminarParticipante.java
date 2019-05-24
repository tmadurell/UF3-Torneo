package com.company.view.PantallaParticipante;

import com.company.manager.ManagerParticipante;
import com.company.view.PantalladeMenus.MenuParticipantes;

import java.io.IOException;
import java.util.Scanner;

public class EliminarParticipante {
    Scanner scanner = new Scanner(System.in);

    public void mostrar()throws IOException {
        ManagerParticipante managerParticipante = new ManagerParticipante();

        System.out.println("2.3.¿Que participante quieres eliminar (Introduce su ID o nombre)?");
        String participante = scanner.nextLine();

        managerParticipante.elminar(participante);
        System.out.println("Se ha eliminado el participante correctamente");
        System.out.println();
        MenuParticipantes menuParticipantes = new MenuParticipantes();
        menuParticipantes.mostrar();
    }
}
