package com.company;

import java.util.Scanner;

public class LectorTeclado {
    public String LeerCadena(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public Double LecturaDecimal(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public int LecturaEntero(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public char LecturaChar(){
        Scanner in = new Scanner(System.in);
        return in.next().charAt(0);
    }

}
