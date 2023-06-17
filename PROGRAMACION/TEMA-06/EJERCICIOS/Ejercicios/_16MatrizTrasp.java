package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Crear una clase llamada Matriz cuyo atributo sea un array bidimensional de
 * números enteros de cualquier tamaño.
 *
 * Tendremos un constructor con dos parámetros que serán el número de filas y de
 * columnas de la matriz.
 *
 * La matriz tendrá los siguientes métodos:
 *
 * Cargar() pedirá por teclado todos los elementos de la matriz
 *
 * Suma() que devuelve la suma de todos los valores de la matriz
 *
 * Máximo() que devuelve el valor máximo de los elementos de la matriz
 *
 * Mínimo() que devuelve el valor mínimo de los elementos de la matriz
 *
 * Promedio() que devuelve el valor promedio de todos los elementos de la matriz
 *
 * Transpuesta() devuelve un objeto de la clase matriz resultado de intercambiar
 * las filas por las columnas de la matriz original
 *
 * toString() devuelve un String con los elementos de la matriz con el formato
 * del siguiente ejemplo:
 *
 * 1 2 3 4 5 *
 * 6 7 8 9 10
 *
 * 11 2 23 12 11
 *
 * @author Anuska
 */
public class _16MatrizTrasp {

    private int[][] m;

    public _16MatrizTrasp(int f, int c) {
        m = new int[f][c];
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("[" + i + "," + j + "] = ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
        }
        return suma;
    }

    public int maximo() {
        int maximo = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maximo < m[i][j]) {
                    maximo = m[i][j];
                }
            }
        }
        return maximo;
    }

    public int minimo() {
        int minimo = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (minimo > m[i][j]) {
                    minimo = m[i][j];
                }
            }
        }
        return minimo;
    }

    public int promedio() {
        return suma() / (m.length * m[0].length);
    }

    public _16MatrizTrasp transpuesta() {
        _16MatrizTrasp t = new _16MatrizTrasp(m[0].length, m.length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                t.m[j][i] = this.m[i][j];
            }
        }
        return t;
    }

    public String toString() {
        String texto = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                texto += m[i][j] + " ";
            }
            texto += "\n";
        }
        return texto;
    }

}
