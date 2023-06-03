package Tema02;

import java.util.Scanner;

/**
 * Realiza un programa en Java que reciba por teclado dos números y devuelva un
 * número aleatorio entero entre el primero y el segundo (ambos incluidos). Se
 * asume que el primer número nunca será mayor que el segundo. Deberás usar el
 * método ramdom de la clase Math que devuelve un número aleatorio de tipo
 * double entre 0 y 1
 *
 * @author Anuska
 */
public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Número menor");
        int min = sc.nextInt();
        System.out.println("Número menor");
        int max = sc.nextInt();

        int aleat = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("El número es " + aleat);

    }

}
