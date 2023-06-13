package Tema04;

import java.io.*;

public class SumaSerieRepetirMientras {

    public static void main(String args[]) throws IOException {
        //declaracion de Variables
        int suma;
        final int incremento = 4;
        int contador;

        //incializar
        suma = 0;
        contador = 3;

        do {
            suma = suma + contador;
            contador = contador + incremento;
        } while (contador <= 1500); //fin repetir-mientras

        System.out.println("La suma de la serie es: " + suma);
    }//fin main
}//fin class
