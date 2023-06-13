package Tema04;

import java.util.Scanner;

public class MCM {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, mcm;
        System.out.print("Introduce número 1: ");
        a = teclado.nextInt();
        System.out.print("Introduce número 2: ");
        b = teclado.nextInt();

        if (a > b) {
            mcm = a;
        } else {
            mcm = b;
        }
        //Probamos si ese número es el mcm o lo son los siguientes superiores a él
        while (mcm % a != 0 || mcm % b != 0) {
            mcm++;
        }
        //Para salir del bucle while, se deben cumplir que mcm sea un número múltiplo de a y de b simultáneamente        

        System.out.println("El mcm es: " + mcm);
    }

}
