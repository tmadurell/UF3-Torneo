package com.company.view.PantallaClasificacion;

import com.company.manager.ManagerClasificacion;
import com.company.model.Clasificacion;
import com.company.view.PantalladeMenus.MenuClasificacion;

import java.io.IOException;
import java.util.Scanner;

public class MenuEquipoClasificacion {

    Scanner scanner = new Scanner(System.in);

        public void mostrar() throws IOException {
            Clasificacion clasificacion = new Clasificacion();

            System.out.println("4.1.Equipo");
            System.out.println("    1.Crear clasificacion equipo");
            System.out.println("    2.Mostrar lista de clasficacion de equipos");
            System.out.println("    3.Volver al menu Clasificacion");
            System.out.println("    4.Salir del programa");
            System.out.println();

            int opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    new ManagerClasificacion().crearClasificacionEquipo(clasificacion);
                    break;
                case 2:
                    new ListaClasificacionEquipo().mostrar();
                    break;
                case 3:
                    MenuClasificacion menuClasificacion = new MenuClasificacion();
                    menuClasificacion.mostrar();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Error: Opción no valida");
                    System.out.println();
                    MenuEquipoClasificacion menuEquipoClasificacion = new MenuEquipoClasificacion();
                    menuEquipoClasificacion.mostrar();
            }
        }
    }

