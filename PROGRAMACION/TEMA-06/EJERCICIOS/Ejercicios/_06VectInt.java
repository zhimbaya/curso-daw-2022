package Tema06.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Anuska
 */
public class _06VectInt {

    private int[] vector;

    public _06VectInt(int n) {
        vector = new int[n];
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduzca un valor entero para el elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
    }

    public void cargar(int a, int b) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random() * (b - a + 1) + a);
        }
    }

    // suma() devolverá el resultado de sumar todos los elementos del array
    public int suma() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    // promedio() devolverá un double que será el valor promedio de todos los valores
    public double promedio() {
        return (double) suma() / vector.length;
    }

    // moda() devolverá un entero que será el valor que más se repite
    private int repeticiones(int n) {
        int rep = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                rep++;
            }
        }
        return rep;
    }

    public int moda() {
        int moda = 0;
        int veces = 0;

        for (int i = 0; i < vector.length; i++) {
            int rep = repeticiones(vector[i]);
            if (rep > veces) {
                veces = rep;
                moda = vector[i];
            }
        }
        return moda;
    }

    // toString() devolverá un String con los valores del array con el formato (v1, v2, v3, ...., vn)
    @Override
    public String toString() {
        String cadena = "(";
        for (int i = 0; i < vector.length; i++) {
            cadena = cadena + vector[i];
            if (i < vector.length - 1) {
                cadena = cadena + ", ";
            } else {
                cadena = cadena + ")";
            }
        }
        return cadena;
    }
}
