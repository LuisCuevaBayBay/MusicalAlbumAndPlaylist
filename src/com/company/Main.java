package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre = null;
        String artista = null;
        Scanner sc = new Scanner(System.in);
        GenDynArray<Album> pda = new GenDynArray();
        FileIO pfio = new FileIO("Data.csv");

        try{
            pfio.writeProducts(pda);
        }catch (IOException var13){
            var13.printStackTrace();
        }
        for (int i = 0; i<pda.getSize();i++){
            System.out.println(pda.getItem(i));
        }

        IntrodAlbum intro = new IntrodAlbum();
        IntrodPlaylist intro1 = new IntrodPlaylist();
        MainMenu menu = new MainMenu();
        int opcion = 0;
        boolean var10 = false;

        while (true){
            while (true){
                opcion = menu.menu();
                switch (opcion){
                    case 1:
                        while (opcion != 5){
                            opcion = menu.MenudeAlbum();
                            switch (opcion){
                                case 1:
                                    intro.IntroducirAlbum();
                                    break;
                                case 2:
                                    intro.ImprimirAlbum();
                                    break;
                                case 3:
                                    intro.RemoverAlbum();
                                    break;
                                case 4:
                                    intro.EditarAlbum();
                                    break;
                                case 5:
                                    default:
                                        System.out.println("Saliendo del menu de album");
                            }
                            }
                    case 2:
                        while (opcion != 5){
                            opcion = menu.MenuPlaylist();
                            switch (opcion){
                                case 1:
                                    intro1.IntroducirPlaylist();
                                    break;
                                case 2:
                                    intro1.ImprimirPlaylist();
                                    break;
                                case 3:
                                    intro1.RemoverPlaylist();
                                    break;
                                case 4:
                                    intro1.ModificarPlaylist();
                                    break;
                                case 5:
                                    default:
                                        System.out.println("Saliendo del menu de Playlist");
                            }
                        }
                }
            }
        }
    }
}
