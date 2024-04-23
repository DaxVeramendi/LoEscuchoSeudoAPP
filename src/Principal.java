import com.retos.loescucho.procedimientos.AgregarAudioLibro;
import com.retos.loescucho.procedimientos.AgregarCancion;
import com.retos.loescucho.procedimientos.AgregarPodcast;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        AgregarAudioLibro audioLibro = new AgregarAudioLibro();
        AgregarCancion cancion = new AgregarCancion();
        AgregarPodcast podcast = new AgregarPodcast();

        int eleccion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("""
                ******************************************
                   Bienbenido al sistema de LoEscucho
                        Aplicacion de audio N° 1
                ******************************************
                
                Esperamos lo disfruten
                """);
        System.out.println("""
                Mencione que tipo de audio es el que quiere ver primero:
                1- AudioLibro
                2- Cancion
                3- Podcast
                ()- Retirarse
                """);
        eleccion = teclado.nextInt();

        switch (eleccion){
            case 1:
                audioLibro.crearAudioLibro();
                break;
            case 2:
                cancion.crearCancion();
                break;
            case 3:
                podcast.crearPodcast();
                break;

        }
    }
}
