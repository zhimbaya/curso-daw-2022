package Tema02;

import java.util.Scanner;

/**
 * Realiza un programa en Java que reciba por teclado un número entero mayor que
 * 1 y devuelva un número aleatorio entero entre 1 y el número recibido (ambos
 * incluidos).
 *
 * Deberás usar el método ramdom de la clase Math que devuelve un número
 * aleatorio de tipo double entre 0 y 1
 *
 * @author Anuska
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Voy a buscar un número entre 1 y ");
        int max = sc.nextInt();
        int aleat = (int) (Math.random() * max + 1);

        System.out.println("El número es " + aleat);
    }

}
