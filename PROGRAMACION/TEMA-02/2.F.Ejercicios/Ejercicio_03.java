package Tema02;

import java.util.Scanner;

/**
 * Recuerda que la división entre enteros da como resultado la parte entera de
 * la división (sin decimales). Si por ejemplo N = 123 la operación N/10 da como
 * resultado 12 y no 12.3 Recuerda que el operador % obtiene el resto de la
 * división.
 *
 * @author Anuska
 */
public class Ejercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número de 3 cifras");
        int n = sc.nextInt();

        int unidades = n % 10;
        int decenas = (n / 10) % 10;
        int centenas = n / 100;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
    }

}
