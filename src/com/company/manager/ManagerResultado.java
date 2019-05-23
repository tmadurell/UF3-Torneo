package com.company.manager;


import com.company.Crear;
import com.company.model.Resultado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManagerResultado {


    Scanner scanner = new Scanner(System.in);


    public void crearResultado (Resultado resultado) throws IOException {

        System.out.println("Introduce el nombre del participante local:");
        Resultado.PartipanteLocal = scanner.nextLine();

        System.out.println("Introduce los puntos que ha hecho el participante local:");
        Resultado.resultadoLocal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el nombre del participante visitante:");
        Resultado.PartipanteVisitante = scanner.nextLine();

        System.out.println("Introduce los puntos que ha hecho el participante visitante:");
        Resultado.resultadoVisitante = scanner.nextInt();


        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Crear.resultadoFile, true));

        outputStream.write(resultado.PartipanteLocal + Crear.SEPARATOR + resultado.resultadoLocal + Crear.SEPARATOR + resultado.PartipanteVisitante + Crear.SEPARATOR + resultado.resultadoVisitante + "\n");

        outputStream.close();

    }

    public static List<Resultado> listaResultado() throws IOException {

        List<Resultado> resultados = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.resultadoFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            Resultado resultado = new Resultado();

            Resultado.PartipanteLocal = values[0];
            resultado.resultadoLocal = Integer.valueOf(values[1]);
            Resultado.PartipanteVisitante = values[2];
            resultado.resultadoVisitante = Integer.valueOf(values[3]);

            resultados.add(resultado);
        }
        inputStream.close();

        return resultados;

    }
}