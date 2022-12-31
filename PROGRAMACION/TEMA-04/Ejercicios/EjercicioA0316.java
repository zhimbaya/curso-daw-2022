package Tema04;

import java.util.Scanner;

public class EjercicioA0316 {

	public static void main(String[] args) {
		/*
		 * Utilizando la sentencia while confeccionar un programa que permita ingresar
		 * un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo (los
		 * primeros 12 términos) siguiendo el modelo que se muestra en el ejemplo.
		 * Ejemplo: Si ingreso 3 deberá aparecer en pantalla lo siguiente
		 * 
		 * 3 x 1 = 3
		 * 
		 * 3 x 2 = 6
		 * 
		 * 3 x 3 = 9
		 * 
		 * 3 x 4 = 12
		 * 
		 * 3 x 5 = 15
		 * 
		 * 3 x 6 = 18
		 * 
		 * 3 x 7 = 21
		 * 
		 * 3 x 8 = 24
		 * 
		 * 3 x 9 = 27
		 * 
		 * 3 x 10 = 30
		 * 
		 * 3 x 11 = 33
		 * 
		 * 3 x 12 = 36
		 */

		System.out.printf("Ingresar un valor del 1 al 10: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.printf("Se ingreso un número no válido");
		} else {
			System.out.println("***TABLA DE MULTIPLICAR***\n");

			int i = 1;
			while (i <= 10) {
				int resultado = n * i;
				System.out.println(n + " x " + i + " = " + resultado);
				i++;
			}
		}
		sc.close();

	}

}
