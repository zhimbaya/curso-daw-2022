import java.io.*;

public class TestPunto
{
	public static void main(String [] args)
	{
		Punto p1 = new Punto(2,4);
		Punto p2 = new Punto(7,10);
		
		System.out.println("La Distancia entre los puntos p1 y p2 es: " + PuntoMejor.distanciaPuntos(p1,p2));
		
		PuntoMejor p3=new PuntoMejor(1, 1);
		System.out.println("La Distancia entre los puntos p1 y p3 es: " + p3.distanciaPuntos(p1));

	}
}