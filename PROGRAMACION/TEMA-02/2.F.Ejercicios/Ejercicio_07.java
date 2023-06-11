package Tema02;

import java.util.Scanner;

/**
 * Realiza un programa en Java que reciba por teclado dos números y devuelva un
 * número aleatorio entero entre el primero y el segundo (ambos incluidos). No
 * sabemos cuál de los dos números es mayor ya que el usuario puede escribirlos
 * en cualquier orden. Deberás usar el método ramdom de la clase Math que
 * devuelve un número aleatorio de tipo double entre 0 y 1
 *
 * @author Anuska
 */
public class Ejercicio_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número");
        int a = sc.nextInt();
        System.out.println("Segundo número");
        int b = sc.nextInt();
        /*
        No es necesario ordenarlos ya que la fórmula es válida
        sea cual sea el orden de los dos números
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
         */
        int aleat = (int) (Math.random() * (b - a + 1) + a);
        System.out.println("El número es " + aleat);
    }

}
