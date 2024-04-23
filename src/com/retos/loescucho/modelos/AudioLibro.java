package com.retos.loescucho.modelos;

public class AudioLibro extends Audio{
    String clasificacionLibro;
    String generoLibro;

    public String getClasificacionLibro() {
        return clasificacionLibro;
    }

    public void setClasificacionLibro(String clasificacionLibro) {
        this.clasificacionLibro = clasificacionLibro;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }
}
