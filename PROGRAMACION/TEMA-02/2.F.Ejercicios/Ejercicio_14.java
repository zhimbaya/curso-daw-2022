package Tema02;

import java.util.Scanner;

/**
 * Cualquier año divisible por 4 es un año bisiesto a excepción de aquellos que,
 * siendo divisibles por 100, no lo son por 400.
 *
 * Teniendo esto en cuenta desarrollar un programa en Java que reciba por
 * teclado un año y determine si es un año bisiesto o no.
 *
 * @author diego
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el año");
        int anio = sc.nextInt();
        if (anio % 4 == 0 && !(anio % 100 == 0 && anio % 400 != 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }

}
