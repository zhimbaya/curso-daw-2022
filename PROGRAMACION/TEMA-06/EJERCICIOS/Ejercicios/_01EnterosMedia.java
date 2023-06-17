package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa Java que lea por teclado 10 números enteros y los guarde
 * en un array. A continuación calcula y muestra por separado la media de los
 * valores positivos y la de los valores negativos.
 *
 * @author Anuska
 */
public class _01EnterosMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int TAM = 10;

        int[] lista = new int[TAM];
        int sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Escribe el valor de la posición " + i);
            lista[i] = sc.nextInt();
            if (lista[i] > 0) {
                sumaPos += lista[i];
                contPos++;
            } else if (lista[i] < 0) {
                sumaNeg += lista[i];
                contNeg++;
            }
        }

        if (contPos > 0) {
            int mediaPos = sumaPos / contPos;
            System.out.println("La media de los positivos es " + mediaPos);
        }
        if (contNeg > 0) {
            int mediaNeg = sumaNeg / contNeg;
            System.out.println("La media de los negativos es " + mediaNeg);
        }

    }
}
