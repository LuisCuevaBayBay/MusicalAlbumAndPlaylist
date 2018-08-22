package com.company;



public class Album {
    private String NombreAlbum;
    private String NombreArtista;
    private int numCanciones;
    private String NombreCancion;

    public Album(String NombreAlbum, String NombreArtista,String NombreCancion){
        this.NombreAlbum = NombreAlbum;
        this.NombreArtista = NombreArtista;
        this.numCanciones = numCanciones;
        this.NombreCancion = NombreCancion;

    }
    public Album(int i){
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        NombreAlbum = nombreAlbum;
    }

    public String getNombreArtista() {
        return NombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        NombreArtista = nombreArtista;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        NombreCancion = nombreCancion;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    @Override
    public String toString() {
        return String.format("Album "+NombreAlbum,"Artista: "+NombreArtista,"Canciones: %s"+ NombreCancion,"Cantidad de Canciones: "+numCanciones);
    }
}