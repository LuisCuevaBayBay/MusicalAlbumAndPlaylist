package com.company;

import java.util.Scanner;

public class MainMenu {
    public LectorTeclado lt = new LectorTeclado();
    public int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("Menu Album");
        System.out.println("1. Ingresar Album");
        System.out.println("2. Crear Playlist");
        System.out.println("3. Salir");

        int opcion = 0;
        while ((opcion<1)|| (opcion>4)){
            Scanner sc = new Scanner(System.in);
            opcion = lt.leerEntero("Favor ingresa una opcion","intenta de nuevo");
            if((opcion<1)||(opcion>4)){
                System.out.println("Opcion no valida");
            }
        }
        return opcion;
    }
    public int MenudeAlbum(){
        System.out.println("");
        System.out.println("");
        System.out.println("Album Musical alv");
        System.out.println("1. Agregar Album");
        System.out.println("2. Ver albumes");
        System.out.println("3. Eliminar Album");
        System.out.println("4. Modificar Album");
        System.out.println("5. Salir");
        int opcion = 0;
        while ((opcion<1)||(opcion>5)){
            System.out.println("ingresar una opcion:");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            if((opcion<1)||(opcion>4)){
                System.out.println("Opcion no valida");
            }
        }
        return opcion;
    }
    public int MenuPlaylist(){
        System.out.println("");
        System.out.println("");
        System.out.println("Menu Playlist");
        System.out.println("1. Crear Playlist");
        System.out.println("2. Ver Playlist");
        System.out.println("3. Eliminar Playlist");
        System.out.println("4. Modificar Playlist");
        System.out.println("5. Salir");
        int opcion2 = 0;
        while ((opcion2<1)||(opcion2>5)){
            System.out.println("Ingresar una opcion");
            Scanner sc = new Scanner(System.in);
            opcion2 = sc.nextInt();
            if ((opcion2<1)||(opcion2>5)){
                System.out.println("Opcion no valida");
            }
        }
        return opcion2;
    }
}
