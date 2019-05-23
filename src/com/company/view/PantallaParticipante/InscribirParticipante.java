package com.company.view.PantallaParticipante;

import com.company.manager.ManagerParticipante;
import com.company.model.Participante;
import com.company.view.PantalladeMenus.MenuParticipantes;

import java.io.IOException;
import java.util.Scanner;

public class InscribirParticipante {

    Scanner scanner = new Scanner(System.in);


    public void mostrar() throws IOException {

        Participante participantes = new Participante();
        ManagerParticipante managerParticipante = new ManagerParticipante();

        System.out.println("2.1.Inscribir un participante");

        System.out.println("Nombre del participante:");
        participantes.nombre = scanner.nextLine();

        System.out.println("Nombre del equipo en el que está inscrito el participante:");
        participantes.nombredelequipo = scanner.nextLine();
        System.out.println();

//      ManagerParticipante.id(participantes);
        ManagerParticipante.crearParticipante(participantes);

        System.out.println();
        MenuParticipantes menuParticipantes = new MenuParticipantes();
        menuParticipantes.mostrar();
    }
}
