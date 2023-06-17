package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal
 * principal.
 *
 * @author Anuska
 */
public class _12DiagonalMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Escribe el valor de [" + i + "," + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ COMPLETA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nDIAGONAL PRINCIPAL");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
