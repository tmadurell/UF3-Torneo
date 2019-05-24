package com.company.manager;

import com.company.Crear;
import com.company.model.Participante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerParticipante {

    File participantesFiletmp = new File("participantstmp.txt");

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
    public void modificar(String datopart,int cambiar) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.participantesFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(participantesFiletmp));

        String opcion;
        switch (cambiar){
            case 1 :
                System.out.println("Introduce el nuevo nombre:");
                break;
            case 2 :
                System.out.println("Introduce el nuevo nombre del equipo:");
                break;
        }
        opcion = scanner.nextLine();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);
            if(values[0].equals(datopart) || values[1].equals(datopart)){
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

        participantesFiletmp.renameTo(Crear.participantesFile);
    }

    public void elminar(String participantName) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(Crear.participantesFile));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(participantesFiletmp));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(Crear.SEPARATOR);

            if(!values[0].equals(participantName) && !values[1].equals(participantName) ){
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();


        participantesFiletmp.renameTo(Crear.participantesFile);
    }

}