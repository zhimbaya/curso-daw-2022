
public class PuntoMejor extends Punto
{
	//Constructores
	public PuntoMejor(double x,double y)
	{
		super(x,y);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static double distanciaPuntos(Punto p1,Punto p2)
	{
		double distancia;
		
		distancia = Math.sqrt(((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())) + ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY())));
		
		return distancia;
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	public double distanciaPuntos(Punto p)
	{
		double distancia;
		
		distancia = Math.sqrt(((p.getX() - this.getX()) * (p.getX() - this.getX())) + ((p.getY() - this.getY()) * (p.getY() - this.getY())));
		
		return distancia;
	}
}