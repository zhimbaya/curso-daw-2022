package Tema04;

import java.util.Scanner;

public class EjercicioA310 {
	/*
	 * Realizar un programa en Java pida un número entero positivo por pantalla y
	 * escriba los números desde 1 hasta el número introducido. Se deberá controlar
	 * si el número introducido es igual o menor a 0.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Escribe un número mayor o igual que 1: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("El número ha de ser mayor que 0.");
		} else {
			int aux = 1;
			while (aux <= n) {
				System.out.print(aux + " ");
				aux++;
			}
		}

	}

}
