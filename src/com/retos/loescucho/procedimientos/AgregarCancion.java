package com.retos.loescucho.procedimientos;

import com.retos.loescucho.modelos.Cancion;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarCancion {

    ArrayList <Cancion> canciones;

    Scanner teclado = new Scanner(System.in);

    public void crearArrayCanciones(){
        canciones = new ArrayList();
    }

    public void insertarCancionArray(Cancion cancion){
        canciones.add(cancion);
    }

    public void crearCancion(){
        crearArrayCanciones();
        Cancion datosCancion = new Cancion();
        System.out.println("Para agregar una cancion necesita llenar los siguietnes datos.\n");
        System.out.println("Ingrese el nombre de la cancion: ");
        datosCancion.setNombre(teclado.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        datosCancion.setAutor(teclado.nextLine());
        System.out.println("Ingrese el tipo de audio: ");
        datosCancion.setTipo(teclado.nextLine());
        System.out.println("Ingrese la duracion de la cancion: ");
        datosCancion.setDuracionMinutos(teclado.nextInt());
        System.out.println("Ingrese el año de publicacion de la cancion: ");
        datosCancion.setAnoPublicacion(teclado.nextInt());
        System.out.println("Ingrese el albun al cual pertenece la cancion: ");
        datosCancion.setAlbunCancion(teclado.nextLine());
        datosCancion.setAlbunCancion(teclado.nextLine());
        System.out.println("Ingrese el genero de la cancion: ");
        datosCancion.setGeneroCancion(teclado.nextLine());


        insertarCancionArray((datosCancion));

        mostrarCancion(datosCancion);

    }

    public void mostrarCancion(Cancion datosCancion){
        String respuesta;
        int estrellas;
        System.out.println("""
                ***************************************************
                                   Datos Cancion
                ***************************************************""");
        System.out.println("Nombre de la Cancion: " + datosCancion.getNombre());
        System.out.println("Nombre del Autor: " + datosCancion.getAutor());
        System.out.println("Tipo de Audio: " + datosCancion.getTipo());
        System.out.println("Duracion de la Cancion: " + datosCancion.getDuracionMinutos());
        System.out.println("Año de publicacion de la Cancion: " + datosCancion.getAnoPublicacion());
        System.out.println("Genero de la Cancion: " + datosCancion.getGeneroCancion());
        System.out.println("Albun al que pertenece la Cancion: " + datosCancion.getAlbunCancion());

        System.out.println("""
                ***************************************************
                Deseas escuchar esta Cancion?
                (SI / NO)
                ***************************************************
                """);
        respuesta = teclado.nextLine();
        if (respuesta.equals("SI")){
            datosCancion.reproducirAudio();
            System.out.println("Terminaste de escuchar la Cancion.");

            System.out.println("""
                ***************************************************
                Deseas evaluar esta Cancion?
                (SI / NO)
                ***************************************************
                """);
            respuesta = teclado.nextLine();
            if (respuesta.equals("SI")){

                System.out.println("Elige un numero de estrellas entre 0 y 5:");
                estrellas = teclado.nextInt();
                if (estrellas <= 5 && estrellas >= 0){
                    datosCancion.reaccionarAudio(estrellas);
                }
            }
        }
    }
}
