package propuesta01;

public class Rectangulo {

	private double base;
	private double altura;

	// Constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
	}

	public Rectangulo(Rectangulo r1) {
		base = r1.base;
		altura = r1.altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public double getArea() {
		double area = base * altura;

		return area;
	}

	public double getPerimetro() {
		double perimetro = ((2 * base) + (2 * altura));

		return perimetro;
	}

}
