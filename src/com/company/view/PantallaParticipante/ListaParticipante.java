package com.company.view.PantallaParticipante;

import com.company.manager.ManagerParticipante;
import com.company.model.Participante;
import com.company.view.PantalladeMenus.MenuParticipantes;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListaParticipante {
    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {

        System.out.println("2.4.Lista de participantes:");

        List<Participante> participantes = ManagerParticipante.obtenerParticipante();

        for (Participante participante : participantes){
            System.out.println("ID:" + participante.id + "  " + "Nombre:" + participante.nombre + "  " + "Equipo:" + participante.nombredelequipo);
            System.out.println();
            MenuParticipantes menuParticipantes = new MenuParticipantes();
            menuParticipantes.mostrar();
        }
    }
}
