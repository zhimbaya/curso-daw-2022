package Tema04;

import java.io.IOException;
import java.util.Scanner;

public class Llamada {

    public static void main(String args[]) throws IOException {

        //Declaracion Variables
        double coste;
        int duracion;
        boolean duracionValida;

        //Declaracion de constantes
        final double costeMinuto = .20;
        final double costeMinutoReducido = .05;
        final int duracionMinima = 3;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce la duracion de la llamada");
            duracion = teclado.nextInt();

            duracionValida = (duracion > 0);
            if (!duracionValida) {
                System.out.println("ERROR, la duracion debe ser mayor que 0");
            }

        } while (!duracionValida); //fin repetir-mientras

        if (duracion <= duracionMinima) {
            coste = costeMinuto;
        } else {
            coste = (costeMinuto + (duracion - duracionMinima) * costeMinutoReducido);
        }

        System.out.println("El coste de la llamada es de: " + coste + " euros");
    }//fin main
}//fin class	

