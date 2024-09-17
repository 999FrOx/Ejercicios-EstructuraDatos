package org.Luis.ejercicios;

import java.util.Scanner;
//Imprimir Numero
public class Ej16 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n,i;
        i=0;
        System.out.print("Ingrese el numero para imprimir: ");
        n = scanner.nextInt();
        while (i<=n){
            System.out.println(i);
            i++;
        }

    }
}
