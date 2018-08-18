package com.company;

import java.util.Scanner;

public class IntrodAlbum {

    private Scanner sc = new Scanner(System.in);
    private GenDynArray<Album> pda = new GenDynArray<Album>();
    private LectorTeclado lt = new LectorTeclado();
    public void IntroducirAlbum(){
        System.out.println("Cuantos Albumes desea Ingresar");
        int h = lt.LecturaEntero();
        System.out.println("Ingrese el Nombre del Album");
        String setNombreAlbum = sc.next();
        System.out.println("Ingrese el Nombre del Artista");
        String setNombreArtista = sc.next();
        System.out.println("Cuantas canciones son?");
        int j = lt.LecturaEntero();
        System.out.println("Introduzca las canciones");
        String setNombreCancion = sc.next();
        pda.add(new Album(setNombreAlbum,setNombreAlbum,setNombreCancion));
    }
    public void ImprimirAlbum(){
        System.out.println("El album Musical");
        for (int i = 0; i<pda.getSize(); i++){
            System.out.println(pda.getItem(i));
        }
    }
    public void RemoverAlbum(){
        System.out.println("cual album desea borrar");
        int n = lt.LecturaEntero();
        pda.remove(n-1);
    }
    public void EditarAlbum(){
        System.out.println("Albumes");
        for (int i=0; i<pda.getSize();i++){
            System.out.println(pda.getItem(i));

            System.out.println("Que album desea modificar");
            int n = lt.LecturaEntero();
            System.out.println("Introduzca el nuevo nombre");
            String setNombreAlbum = sc.next();
            System.out.println("Introduzca el nuevo artista");
            String setNombreArtista = sc.next();
            System.out.println("Introduzca las canciones");
            String setNombreCancion = sc.next();
            pda.add(new Album(setNombreAlbum, setNombreArtista, setNombreCancion));
        }
    }
}
