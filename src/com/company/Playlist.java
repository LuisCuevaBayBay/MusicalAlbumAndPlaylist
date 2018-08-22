package com.company;

import javax.xml.datatype.Duration;

public class Playlist {
    private String NombreCancion;
    private String Artista;
    private float duracion;
    private int cantidadCanciones;

    public Playlist(String NombreCancion, String Artista, float duracion, int cantidadCanciones){
        this.NombreCancion = NombreCancion;
        this.Artista = Artista;
        this.duracion = duracion;
        this.cantidadCanciones = cantidadCanciones;
    }

    public Playlist(int i){
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        NombreCancion = nombreCancion;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    @Override
    public String toString() {
        return String.format(NombreCancion, Artista, duracion);
    }
}
