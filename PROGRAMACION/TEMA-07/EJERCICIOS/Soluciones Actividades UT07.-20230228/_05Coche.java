public class Coche extends Vehiculo
{
	private int numPasajeros;
	
	////////////////////////////////////////////////////////////////////////////
	
	public Coche(int numRuedas,int autonomia,int numPasajeros)
	{
		super(numRuedas,autonomia);
		this.numPasajeros = numPasajeros;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void verDatos()
	{
		System.out.println("Los Datos del Coche son:");
		super.verDatos();
		System.out.println("El Numero Maximo de Pasajeros es: " + numPasajeros);
	}
}//Fin Class