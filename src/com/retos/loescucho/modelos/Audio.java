package com.retos.loescucho.modelos;

public class Audio {
    String autor;
    String nombre;
    int duracionMinutos;
    String tipo;
    int anoPublicacion;
    private int reproduccionesAudio = 0;
    private int sumaEstrellas = 0;
    private int numeroEstrellas;
    private int numeroEvaluaciones;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public void reproducirAudio(){
        reproduccionesAudio++;
    }
    public void reaccionarAudio(int estrella){
        numeroEstrellas = estrella;
        numeroEvaluaciones++;
        sumaCalificacionEstrellas();
    }
    public void sumaCalificacionEstrellas(){
        sumaEstrellas += numeroEstrellas;
    }

    public int calificacionEstrellasAudio(){
        return (int)(sumaEstrellas/numeroEvaluaciones);
    }
}
