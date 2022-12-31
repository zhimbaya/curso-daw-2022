package Tema04;

import java.util.Scanner;

public class EjercicioA0315 {

	public static void main(String[] args) {
		/*
		 * Utilizando la sentencia repetitiva do...while realizar un programa en el que
		 * se ingresan un conjunto de n edades de personas por teclado. El programa
		 * finalizara cuando el promedio de las edades sea superior a 25.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("Número de edades: ");
		int numEdades = sc.nextInt();
		double promedio = 0;
		double totalEdad = 0;

		int i = 1;
		do {
			System.out.printf("Edad " + i + "º :");
			int edad = sc.nextInt();
			totalEdad = totalEdad + edad;
			System.out.println("Total de edades: " + totalEdad + " años");
			promedio = totalEdad / i;
			System.out.println("Total de media: " + promedio + " años");
			if (promedio > 25) {
				System.out.println("FIN");
				break;
			}
			i++;
		} while (numEdades != 0);

	}

}
