package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa Java que guarda en un array 10 números enteros que se
 * leen por teclado. A continuación se recorre el array y calcula cuántos
 * números son positivos, cuántos negativos y cuántos ceros.
 *
 * @author Anuska
 */
public class _02ArrayEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        final int TAM = 10;
        int pos = 0, neg = 0, ceros = 0;

        int[] lista = new int[TAM];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Indica el valor de la posición " + i);
            lista[i] = sc.nextInt();

            if (lista[i] > 0) {
                pos++;
            } else if (lista[i] < 0) {
                neg++;
            } else {
                ceros++;
            }
        }

        System.out.println("El número de positivos es " + pos);
        System.out.println("El número de negativos es " + neg);
        System.out.println("El número de ceros es " + ceros);
    }

}
