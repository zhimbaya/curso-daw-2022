package Propuesta04;

import java.io.IOException;
import java.util.Scanner;

public class Llamada {

			
	public static void main(String args[]) throws IOException {
		// Declaracion Variables
		double coste;
		int duracion;
		boolean duracionValida;
		// Declaracion de constantes
		final double COSTE_MINUTO = .20;
		final double COSTE_MINUTO_REDUCIDO = .05;
		final int DURACION_MINIMA = 3;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduce la duracion de la llamada");
			duracion = teclado.nextInt();

			duracionValida = (duracion > 0);
			if (!duracionValida)
				System.out.println("ERROR, la duracion debe ser mayor que 0");

		} while (!duracionValida); // fin repetir-mientras

		if (duracion <= DURACION_MINIMA)
			coste = COSTE_MINUTO;

		else
			coste = COSTE_MINUTO + ((duracion - DURACION_MINIMA) * COSTE_MINUTO_REDUCIDO);

		System.out.println("El coste de la llamada es de: " + coste + " euros");
	}// fin main
}// fin class
