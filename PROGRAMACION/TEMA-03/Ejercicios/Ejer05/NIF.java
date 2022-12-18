/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0405;

import java.util.Scanner;

public class NIF {

	// Atributos
	private int num;
	private char letra;

	// Constructores
	public NIF() {
	}

	public NIF(int n) {
		this.num = n;
		this.letra = calcularLetra(n);
	}

	// Métodos

	private char calcularLetra(int n) {
		switch (n % 23) {
		case 0:
			return 'T';
		case 1:
			return 'R';
		case 2:
			return 'W';
		case 3:
			return 'A';
		case 4:
			return 'G';
		case 5:
			return 'M';
		case 6:
			return 'Y';
		case 7:
			return 'F';
		case 8:
			return 'P';
		case 9:
			return 'D';
		case 10:
			return 'X';
		case 11:
			return 'B';
		case 12:
			return 'N';
		case 13:
			return 'J';
		case 14:
			return 'Z';
		case 15:
			return 'S';
		case 16:
			return 'Q';
		case 17:
			return 'V';
		case 18:
			return 'H';
		case 19:
			return 'L';
		case 20:
			return 'C';
		case 21:
			return 'K';
		case 22:
			return 'E';
		default:
			return ' ';
		}

	}

	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número del DNI");
		this.num = sc.nextInt();
		this.letra = calcularLetra(num);
	}

	@Override
	public String toString() {
		String numero = num + "";
		while (numero.length() < 8) {
			numero = "0" + numero;
		}
		return numero + "-" + Character.toUpperCase(letra);
	}

}
