package org.Luis.ejercicios;

import java.util.Scanner;

public class Ej15 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String fr, r;

        System.out.print("Ingrese la frase: ");
        fr = scanner.nextLine();

        System.out.print("Ingrese la letra para reemplazar: ");
        r = scanner.nextLine();
        fr= fr.replaceAll(",", r);
        System.out.print(fr);

    }
}
