package org.Luis.ejercicios;

import java.util.Scanner;
//Factorial
public class Ej17 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n, i;
        long f=1;
        System.out.print("Ingrese el numero: ");
        n = scanner.nextInt();
        i = n;
        do {
            f= f *i;
            i=i-1;

        } while (i>=1);
        System.out.println("El factorial de " + n + " es: " + f);
    }
}
