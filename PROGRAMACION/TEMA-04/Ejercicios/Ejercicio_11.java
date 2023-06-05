package Tema04;

import java.util.Scanner;

public class Ejercicio_11 {

    /**
     * Desarrollar un programa que permita la carga de 10 valores por teclado y
     * nos muestre posteriormente la suma de los valores ingresados y su
     * promedio.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CANTIDAD = 5;
        int suma = 0;
        for (int i = 1; i <= CANTIDAD; i++) {
            System.out.print("Escribe el número " + i + ": ");
            suma = suma + sc.nextInt(); // suma+= sc.nextInt();
        }
        System.out.println("La suma de los " + CANTIDAD + " números es " + suma);
        System.out.println("La media de los " + CANTIDAD + " números es " + (double) suma / CANTIDAD);
    }

}
