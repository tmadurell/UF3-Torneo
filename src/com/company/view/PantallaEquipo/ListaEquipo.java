package com.company.view.PantallaEquipo;

import com.company.manager.ManagerEquipo;
import com.company.model.Equipo;
import com.company.view.PantalladeMenus.MenuEquipos;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListaEquipo {

    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {

        System.out.println("1.4.Lista de Equipos:");
        System.out.println("Estos son los equipos registrados:");

        List<Equipo> equipos = ManagerEquipo.obtenerEquipo();

        for (Equipo equipo : equipos){
            int contador;
            for (contador=1; contador<=10; contador++)
            System.out.println("ID:" + equipo.id + "  " + "Nombre:" + equipo.nombre + "  " + "Siglas:" + equipo.siglasdelequipo + "  " + "Ciudad:" + equipo.ciudad);
            System.out.println();
            MenuEquipos menuEquipos = new MenuEquipos();
            menuEquipos.mostrar();
        }
    }
}
