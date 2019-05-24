package com.company.view.PantallaClasificacion;


import com.company.manager.ManagerClasificacion;
import com.company.model.Clasificacion;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListaClasificacionParticipantes {

    public void mostrar() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de clasificacion en participantes:");

        List<Clasificacion> clasificacions = ManagerClasificacion.listaClasificacionParticipantes();

        for(Clasificacion clasificacion : clasificacions){
            System.out.println("Participante local: " + clasificacion.nombreParticipanteLocal + "  " + "Resultado: " + clasificacion.Puntosclasificacionlocal + " VS. " + "Participante visitante: " + clasificacion.nombreParticipanteVisitante + "  " + "Resultado: " + clasificacion.PuntosClasificacionVisitante);
        }
        System.out.println();
        MenuParticipanteClasificacion menuParticipanteClasificacion = new MenuParticipanteClasificacion();
        menuParticipanteClasificacion.mostrar();
    }
}
