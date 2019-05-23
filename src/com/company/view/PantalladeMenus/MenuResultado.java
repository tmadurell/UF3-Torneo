package com.company.view.PantalladeMenus;

import com.company.manager.ManagerResultado;
import com.company.model.Resultado;
import com.company.view.PantallaResultados.ListaResultado;

import java.io.IOException;
import java.util.Scanner;

public class MenuResultado {
    Scanner scanner = new Scanner(System.in);

    public void mostrar() throws IOException {

        Resultado resultado = new Resultado();

        System.out.println("3)Resultado");
        System.out.println("   1.Introducir resultado");
        System.out.println("   2.Mostrar resultado");
        System.out.println("   3.Volver al menu principal");
        System.out.println("   4.Salir del programa");
        System.out.println();

        int opcion = scanner.nextInt();

        System.out.println();

        switch (opcion){
            case 1:
                new ManagerResultado().crearResultado(resultado);
                break;
            case 2:
                new ListaResultado().mostrar();
                break;
            case 3:
                MenuMain menuMain = new MenuMain();
                menuMain.mostrar();
            case 4:
                System.exit(0);
            default:
                System.out.println("Error: Opción no valida");
                System.out.println();
                MenuResultado menuResultado = new MenuResultado();
                menuResultado.mostrar();
        }

    }

}
