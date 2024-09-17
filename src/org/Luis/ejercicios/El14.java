package org.Luis.ejercicios;

import java.util.Scanner;

public class El14 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String fr;

        System.out.print("Ingrese una frase: ");
        fr = scanner.nextLine();

        fr = fr.toUpperCase();

        System.out.print(fr);

    }
}
