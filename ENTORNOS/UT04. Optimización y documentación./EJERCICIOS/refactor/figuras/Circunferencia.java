package figuras;

public class Circunferencia {
	//Se ha modificado según el ejercicio.
	
	private static final double PI = 3.1416;
	private double radio;
	private String color;

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + 2 * radio);
		System.out.println("Color: " + color);
		double area = calcularArea();
		System.out.printf("Área : %.2f", area);
	}

	private double calcularArea() {
		double area = 2 * PI * radio * radio;
		return area;
	}

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
