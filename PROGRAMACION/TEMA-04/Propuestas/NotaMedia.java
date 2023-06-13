package Tema04;

import java.io.*;
import java.util.Scanner;

public class NotaMedia {

    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);

        //Declarar Variables
        int nota;
        int notaMedia;
        int suma;
        int contador;
        boolean notaValida;
        boolean fin;

        //Inicializamos
        suma = 0;
        contador = 0;

        System.out.println("Introduce las notas. Pulsa -99 para Finalizar");

        do {
            nota = teclado.nextInt();
            fin = (nota == -99);

            if (!fin) {
                notaValida = (nota >= 1 && nota <= 10);

                if (!notaValida) {
                    System.out.println("Nota NO Valida. La Nota debe estar entre 1 y 10");
                } else {
                    suma = suma + nota;
                    contador = contador + 1;
                }
            }//Fin Si
        } while (!fin);

        if (contador != 0) {
            notaMedia = (suma / contador);
            System.out.println("La Nota Media es: " + notaMedia);
        }//Fin Si
    }//Fin Main
}//Fin Class
