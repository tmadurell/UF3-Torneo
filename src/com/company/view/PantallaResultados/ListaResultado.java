package com.company.view.PantallaResultados;

import com.company.manager.ManagerResultado;
import com.company.model.Resultado;
import com.company.view.PantalladeMenus.MenuResultado;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListaResultado {

    public void mostrar() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3.2.Lista de resultados:");
        System.out.println("Estos son los resultados registrados:");

    List<Resultado> resultados = ManagerResultado.listaResultado();

    for(Resultado resultado : resultados){
        System.out.println("Participante local: " + resultado.PartipanteLocal + "  " + "Resultado: " + resultado.resultadoLocal + " VS. " + "Participante visitante: " + resultado.PartipanteVisitante + "  " + "Resultado: " + resultado.resultadoVisitante);
    }
        System.out.println("");
        MenuResultado menuResultado = new MenuResultado();
        menuResultado.mostrar();
    }
}