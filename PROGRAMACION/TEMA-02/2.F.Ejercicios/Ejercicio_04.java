package Tema02;

import java.util.Scanner;

/**
 * Realizar un programa que pida por teclado la fecha de nacimiento de una
 * persona (dia, mes, año) y calcule su número de la suerte. El número de la
 * suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a
 * continuación sumando las cifras obtenidas en la suma. Por ejemplo: Si la
 * fecha de nacimiento es 12/07/1980 Calculamos el número de la suerte así:
 * 12+7+1980 = 1999 1+9+9+9 = 28 Número de la suerte: 28
 *
 * @author Anuska
 */
public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el día de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Escribe el mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Escribe el año de nacimiento");
        int anio = sc.nextInt();
        int suma = dia + mes + anio;
        int suerte = suma % 10 + (suma / 10) % 10 + (suma / 100) % 10 + (suma / 1000);
        System.out.println("Tu número de la suerte es: " + suerte);
    }

}
