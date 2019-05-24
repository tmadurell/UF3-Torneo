package com.company.view.PantallaParticipante;

import com.company.manager.ManagerParticipante;
import com.company.view.PantalladeMenus.MenuParticipantes;

import java.io.IOException;
import java.util.Scanner;



public class ModificarParticipante {
    private Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {
        ManagerParticipante managerParticipante = new ManagerParticipante();


        System.out.println("2.2.¿Que participante quieres modificar (Introduce su ID o nombre)?");
        String modparticipantes = scanner.nextLine();
        System.out.println("¿Que quieres modificar?\n");
        System.out.println("1.El nombre del participante");
        System.out.println("2.El nombre del equipo en el que esta el participante");

        int opcion = scanner.nextInt();

        managerParticipante.modificar(modparticipantes,opcion);
        System.out.println("\nSe han modificado los datos del participante correctamente");
        System.out.println();
        MenuParticipantes menuParticipantes = new MenuParticipantes();
        menuParticipantes.mostrar();
    }
}
