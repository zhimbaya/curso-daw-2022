import java.io.*;

class PilaDinamica 
{
	//Miembros Dato
	private Nodo cima;
	
	//Constructor
	public PilaDinamica()
	{
		cima = null;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public boolean vacia()
	{
		return (cima == null);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void insertar(Object obj)
	{
		Nodo nuevo = new Nodo (obj,cima);
		cima = nuevo;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public Object eliminar()
	{
		try
		{
			if(vacia())
				throw new PilaVacia();
			else
			{
				Object aux = cima.inf;
				cima = cima.enlace;
				return aux;
			}
		}
		
		catch(PilaVacia error)
		{
			System.out.println("Error Pila Vacia");
			return null;
		}
	}
}

////////////////////////////////////////////////////////////////////////////////

class PilaVacia extends Exception
{
	public PilaVacia()
	{
		super();
	}
}