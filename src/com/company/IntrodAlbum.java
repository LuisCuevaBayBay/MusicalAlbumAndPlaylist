package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class IntrodAlbum {

    private Scanner sc = new Scanner(System.in);
    private GenDynArray<Album> pda = new GenDynArray<Album>();
    private LectorTeclado lt = new LectorTeclado();


    public void IntroducirAlbum(){
        System.out.println("Cuantos Albumes desea Ingresar");
        int h = lt.leerEntero("Ingresa la cantidad de albumes","intenta de nuevo");
        for (int i =0; i<h; i++) {
            System.out.println("Ingrese el Nombre del Album");
            String setNombreAlbum = lt.leeerLinea();
            System.out.println("Cuantas canciones son?");
            int j = lt.leerEntero("Favor ingresa cuantas canciones son","intenta de nuevo");
            System.out.println("Ingrese el Nombre del Artista");
            String setNombreArtista = lt.leeerLinea();
            System.out.println("Ingrese las canciones");
           String setNombreCancion = lt.leeerLinea();
            pda.add(new Album(setNombreAlbum, setNombreArtista, setNombreCancion));
        }
    }
    public void ImprimirAlbum(){
        System.out.println("El album Musical");
        for (int i = 0; i<pda.getSize(); i++){
            System.out.println("Album: "+pda.getItem(i).getNombreAlbum());
            System.out.println("Artista: "+pda.getItem(i).getNombreArtista());
            System.out.println("Canciones: "+pda.getItem(i).getNombreCancion());
        }
    }
    public void RemoverAlbum(){
        System.out.println("cual album desea borrar");
        int n = lt.leerEntero("Ingresa el album que quieras borrar","intenta de nuevo");
        pda.remove(n-1);
    }
    public void EditarAlbum(){
        System.out.println("Albumes");
        for (int i=0; i<pda.getSize();i++){
            System.out.println(pda.getItem(i));

            System.out.println("Que album desea modificar");
            int n = lt.leerEntero("Ingresa el album que quieras modificar","intenta de nuevo");
            System.out.println("Introduzca el nuevo nombre");
            String setNombreAlbum = sc.next();
            System.out.println("Introduzca el nuevo artista");
            String setNombreArtista = sc.next();
            System.out.println("Introduzca las canciones");
            String setNombreCancion = lt.leeerLinea();
            pda.add(new Album(setNombreAlbum, setNombreArtista, setNombreCancion));
        }
    }
}
