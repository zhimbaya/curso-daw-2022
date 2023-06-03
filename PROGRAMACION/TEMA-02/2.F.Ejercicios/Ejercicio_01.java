package Tema02;

import java.util.Scanner;

/**
 *
 * Realiza un programa que lea una cantidad de grados centígrados y la pase a
 * grados Fahrenheit. La fórmula correspondiente para pasar de grados
 * centígrados a fahrenheit es: F = 32 + ( 9 * C / 5)
 *
 * @author Anuska
 */
public class Ejercicio_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe los grados centígrados");
        double c = sc.nextDouble();
        System.out.println(c + "ºC equivalen a " + (32 + (9 * c / 5)) + "ºF");
    }

}
