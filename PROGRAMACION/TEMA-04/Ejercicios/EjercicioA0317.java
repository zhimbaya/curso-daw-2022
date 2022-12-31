/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;

public class EjercicioA0317 {

	public static void main(String[] args) {
		/*
		 * Se cuenta con la siguiente información:
		 * 
		 * Las edades de 50 estudiantes del turno mañana. (entre 16 y 28 años ambos
		 * inclusive) Las edades de 60 estudiantes del turno tarde. (entre 16 y 35 años
		 * ambos inclusive) Las edades de 110 estudiantes del turno noche. (entre 18 y
		 * 45 años ambos inclusive) Las edades de cada estudiante deben calcularse de
		 * forma aleatoria usando el método random de la clase Math.
		 * 
		 * Para cada uno de los turnos se pide: a) Obtener la mínima, la máxima y el
		 * promedio de las edades de cada turno b) Mostrar por pantalla un mensaje que
		 * indique cual de los tres turnos tiene un promedio de edades mayor
		 */

		final int NM = 50;
		final int NT = 60;
		final int NN = 110;
		final int MENORM = 16;
		final int MAYORM = 28;
		final int MENORT = 16;
		final int MAYORT = 35;
		final int MENORN = 18;
		final int MAYORN = 45;
		int minM = MAYORM, maxM = MENORM, sumaM = 0;
		int minT = MAYORT, maxT = MENORT, sumaT = 0;
		int minN = MAYORN, maxN = MENORN, sumaN = 0;

		for (int i = 1; i <= NM; i++) {
			int e = (int) (Math.random() * (MAYORM - MENORM + 1) + MENORM);
			if (e < minM) {
				minM = e;
			}
			if (e > maxM) {
				maxM = e;
			}
			sumaM += e;
		}

		for (int i = 1; i <= NT; i++) {
			int e = (int) (Math.random() * (MAYORT - MENORT + 1) + MENORT);
			if (e < minT) {
				minT = e;
			}
			if (e > maxT) {
				maxT = e;
			}
			sumaT += e;
		}

		for (int i = 1; i <= NN; i++) {
			int e = (int) (Math.random() * (MAYORN - MENORN + 1) + MENORN);
			if (e < minN) {
				minN = e;
			}
			if (e > maxN) {
				maxN = e;
			}
			sumaN += e;
		}
		
		int promM = sumaM / NM;
		int promT = sumaT / NT;
		int promN = sumaN / NN;
		
		System.out.println("TURNO DE MAÑANA:");
		System.out.println("EDAD MÍNIMA:" + minM);
		System.out.println("EDAD MÁXIMA:" + maxM);
		System.out.println("PROMEDIO:" + promM);
		System.out.println("\nTURNO DE TARDE:");
		System.out.println("EDAD MÍNIMA:" + minT);
		System.out.println("EDAD MÁXIMA:" + maxT);
		System.out.println("PROMEDIO:" + promT);
		System.out.println("\nTURNO DE NOCHE:");
		System.out.println("EDAD MÍNIMA:" + minN);
		System.out.println("EDAD MÁXIMA:" + maxN);
		System.out.println("PROMEDIO:" + promN);

		if (promM == promT && promM == promN) {
			System.out.println("Los tres turnos tienen el promedio " + promM);
		} else if (promM == promT && promM > promN) {
			System.out.println("Los turnos de mañana y tarde tienen el promedio " + promM);
		} else if (promM == promN && promM > promT) {
			System.out.println("Los turnos de mañana y noche tienen el promedio " + promM);
		} else if (promT == promN && promT > promM) {
			System.out.println("Los turnos de tarde y noche tienen el promedio " + promM);
		} else if (promM > promT && promM > promN) {
			System.out.println("El turno de mañana tiene el promedio " + promM);
		} else if (promT > promM && promT > promN) {
			System.out.println("El turno de tarde tiene el promedio " + promT);
		} else {
			System.out.println("El turno de noche tiene el promedio " + promN);
		}

	}

}
