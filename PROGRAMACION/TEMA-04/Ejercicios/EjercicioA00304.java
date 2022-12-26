/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa00304;

import java.util.Scanner;

/**
 *
 * Realizar un programa que lea por teclado tres números enteros H, M, S
 * correspondientes a hora, minutos y segundos respectivamente, y comprueba si
 * la hora que indican es una hora válida. 
 * 
 * Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor
 * válido para las horas será mayor o igual que cero y menor que 24.
 * 
 * El valor válido para los minutos y segundos estará comprendido entre 0 y 59
 * ambos incluidosﬁ
 */
public class EjercicioA00304 {

	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la hora (0-23)");
		int hora = sc.nextInt();
		System.out.println("Escribe los minutos (0-59)");
		int min = sc.nextInt();
		System.out.println("Escribe los segundos (0-59)");
		int seg = sc.nextInt();
		if (hora >= 0 && hora < 24 && min >= 0 && min < 59 && seg >= 0 && seg < 59) {
			System.out.println("La hora es correcta");
		} else {
			System.out.println("La hora es incorrecta");
		}
	}

}
