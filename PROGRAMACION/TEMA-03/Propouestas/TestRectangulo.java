package propuesta01;

class TestRectangulo {
	public static void main(String args[]) {
		Rectangulo r1 = new Rectangulo(4, 2);
		Rectangulo r2 = new Rectangulo(r1);

		System.out.println("El Area del Rectangulo es: " + r1.getArea());
		System.out.println("El Perimetro del Rectangulo es: " + r1.getPerimetro());
	}
}
