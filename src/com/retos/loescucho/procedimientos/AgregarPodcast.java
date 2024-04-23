package com.retos.loescucho.procedimientos;

import com.retos.loescucho.modelos.Podcast;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarPodcast {
    ArrayList<Podcast> podcasts;

    Scanner teclado = new Scanner(System.in);

    public void crearArrayPodcast(){
        podcasts = new ArrayList();
    }

    public void insertarPotcastArray(Podcast podcast){
        podcasts.add(podcast);
    }

    public void crearPodcast(){
        crearArrayPodcast();
        Podcast datosPodcast = new Podcast();
        System.out.println("Para agregar un podcast necesita llenar los siguietnes datos.\n");
        System.out.println("Ingrese el nombre del podcast: ");
        datosPodcast.setNombre(teclado.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        datosPodcast.setAutor(teclado.nextLine());
        System.out.println("Ingrese el tipo de audio: ");
        datosPodcast.setTipo(teclado.nextLine());
        System.out.println("Ingrese la duracion del podcast: ");
        datosPodcast.setDuracionMinutos(teclado.nextInt());
        System.out.println("Ingrese el año de publicacion del podcast: ");
        datosPodcast.setAnoPublicacion(teclado.nextInt());
        System.out.println("Ingrese el tema del podcast: ");
        datosPodcast.setTemaPodcast(teclado.nextLine());
        datosPodcast.setTemaPodcast(teclado.nextLine());

        insertarPotcastArray((datosPodcast));

        mostrarPodcast(datosPodcast);

    }
    public void mostrarPodcast(Podcast datosPodcast){
        String respuesta;
        int estrellas;
        System.out.println("""
                ***************************************************
                                   Datos Podcast
                ***************************************************""");
        System.out.println("Nombre del Podcast: " + datosPodcast.getNombre());
        System.out.println("Nombre del Autor: " + datosPodcast.getAutor());
        System.out.println("Tipo de Audio: " + datosPodcast.getTipo());
        System.out.println("Duracion del Podcast: " + datosPodcast.getDuracionMinutos());
        System.out.println("Año de publicacion del Podcast: " + datosPodcast.getAnoPublicacion());
        System.out.println("Tema del Podcast: " + datosPodcast.getTemaPodcast());

        System.out.println("""
                ***************************************************
                Deseas escuchar este Podcast?
                (SI / NO)
                ***************************************************
                """);
        respuesta = teclado.nextLine();
        if (respuesta.equals("SI")){
            datosPodcast.reproducirAudio();
            System.out.println("Terminaste de escuchar el Podcast.");

            System.out.println("""
                ***************************************************
                Deseas evaluar este Podcast?
                (SI / NO)
                ***************************************************
                """);
            respuesta = teclado.nextLine();
            if (respuesta.equals("SI")){

                System.out.println("Elige un numero de estrellas entre 0 y 5:");
                estrellas = teclado.nextInt();
                if (estrellas <= 5 && estrellas >= 0){
                    datosPodcast.reaccionarAudio(estrellas);
                }
            }
        }
    }
}
