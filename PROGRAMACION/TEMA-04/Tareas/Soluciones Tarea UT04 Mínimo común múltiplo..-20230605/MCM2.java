package Tema04;

import java.util.Scanner;

public class MCM2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c, mcm = 0;
        System.out.print("Introduce número 1: ");
        a = teclado.nextInt();
        System.out.print("Introduce número 2: ");
        b = teclado.nextInt();
        System.out.print("Introduce número 3: ");
        c = teclado.nextInt();

        if (a >= b && a >= c) {
            mcm = a;
        }
        if (b >= a && b >= c) {
            mcm = b;
        }
        if (c >= a && c >= b) {
            mcm = c;
        }
        //Probamos si ese número es el mcm o lo son los siguientes superiores a él
        while (mcm % a != 0 || mcm % b != 0 || mcm % c != 0) {
            mcm++;
        }
        //Para salir del bucle while, se deben cumplir que mcm sea un número múltiplo de a y de b simultáneamente        

        System.out.println("El mcm es: " + mcm);
    }

}
