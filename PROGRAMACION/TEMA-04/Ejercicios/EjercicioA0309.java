/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;

import java.util.Scanner;

public class EjercicioA0309 {

	/**
	 * De un operario se conoce su sueldo y los años de antigüedad. Se pide
	 * confeccionar un programa que lea los datos de entrada e informe:
	 * 
	 * 
	 * a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10
	 * años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
	 * 
	 * 
	 * b) Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años,
	 * otorgarle un aumento de 5 %.
	 * 
	 * 
	 * c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin
	 * cambios.
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el sueldo");
		double sueldo = sc.nextDouble();
		System.out.println("Escribe los años de antigüedad");
		int anios = sc.nextInt();

		if (sueldo < 500) {
			if (anios >= 10) {
				sueldo = sueldo + (20 * sueldo / 100); // sueldo+= 20*sueldo/100;
			} else {
				sueldo = sueldo + (5 * sueldo / 100);
			}
		}
		System.out.println("El sueldo total es " + sueldo);
	}

}
