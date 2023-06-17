package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Definir una clase llamada VectInt según la siguiente definición:
 *
 * Atributos
 *
 * Tendrá un único atributo privado que será un array de números enteros que, en
 * principio, podrá ser de cualquier tamaño.
 *
 * Constructores
 *
 * Tendrá un único constructor con un parámetro de tipo entero que indicará el
 * número de elementos del array
 *
 * Métodos
 *
 * cargar() leerá por teclado los valores de todos los elementos del array
 *
 * cargar(int a, int b) asignará a los elementos del array valores aleatorios
 * entre a y b
 *
 * promedio() devolverá un double que será el valor promedio de todos los
 * valores
 *
 * moda() devolverá un entero que será el valor que más se repite
 *
 * suma() devolverá el resultado de sumar todos los elementos del array
 *
 * toString() devolverá un String con los valores del array con el formato (v1,
 * v2, v3, ...., vn)
 *
 * @author Anuska
 */
public class _05VecInt {

    private int[] v;

    public _05VecInt(int n) {
        v = new int[n];
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = sc.nextInt();
        }
    }

    public void cargar(int a, int b) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }

    public double promedio() {
        return (double) suma() / v.length;
    }

    private int repeticiones(int n) {
        int veces = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                veces++;
            }
        }
        return veces;
    }

    public int moda() {
        int moda = 0;
        int rep = 0;
        for (int i = 0; i < v.length; i++) {
            int veces = repeticiones(v[i]);
            if (veces > rep) {
                moda = v[i];
                rep = veces;
            }
        }
        return moda;
    }

    public String toString() {
        String vector = "(";
        for (int i = 0; i < v.length; i++) {
            vector += v[i];
            if (i != v.length - 1) {
                vector += ", ";
            }
        }
        vector += ")";
        return vector;
    }

}
