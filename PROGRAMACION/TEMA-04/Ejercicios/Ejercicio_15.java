package Tema04;

import java.util.Scanner;

/**
 * Utilizando la sentencia repetitiva do...while realizar un programa en el que
 * se ingresan un conjunto de n edades de personas por teclado. El programa
 * finalizara cuando el promedio de las edades sea superior a 25.
 */
public class Ejercicio_15 {

    public static void main(String[] args) {

        double promedio = 0;
        double totalEdad = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Número de edades: ");
        int numEdades = sc.nextInt();

        int i = 1;
        do {
            System.out.printf("Edad " + i + "º : ");
            int edad = sc.nextInt();

            totalEdad += edad;

            promedio = totalEdad / i;
            if (promedio > 25) {
                System.out.println("FIN");
                break;
            }
            i++;
            numEdades--;
        } while (numEdades != 0);
        System.out.println("Total de edades: " + totalEdad + " años");
        System.out.println("Total de media: " + promedio + " años");

        sc.close();
    }

}
