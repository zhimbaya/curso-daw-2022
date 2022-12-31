package Tema04;

import java.util.Scanner;

public class AER_ejer02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Debido a la crisis, el bar de Javier ha notado un descenso de las
		 * consumiciones. Además, según dicen en los telediarios, la ley antitabaco le
		 * está perjudicando aún más. Como no termina de creerse todo lo que dicen en la
		 * televisión, ha decidido hacer un estudio de mercado semanal de su
		 * establecimiento. Para ello, ha estado apuntando la caja diaria que se ha
		 * realizado en las últimas semanas. Le gustaría saber qué día de la semana se
		 * producen el mayor y el menor número de ventas, y si las ventas del domingo
		 * superan a la media semanal. De esta manera podrá establecer estrategias de
		 * marketing que le permitan recuperar algo de las ganancias perdidas.
		 * 
		 * Javier abre su bar todos los días menos los Lunes, que utiliza para
		 * descansar.
		 * 
		 * Realiza un programa que ayude a Javier en su cometido. Dada una lista de
		 * valores correspondiente a una semana, nuestro programa deberá decirle a
		 * Javier el día de la semana que más y menos ha vendido, y si las ventas del
		 * domingo superan la media. Haga clic en el enlace
		 * https://www.aceptaelreto.com/problem/statement.php?id=105 para abrir el
		 * recurso.
		 */

		try {
			String str = "";
			float[] arrFloat = new float[7];
			float numMen = 100000;
			float numMay = -100000;
			float media = 0;
			String rendimiento = "";
			String semMay = "";
			String semMenor = "";

			Scanner sca = new Scanner(System.in);
			System.out.println("Lunes:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[0] = Float.parseFloat(str);
			
			System.out.println("Martes:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[1] = Float.parseFloat(str);

			System.out.println("Miercoles:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[2] = Float.parseFloat(str);

			System.out.println("Jueves:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[3] = Float.parseFloat(str);
			
			System.out.println("Viernes:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[4] = Float.parseFloat(str);

			System.out.println("Sábado:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[5] = Float.parseFloat(str);

			System.out.println("Domingo:");
			str = sca.nextLine();
			str.replaceAll(".", ",");
			arrFloat[6] = Float.parseFloat(str);

			for (int i = 0; i < arrFloat.length; i++) {
				if (numMay < arrFloat[i]) {
					// aqui aparece numero mayor
					numMay = arrFloat[i];
				}
				if (numMen > arrFloat[i]) {
					// aqui aparece numero mayor
					numMen = arrFloat[i];
				}
			}
			// Obtenemos el día de la semana mayor y menor con cuidado de repetir la semana
			for (int i = 0; i < arrFloat.length; i++) {
				if (arrFloat[i] == numMay) {
					if (i == 0) {
						semMay = semMay + "Lunes ";
					} else if (i == 1) {
						semMay = semMay + "Martes ";
					} else if (i == 2) {
						semMay = semMay + "Miercoles ";
					} else if (i == 3) {
						semMay = semMay + "Jueves ";
					} else if (i == 4) {
						semMay = semMay + "Viernes ";
					} else if (i == 5) {
						semMay = semMay + "Sábado ";
					} else if (i == 6) {
						semMay = semMay + "Domingo ";
					}
				}
				if (arrFloat[i] == numMen) {
					if (i == 0) {
						semMenor = semMenor + "Lunes ";
					} else if (i == 1) {
						semMenor = semMenor + "Martes ";
					} else if (i == 2) {
						semMenor = semMenor + "Miercoles ";
					} else if (i == 3) {
						semMenor = semMenor + "Jueves ";
					} else if (i == 4) {
						semMenor = semMenor + "Viernes ";
					} else if (i == 5) {
						semMenor = semMenor + "Sábado ";
					} else if (i == 6) {
						semMenor = semMenor + "Domingo ";
					}
				}
			}

			// calcula la media
			for (int i = 0; i < arrFloat.length; i++) {
				media = media + arrFloat[i];
			}
			media = media / 7;
			
			// Vemos si el domingo merece la pena(se hace más que la media semanal)
			if (media < arrFloat[6]) {
				rendimiento = "SI";
			} else {
				rendimiento = "NO";
			}

			System.out.println("Dia de Más Ventas: " + semMay + " - " + "Dia de Menos Ventas: " + semMenor
					+ "\nMas dinero Media " + rendimiento);

		} catch (Exception ex) {
			System.out.println("Debes de poner un número válido");
		}

	}

}
