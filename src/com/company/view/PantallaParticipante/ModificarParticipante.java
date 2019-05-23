package com.company.view.PantallaParticipante;

import com.company.model.Participante;

import java.util.Scanner;

public class ModificarParticipante {
    String modParticipante;

    public void mostrar() {
        Participante participante = new Participante();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que participante quieres modificar?");
        modParticipante = scanner.nextLine();

        System.out.println("Introduce el nuevo nombre del participante:");
        participante.nombre = scanner.nextLine();


        System.out.println("Introduce el nuevo nombre del equipo:");
        participante.nombredelequipo = scanner.nextLine();

    }
}
