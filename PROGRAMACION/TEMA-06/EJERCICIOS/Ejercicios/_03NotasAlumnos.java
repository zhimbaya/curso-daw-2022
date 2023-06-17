package Tema06.Ejercicios;

import java.util.Scanner;

/**
 *
 * Realizar un programa que lea por teclado la nota de los alumnos de una clase
 * y calcula la nota media del grupo. También muestra los alumnos con notas
 * superiores a la media. El número de alumnos se lee por teclado. Este programa
 * utiliza un array de elementos de tipo double que contendrá las notas de los
 * alumnos. El tamaño del array será el número de alumnos de la clase, por lo
 * tanto primero se pedirá por teclado el número de alumnos y a continuación se
 * creará el array. Se realizan 3 recorridos sobre el array, el primero para
 * asignar a cada elemento las notas introducidas por teclado, el segundo para
 * sumarlas y calcular la media y el tercero para mostrar los alumnos con notas
 * superiores a la media.
 *
 * @author Anuska
 */
public class _03NotasAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el número de alumnos");
        int alumnos = sc.nextInt();

        double[] notas = new double[alumnos];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Escribe la nota del alumno " + (i + 1));
            notas[i] = sc.nextDouble();
        }
        
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        
        double media = suma / alumnos;
        System.out.println("La nota media es " + media);
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("El alumno " + (i + 1) + " tiene una nota " + notas[i]);
            }
        }
    }

}
