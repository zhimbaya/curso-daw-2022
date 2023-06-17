package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Implementar un programa Java para administrar una matriz irregular de 5 filas
 * y 1 columna la primer fila, 2 columnas la segunda fila y así sucesivamente
 * hasta 5 columnas la última fila Realizar la carga por teclado e imprimir
 * posteriormente.
 *
 * @author Anuska
 */
public class _19MatrizIrregular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[5][];

        for (int i = 0, j = 1; i < m.length; i++, j++) {
            m[i] = new int[j];
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("[" + i + "," + j + "]");
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

}
