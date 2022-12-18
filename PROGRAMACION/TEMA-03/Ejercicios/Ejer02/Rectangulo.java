
package ejercicioa0402;

public class Rectangulo {

	// Atributos
	private double base;
	private double altura;

	// Constructores

	public Rectangulo() {
		base = 1;
		altura = 1;
	}

	public Rectangulo(double b, double a) {
		base = b;
		altura = a;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double b) {
		base = b;
	}

	public void setAltura(double a) {
		altura = a;
	}

	public void setLados(double b, double a) {
		base = b;
		altura = a;
	}

	public double perimetro() {
		return 2 * base + 2 * altura;
	}

	public double area() {
		return base * altura;
	}
}
