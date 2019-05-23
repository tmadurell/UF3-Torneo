package com.company.view.PantallaResultados;

import com.company.manager.ManagerResultado;
import com.company.model.Resultado;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ListaResultado {

    public void mostrar() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de resultados:");

    List<Resultado> resultados = ManagerResultado.listaResultado();

    for(Resultado resultado : resultados){
        System.out.println("Participante local: " + resultado.PartipanteLocal + "  " + "Resultado: " + resultado.resultadoLocal + " VS. " + "Participante visitante: " + resultado.PartipanteVisitante + "  " + "Resultado: " + resultado.resultadoVisitante);
    }
}
}