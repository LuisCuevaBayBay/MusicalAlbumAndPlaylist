package com.company;

public class IntrodPlaylist {
    private LectorTeclado lt = new LectorTeclado();
    private GenDynArray<Playlist> pda = new GenDynArray<Playlist>();

    public void IntroducirPlaylist(){
        System.out.println("Cuantas canciones quiere ingresar?");
        int setCantidadCanciones = lt.LecturaEntero();
        int h = lt.LecturaEntero();
        for (int i =0; i<h; i++) {
            System.out.println("Ingrese el nombre de la cancion");
            String setNombreCancion = lt.LeerCadena();
            System.out.println("Ingrese el nombre del Artista");
            String setArtista = lt.LeerCadena();
            System.out.println("cuanto dura la cancion?");
            double setDuracion = lt.LecturaDecimal();
            pda.add(new Playlist(setNombreCancion, setArtista, (float) setDuracion, setCantidadCanciones));
        }
    }
    public void ImprimirPlaylist(){
        System.out.println("Playlist: ");
        for (int i = 0; i < pda.getSize(); i++){
            System.out.println(pda.getItem(i));
        }
    }

    public void RemoverPlaylist(){
        for (int i = 0; i<pda.getSize(); i++){
            System.out.println(pda.getItem(i));
        }
        System.out.println("Numero a borrar en las playlist");
        Integer n = lt.LecturaEntero();
        pda.remove(n+1);
    }
    public void ModificarPlaylist() {
        System.out.println("Canciones");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("cuantas canciones desea modificar");
       int setCantidadCanciones = lt.LecturaEntero();
        pda.remove(setCantidadCanciones - 1);

        for (int i = 0; i < setCantidadCanciones; i++) {
            System.out.println("Introduzca el nuevo nombre");
            String setNombreCancion = lt.LeerCadena();
            System.out.println("Introduzca el nuevo artista");
            String setArtista = lt.LeerCadena();
            System.out.println("Cuanto dura la nueva cancion");
            double setDuracion = lt.LecturaDecimal();
            pda.add(new Playlist(setNombreCancion, setArtista, (float) setDuracion, setCantidadCanciones));
        }
    }
    }

