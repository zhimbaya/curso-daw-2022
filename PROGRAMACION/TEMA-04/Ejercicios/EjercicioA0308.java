/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;

import java.util.Scanner;

public class EjercicioA0308 {

	/**
	 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
	 * siguiente información: 
	 * cantidad total de preguntas que se le realizaron y la
	 * cantidad de preguntas que contestó correctamente. 
	 * Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo
	 * según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	 * Nivel máximo: Porcentaje>=90%. 
	 * Nivel medio: Porcentaje>=75% y <90%. 
	 * Nivel regular: Porcentaje>=50% y <75%. 
	 * Fuera de nivel: Porcentaje<50%.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Número total de preguntas: ");
		int total = sc.nextInt();
		System.out.printf("Número de preguntas correctas: ");
		int correctas = sc.nextInt();

		double porcent = (double) correctas * 100 / total;

		System.out.println("El portentaje de aciertos es " + porcent + "%");

		if (porcent >= 90) {
			System.out.println("Nivel máximo");
		} else if (porcent >= 75) {
			System.out.println("Nivel medio");
		} else if (porcent >= 50) {
			System.out.println("Nivel regular");
		} else {
			System.out.println("Fuera de nivel");
		}
	}

}
