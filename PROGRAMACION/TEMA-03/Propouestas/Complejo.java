package propuesta01;

public class Complejo {
	/*
	 * 1. Actividad UT03-1: Clase Complejo.
	 * 
	 * Construye una clase Complejo con dos atributos:
	 * 
	 * real: parte real del número complejo
	 * 
	 * imag: parte imaginaria del número complejo
	 * 
	 */
	private double real;
	private double imag;

	// A continuación crea los siguientes métodos dentro de la clase:

	// public Complejo(): Constructor que inicializa los atributos a cero.
	public Complejo() {
		this.real = 0;
		this.imag = 0;
	}

	// public Complejo(double real, double imag): Constructor que inicializa los
	// atributos a los valores indicados por los parámetros.
	public Complejo (double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	// public double consulta_Real(): Devuelve la parte real del objeto.
	public double consulta_Real() {
		return real;
	}

	// public double consulta_Imag(): Devuelve la parte imaginaria del objeto.
	public double consulta_Imag() {
		return imag;
	}

	// public void cambia_Real(double real): Asigna a la parte real del objeto el
	// valor indicado en el parámetro real.
	public void cambia_Real(double real) {
		this.real = real;
	}

	// public void cambia_Imag(double imag): Asigna a la parte imaginaria del objeto
	// el valor indicado en el parámetro imag.
	public void cambia_Imag(double imag) {
		this.imag = imag;
	}

	// public String toString(): Convierte a String el número complejo, mediante la
	// concatenación de sus atributos y devuelve como resultado la cadena de texto 3
	// + 4i, si 3 es la parte real y 4 la parte imaginaria.
	public String toString() {
		return String.format("%.0f + %.0fi", real, imag);
	}

	// public void sumar(Complejo b): Suma la parte real con la parte real del
	// número complejo b y la parte imaginaria con la parte imaginaria del número
	// complejo b.
	public void sumar(Complejo b) {
		double sumaReal = this.real + b.real;
        double sumaImag = this.imag + b.imag;
        System.out.printf("La parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, sumaReal);
        System.out.printf("La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, sumaImag);
		
	}

	// Crea un proyecto que contenga la clase Complejo en un paquete llamado numeros
	// y pruebe todos sus métodos.

}
