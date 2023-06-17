import java.io.*;

public class Punto
{
	//Miembros Dato
	private double x;
	private double y;
	
	//Constructores
	public Punto(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	
	//Constructor copia
	public Punto(Punto copia)
	{
		x = copia.x;
		y = copia.y;
	}
	
	//Metodos set
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	//Metodos get
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
}