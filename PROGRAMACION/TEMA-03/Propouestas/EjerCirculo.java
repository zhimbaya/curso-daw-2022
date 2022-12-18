package propuesta01;

public class EjerCirculo {
	/*
	 * Construye otra clase denominada TestCirculo donde se arranque la aplicación.
	 * Crea un círculo de radio 10 llamado circulo1 y visualiza su área. A
	 * continuación, instancia otro círculo circulo2 cuyo radio sea el asignado por
	 * defecto y muestra igualmente su área.
	 */

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo(10);
		System.out.printf("La superficie es: %.2f", circulo1.calcularSuperficie());
		System.out.println();
		Circulo circulo2 = new Circulo();
		System.out.printf("La superficie es: %.2f", circulo2.calcularSuperficie());

	}

}
