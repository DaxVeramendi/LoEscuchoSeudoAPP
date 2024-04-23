package com.retos.loescucho.procedimientos;

import com.retos.loescucho.modelos.AudioLibro;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarAudioLibro {
    ArrayList <AudioLibro> audioLibros;

    Scanner teclado = new Scanner(System.in);

    public void crearArrayAudioLibro(){
        audioLibros = new ArrayList();
    }

    public void insertarAudioLibroArray(AudioLibro audioLibro){
        audioLibros.add(audioLibro);
    }


    public void crearAudioLibro(){
        crearArrayAudioLibro();
        AudioLibro datosAudioLibro = new AudioLibro();
        System.out.println("Para agregar un audioLibro necesita llenar los siguietnes datos.\n");
        System.out.println("Ingrese el nombre del Libro: ");
        datosAudioLibro.setNombre(teclado.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        datosAudioLibro.setAutor(teclado.nextLine());
        System.out.println("Ingrese el tipo de audio: ");
        datosAudioLibro.setTipo(teclado.nextLine());
        System.out.println("Ingrese la duracion del AudioLibro: ");
        datosAudioLibro.setDuracionMinutos(teclado.nextInt());
        System.out.println("Ingrese el año de publicacion el libro: ");
        datosAudioLibro.setAnoPublicacion(teclado.nextInt());
        System.out.println("Ingrese la clasificacion del libro: ");
        datosAudioLibro.setClasificacionLibro(teclado.nextLine());
        datosAudioLibro.setClasificacionLibro(teclado.nextLine());
        System.out.println("Ingrese el genero del libro: ");
        datosAudioLibro.setGeneroLibro(teclado.nextLine());

        insertarAudioLibroArray((datosAudioLibro));

        mostrarAudioLibro(datosAudioLibro);

    }

    public void mostrarAudioLibro(AudioLibro datosAudioLibro){
        String respuesta;
        int estrellas;
        System.out.println("""
                ***************************************************
                                   Datos Audio Libro
                ***************************************************""");
        System.out.println("Nombre del Audio Libro: " + datosAudioLibro.getNombre());
        System.out.println("Nombre del Autor: " + datosAudioLibro.getAutor());
        System.out.println("Tipo de Audio: " + datosAudioLibro.getTipo());
        System.out.println("Duracion del audiolibro: " + datosAudioLibro.getDuracionMinutos());
        System.out.println("Año de publicacion del Libro: " + datosAudioLibro.getAnoPublicacion());
        System.out.println("Clasificacion del Libro: " + datosAudioLibro.getClasificacionLibro());
        System.out.println("Genero del Libro: " + datosAudioLibro.getGeneroLibro());

        System.out.println("""
                ***************************************************
                Deseas escuchar este audio libro?
                (SI / NO)
                ***************************************************
                """);
        respuesta = teclado.nextLine();
        if (respuesta.equals("SI")){
            datosAudioLibro.reproducirAudio();
            System.out.println("Terminaste de escuchar el Audio libro.");

            System.out.println("""
                ***************************************************
                Deseas evaluar este audio libro?
                (SI / NO)
                ***************************************************
                """);
            respuesta = teclado.nextLine();
            if (respuesta.equals("SI")){

                System.out.println("Elige un numero de estrellas entre 0 y 5:");
                estrellas = teclado.nextInt();
                if (estrellas <= 5 && estrellas >= 0){
                    datosAudioLibro.reaccionarAudio(estrellas);
                }
            }
        }

    }

}
