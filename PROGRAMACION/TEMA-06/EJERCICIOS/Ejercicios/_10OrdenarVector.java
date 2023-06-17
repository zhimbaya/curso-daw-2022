package Tema06.Ejercicios;

/**
 * Escribe un procedimiento que ordene los números de un vector de enteros de
 * cualquier tamaño recibido como parámetro.  *
 * Utilizar el algoritmo de la burbuja y probarlo sobre los vectores [4,3,2,1] y
 * [3,2,1,4].  *
 * Algoritmo de la burbuja (bubblesort) en pseudocódigo:
 *
 * for i from 1 to n
 *
 * for j from 0 to n-i
 *
 * if (A[j ] > A[j + 1])
 *
 * intercambiar los valores entre A[j ] y A[j + 1]
 *
 * siendo n el tamaño del vector
 *
 * @author Anuska
 */
public class _10OrdenarVector {

    public static void burbuja(int[] v) {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] v = {3, 6, 5, 8, 5, 3, 4, 1};
        mostrar(v);
        burbuja(v);
        mostrar(v);

    }

}
