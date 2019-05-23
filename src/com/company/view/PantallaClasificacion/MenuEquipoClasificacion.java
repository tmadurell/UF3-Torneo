package com.company.view.PantallaClasificacion;

import com.company.view.PantalladeMenus.MenuClasificacion;

import java.io.IOException;
import java.util.Scanner;

public class MenuEquipoClasificacion {

    Scanner scanner = new Scanner(System.in);

        public void mostrar() throws IOException {
            System.out.println("4.1.Equipo");
            System.out.println("    1.Crear clasificacion");
            System.out.println("    2.Modificar equipo");
            System.out.println("    3.Borrar equipo");
            System.out.println("    4.Mostrar clasificacion de los equipo");
            System.out.println("    5.Volver al menu principal");
            System.out.println("    6.Salir del programa");
            System.out.println();

            int opcion = scanner.nextInt();


            switch (opcion){
                case 1:
         //           new InscribirEquipo().mostrar();
                    break;
                case 2:
                    new ModificarEquipo().mostrar();
                    break;
                case 3:
                    new EliminarEquipo().mostrar();
                    break;
                case 4:
                    new ListaEquipo().mostrar();
                    break;
                case 5:
                    MenuClasificacion menuClasificacion = new MenuClasificacion();
                    menuClasificacion.mostrar();
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Error: Opción no valida");
                    System.out.println();
                    MenuEquipoClasificacion menuEquipoClasificacion = new MenuEquipoClasificacion();
                    menuEquipoClasificacion.mostrar();
            }
        }
    }
}
