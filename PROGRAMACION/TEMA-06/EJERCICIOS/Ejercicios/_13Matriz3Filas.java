package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila.
 * Imprimir la última fila e imprimir la primer columna.
 *
 * @author Anuska
 */
public class _13Matriz3Filas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Escribe el valor de la posición [" + i + "," + j + "]");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ COMPLETA");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPRIMERA FILA");
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[0][j] + " ");
        }

        System.out.println("\n\nULTIMA FILA");
        for (int j = 0; j < m[m.length - 1].length; j++) {
            System.out.print(m[m.length - 1][j] + " ");
        }

        System.out.println("\n\nPRIMERA COLUMNA");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][0]);
        }

    }

}
