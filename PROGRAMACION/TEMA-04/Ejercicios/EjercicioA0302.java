/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;

import java.util.Scanner;

public class EjercicioA0302 {

	/**
	 * Realizar un programa que lea dos números reales por teclado y muestre el
	 * resultado de la división del primer número por el segundo. Se debe comprobar
	 * que el divisor no puede ser cero.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe dos números reales, dividendo y divisor");
		double dividendo = sc.nextDouble();
		double divisor = sc.nextDouble();
		if (divisor == 0) {
			System.out.println("El divisor no puede ser 0");
		} else {
			System.out.println(dividendo + "/" + divisor + "=" + dividendo / divisor);
		}
	}

}
