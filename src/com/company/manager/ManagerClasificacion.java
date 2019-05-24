package com.company.manager;

import com.company.Crear;
import com.company.model.Clasificacion;
import com.company.view.PantallaClasificacion.MenuParticipanteClasificacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.model.Clasificacion.*;
import static com.company.model.Clasificacion.PuntosClasificacionVisitante;
import static java.lang.System.in;

public class ManagerClasificacion {
    Scanner scanner = new Scanner(in);

    public static List<Clasificacion> listaClasificacionEquipo() throws IOException {


        List<Clasificacion> clasificacions = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.clasificacionPFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            Clasificacion clasificacion = new Clasificacion();
            nombreEquipoLocal = values[0];
            Puntosclasificacionlocal = Integer.valueOf(values[1]);
            nombreEquipoVisitante = values[2];
            PuntosClasificacionVisitante = Integer.valueOf(values[3]);

            clasificacions.add(clasificacion);
        }
        inputStream.close();

        return clasificacions;

    }
    public void crearClasificacionEquipo (Clasificacion clasificacions) throws IOException {
        System.out.println("Introduce el nombre del equipo local:");
        Clasificacion.nombreEquipoLocal = scanner.nextLine();

        System.out.println("Introduce los puesto que ha hecho el equipo local:");
        Clasificacion.Puntosclasificacionlocal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el nombre del participante visitante:");
        Clasificacion.nombreEquipoVisitante = scanner.nextLine();

        System.out.println("Introduce los puesto que ha hecho el equipo visitante:");
        Clasificacion.PuntosClasificacionVisitante = scanner.nextInt();


        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Crear.clasificacionEFile, true));

        outputStream.write(nombreEquipoLocal + Crear.SEPARATOR + Puntosclasificacionlocal + Crear.SEPARATOR + nombreEquipoVisitante + Crear.SEPARATOR + PuntosClasificacionVisitante + "\n");

        outputStream.close();

        System.out.println("\n Se han introducido la clasificacion del equipo correctamente.");
        MenuParticipanteClasificacion menuParticipanteClasificacion= new MenuParticipanteClasificacion();
        menuParticipanteClasificacion.mostrar();

    }





    public static List<Clasificacion> listaClasificacionParticipantes() throws IOException {


        List<Clasificacion> clasificacions = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.clasificacionPFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            Clasificacion clasificacion = new Clasificacion();
            nombreParticipanteLocal = values[0];
            Puntosclasificacionlocal = Integer.valueOf(values[1]);
            nombreParticipanteVisitante = values[2];
            PuntosClasificacionVisitante = Integer.valueOf(values[3]);

            clasificacions.add(clasificacion);
        }
        inputStream.close();

        return clasificacions;

    }
    public void crearClasificacionParticipantes (Clasificacion clasificacions) throws IOException {
        System.out.println("Introduce el nombre del participante local:");
        Clasificacion.nombreParticipanteLocal = scanner.nextLine();

        System.out.println("Introduce los puesto que ha hecho el participante local:");
        Clasificacion.Puntosclasificacionlocal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el nombre del participante visitante:");
        Clasificacion.nombreParticipanteVisitante = scanner.nextLine();

        System.out.println("Introduce los puesto que ha hecho el participante visitante:");
        Clasificacion.PuntosClasificacionVisitante = scanner.nextInt();


        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Crear.clasificacionPFile, true));

        outputStream.write(nombreParticipanteLocal + Crear.SEPARATOR + Puntosclasificacionlocal + Crear.SEPARATOR + nombreParticipanteVisitante + Crear.SEPARATOR + PuntosClasificacionVisitante + "\n");

        outputStream.close();

        System.out.println("\n Se han introducido la clasificacion del participante correctamente.");
        MenuParticipanteClasificacion menuParticipanteClasificacion= new MenuParticipanteClasificacion();
        menuParticipanteClasificacion.mostrar();

    }
}
