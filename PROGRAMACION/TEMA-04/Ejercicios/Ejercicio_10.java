package Tema04;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        /*
        * Cualquier año divisible por 4 es un año bisiesto a excepción de aquellos que,
        * siendo divisibles por 100, no lo son por 400.
        * 
        * Teniendo esto en cuenta desarrollar un programa en Java que reciba por
        * teclado un año y determine si es un año bisiesto o no.
        */

        System.out.printf("Introducir un año: ");
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();

        if (anio <= 0 || anio > 9999) {
            System.out.println("No es una año correcto");
        } else {
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {

                System.out.println("El año introducido es BISIESTO.");
            } else {
                System.out.println("Año NO Bisiesto.");
            }
        }
        sc.close();

    }

}
