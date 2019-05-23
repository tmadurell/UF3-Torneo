package com.company.manager;

import com.company.Crear;
import com.company.model.Equipo;
import com.company.view.PantallaEquipo.ModificarEquipo;
import com.company.view.PantalladeMenus.MenuEquipos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEquipo {
    File equiposFiletmp = new File("Equipostmp.txt");

    public void crearEquipo(Equipo equipo) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Crear.equipoFile, true));
        id(equipo);
        outputStream.write(equipo.id + Crear.SEPARATOR + equipo.nombre + Crear.SEPARATOR + equipo.siglasdelequipo + Crear.SEPARATOR + equipo.ciudad + "\n");

        outputStream.close();
    }

    public void id(Equipo equipo) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.equipoFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);
            equipo.id = Integer.parseInt(values[0]);
        }
        inputStream.close();
        equipo.id++;
    }

    public static List<Equipo> obtenerEquipo() throws IOException {

        List<Equipo> equipos = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.equipoFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            Equipo equipo = new Equipo();
            equipo.id = Integer.valueOf(values[0]);
            equipo.nombre = values[1];
            equipo.ciudad = values[2];
            equipo.siglasdelequipo = values[3];
            equipos.add(equipo);
        }
        inputStream.close();

        return equipos;
    }

    public void modificar(String datoequipo,int cambiar) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.equipoFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(equiposFiletmp));

        String opcion;
        switch (cambiar){
            case 1 :
                System.out.println("1.Introduce el nuevo nombre del equipo:");
                break;
            case 2 :
                System.out.println("2.Introduce las siglas del equipo:");
                break;
            case 3 :
                System.out.println("3.Introduce el nuevo nombre de la ciudad o país:");
                break;
            default:
                System.out.println("Error: Opción no valida");
                System.out.println();
                ModificarEquipo modificarEquipo = new ModificarEquipo();
                modificarEquipo.mostrar();
        }
        opcion = scanner.nextLine();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);
            if(values[0].equals(datoequipo) || values[1].equals(datoequipo)){
                for (int i = 0; i < values.length; i++) {
                    if (i == cambiar){
                        outputStream.write(opcion + Crear.SEPARATOR);
                    }else {
                        outputStream.write(values[i] + Crear.SEPARATOR);
                    }
                }
                outputStream.write("\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        equiposFiletmp.renameTo(Crear.equipoFile);
        System.out.println("Se han modificado los cambios correctamente");
        System.out.println();
        MenuEquipos menuEquipos = new MenuEquipos();
        menuEquipos.mostrar();
    }

    public void eliminar(String datoequipo) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.equipoFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(equiposFiletmp));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            if(!values[0].equals(datoequipo) && !values[1].equals(datoequipo) ){
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();


        equiposFiletmp.renameTo(Crear.equipoFile);
        System.out.println("Se ha eliminado el equipo correctamente");
        System.out.println();
        MenuEquipos menuEquipos = new MenuEquipos();
        menuEquipos.mostrar();
    }

}
