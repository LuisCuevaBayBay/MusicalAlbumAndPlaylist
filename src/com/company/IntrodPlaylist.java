package com.company;

import java.util.Scanner;

public class IntrodPlaylist {
    private LectorTeclado lt = new LectorTeclado();
    private GenDynArray<Playlist> pda = new GenDynArray<Playlist>();
    private  Scanner sc = new Scanner(System.in);

    public void IntroducirPlaylist(){
        System.out.println("Cuantas canciones quiere ingresar?");
        int setCantidadCanciones = lt.leerEntero("Ingresa el numero","intenta de nuevo");
        int h = lt.leerEntero("ingresa la opcion","intenta de nuevo");
        for (int i =0; i<h; i++) {
            System.out.println("Ingrese el nombre de la cancion");
            String setNombreCancion = sc.nextLine();
            System.out.println("Ingrese el nombre del Artista");
            String setArtista = sc.nextLine();
            System.out.println("cuanto dura la cancion?");
            double setDuracion = lt.leerFlotante("Ingresa la duracion","intenta de nuevo");
            pda.add(new Playlist(setNombreCancion, setArtista, (float) setDuracion, setCantidadCanciones));
        }
    }
    public void ImprimirPlaylist(){
        System.out.println("Playlist: ");
        for (int i = 0; i < pda.getSize(); i++){
            System.out.println("Nombre: "+pda.getItem(i).getNombreCancion());
            System.out.println("Artista: "+pda.getItem(i).getArtista());
            System.out.println("Duracion: "+pda.getItem(i).getDuracion());
        }
    }

    public void RemoverPlaylist(){
        for (int i = 0; i<pda.getSize(); i++){
            System.out.println(pda.getItem(i));
        }
        System.out.println("Numero a borrar en las playlist");
        Integer n = lt.leerEntero("Cuantas canciones quieres borrar","intenta de nuevo");
        pda.remove(n+1);
    }
    public void ModificarPlaylist() {
        System.out.println("Canciones");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("cuantas canciones desea modificar");
       int setCantidadCanciones = lt.leerEntero("Cuantas canciones modificara","intenta de nuevo");
        pda.remove(setCantidadCanciones - 1);

        for (int i = 0; i < setCantidadCanciones; i++) {
            System.out.println("Introduzca el nuevo nombre");
            String setNombreCancion = sc.nextLine();
            System.out.println("Introduzca el nuevo artista");
            String setArtista = sc.nextLine();
            System.out.println("Cuanto dura la nueva cancion");
            double setDuracion = lt.leerFlotante("Ingresa la duracion","intenta de nuevo");
            pda.add(new Playlist(setNombreCancion, setArtista, (float) setDuracion, setCantidadCanciones));
        }
    }
    }

