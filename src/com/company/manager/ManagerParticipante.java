package com.company.manager;

import com.company.Crear;
import com.company.model.Participante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerParticipante {

    public static void crearParticipante(Participante participante) throws IOException {

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(Crear.participantesFile, true));
        id(participante);
        outputStream.write(participante.id + Crear.SEPARATOR + participante.nombre + Crear.SEPARATOR + participante.nombredelequipo + "\n");

        outputStream.close();
    }

    public static void id(Participante participante) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.participantesFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);
            participante.id = Integer.parseInt(values[0]);
        }
        inputStream.close();
        participante.id++;
    }

    public static List<Participante> obtenerParticipante() throws IOException {

        List<Participante> participants = new ArrayList<>();

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.participantesFile));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            Participante participante = new Participante();
            participante.id = Integer.valueOf(values[0]);
            participante.nombre = values[1];
            participante.nombredelequipo = values[2];
            participants.add(participante);

        }
        inputStream.close();

        return participants;
    }


}