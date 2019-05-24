package com.company.view.PantallaClasificacion;

import com.company.manager.ManagerClasificacion;
import com.company.model.Clasificacion;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListaClasificacionEquipo {
    public void mostrar() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de clasificacion en equipos:");

        List<Clasificacion> clasificacions = ManagerClasificacion.listaClasificacionEquipo();

        for(Clasificacion clasificacion : clasificacions){
            System.out.println("Equipo local: " + clasificacion.nombreEquipoLocal + "  " + "Resultado: " + clasificacion.Puntosclasificacionlocal + " VS. " + "Participante visitante: " + clasificacion.nombreEquipoVisitante + "  " + "Resultado: " + clasificacion.PuntosClasificacionVisitante);
        }
        System.out.println();
        MenuEquipoClasificacion menuEquipoClasificacion = new MenuEquipoClasificacion();
        menuEquipoClasificacion.mostrar();
    }
}
