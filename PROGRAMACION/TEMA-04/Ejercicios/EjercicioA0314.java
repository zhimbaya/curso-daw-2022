/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;

import java.util.Scanner;

public class EjercicioA0314 {

	/**
	 * Realizar un programa en Java que vaya pidiendo números al usuario y muestre
	 * por pantalla si son primos o no. La aplicación terminará cuando el usuario
	 * escriba -1.
	 */
	public static void main(String[] args) {
		
		System.out.println("Escribe un número");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean primo = true;
		while (n != -1) {
			for (int i = 2; i < n && primo; i++) {
				if (n % i == 0) {
					primo = false;
				}
			}
			if (!primo)
				System.out.println("El número no es primo");
			else
				System.out.println("El número es primo");
			
			System.out.println("-Escribe un número-");
			n = sc.nextInt();
			primo = true;
		}
		System.out.println("Haz introducido -1");
	}

}
