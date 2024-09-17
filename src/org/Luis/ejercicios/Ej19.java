package org.Luis.ejercicios;

import java.util.Scanner;
//MCD
public class Ej19 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        int MCD;
        System.out.print("Ingrese un numero 1: ");
        n1 = scanner.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = scanner.nextInt();

        do {
            MCD = n2;
            n2 = n1 % n2;
            n1 = MCD;

        } while (n2 != 0);
        System.out.println("El MCD es: " + n1);
    }
    }
