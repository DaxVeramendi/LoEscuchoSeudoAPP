package com.retos.loescucho.modelos;

public class Cancion extends Audio{
    String generoCancion;
    String albunCancion;

    public String getGeneroCancion() {
        return generoCancion;
    }

    public void setGeneroCancion(String generoCancion) {
        this.generoCancion = generoCancion;
    }

    public String getAlbunCancion() {
        return albunCancion;
    }

    public void setAlbunCancion(String albunCancion) {
        this.albunCancion = albunCancion;
    }
}
