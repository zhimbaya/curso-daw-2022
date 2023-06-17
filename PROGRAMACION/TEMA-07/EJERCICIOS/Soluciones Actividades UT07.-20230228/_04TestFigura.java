public class TestFigura
{
	public static void main(String args[])
	{
		Triangulo t1 = new Triangulo(2,4);
		Rectangulo r1 = new Rectangulo(4,2);
	
		System.out.println("El Area del Triangulo es: " + t1.area());
		System.out.println("El Area del Rectangulo es: " + r1.area());
	}
}