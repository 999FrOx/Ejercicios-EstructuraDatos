package org.Luis.ejercicios;

import java.util.Scanner;
//Primo
public class E18 {
public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    boolean pr = true;
    System.out.print("Ingrese un numero: ");
    n = scanner.nextInt();
    for(int i = 2; i < n; i++) {
        if (n % i == 0) {
            pr = false;
            break;
        }
    }
    if (pr) {
        System.out.println("Es primo;");
    }
    else{
        System.out.println("No es primo.");
        }
    }
}
