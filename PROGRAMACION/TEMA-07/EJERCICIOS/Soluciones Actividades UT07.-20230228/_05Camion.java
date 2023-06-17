public class Camion extends Vehiculo
{
	private int limiteCarga;
	
	////////////////////////////////////////////////////////////////////////////
	
	public Camion(int numRuedas,int autonomia,int limiteCarga)
	{
		super(numRuedas,autonomia);
		this.limiteCarga = limiteCarga;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void verDatos()
	{
		System.out.println("\nLos Datos del Camion son:");
		super.verDatos();
		System.out.println("El Limite Maximo de la Carga es: " + limiteCarga);
	}	
}//Fin Class