package Tema04;

import java.io.*;

public class SumaSerieMientras {

    public static void main(String args[]) throws IOException {
        //Declaracion de Variables
        int contador;
        int suma;
        final int incremento = 4;

        //Inicializamos Variables
        suma = 0;
        contador = 3;

        while (contador <= 1500) {
            suma = suma + contador;
            contador = contador + incremento;
        }//fin mientras

        System.out.println("La suma de la serie es: " + suma);
    }//fin main
}//fin class
