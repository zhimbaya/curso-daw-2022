import java.io.*;

public class TestGeometria
{
	public static void main(String args[])
	{
		Rectangulo r1 = new Rectangulo(2,4);
		Circunferencia c1 = new Circunferencia(5);
		
		Geometria interfaz = r1;
		
		System.out.println("***RECTANGULO***");
		System.out.println("El Area del Rectangulo es: " + interfaz.calcularArea());
		System.out.println("El Perimetro del Rectangulo es: " + interfaz.calcularPerimetro());
		
		interfaz = c1;
		
		System.out.println("\n***CIRCUNFERENCIA***");
		System.out.println("El Area de la Circunferencia es: " + interfaz.calcularArea());
		System.out.println("El Perimetro de la Circunferencia es: " + interfaz.calcularPerimetro());
	}
}