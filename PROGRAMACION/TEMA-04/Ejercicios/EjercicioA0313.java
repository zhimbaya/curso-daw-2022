/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;

import java.util.Scanner;

public class EjercicioA0313 {

	/**
	 * Realizar un programa en Java que pida un número al usuario y devuelva la suma
	 * de todos sus dígitos.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número");
		int n = sc.nextInt();
		int suma = 0;
		while (n > 0) {
			//modulo 
			suma += n % 10;
			System.out.println(suma);
			//unidades decenas centenas
			n = n / 10;
		}
		System.out.println("La suma de las cifras es " + suma);
	}

}
