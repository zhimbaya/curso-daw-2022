package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Definir una clase llamada Alturas con un único atributo que sea un array de 5
 * componentes de tipo float que representen las alturas de 5 personas.
 * Definir el constructor sin parámetros y el constructor con 5 parámetros
 * Implementar además los siguientes métodos:
 * cargar() leerá por teclado las 5 alturas y las asignará al array
 * calcularPromedio() devolverá el valor promedio de las 5 alturas
 * mayoresPromedio() devolverá cuántas personas son más altas que el promedio
 * menoresPromedio() devolverá cuántas personas son más bajas que el promedio
 * Implementar un programa main que pruebe dicha clase, llamando a todos sus
 * métodos y mostrando los resultados.
 *
 * @author diego
 */
public class _04Alturas {

    private float[] alturas = new float[5];

    public _04Alturas() {
    }

    public _04Alturas(float a1, float a2, float a3, float a4, float a5) {
        alturas[0] = a1;
        alturas[1] = a2;
        alturas[2] = a3;
        alturas[3] = a4;
        alturas[4] = a5;
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Escribe la altura " + i);
            alturas[i] = sc.nextFloat();
        }
    }

    public float calcularPromedio() {
        float suma = 0;
        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];
        }
        return suma / alturas.length;
    }

    public int mayoresPromedio() {
        int contador = 0;
        float promedio = calcularPromedio();
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public int menoresPromedio() {
        int contador = 0;
        float promedio = calcularPromedio();
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] < promedio) {
                contador++;
            }
        }
        return contador;
    }
}
