public class TestVehiculo
{
	public static void main(String args[])
	{
		Coche c1 = new Coche(5,100,5);
		Camion ca1 = new Camion(14,150,1200);
		
		c1.verDatos();
		ca1.verDatos();
	}
}