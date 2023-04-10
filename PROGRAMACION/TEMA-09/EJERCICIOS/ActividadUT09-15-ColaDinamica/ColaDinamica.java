import java.io.*;

class ColaDinamica
{
	private Nodo primero;
	private Nodo ultimo;
	
	public ColaDinamica()
	{
		primero = null;
		ultimo = null;
	}
	
	public boolean vacia()
	{
		return (primero == null);
	}
	
	public void insertar(Object obj)
	{
		Nodo nuevo = new Nodo(obj,null);
		
		if(vacia())
			primero = nuevo;
		else
			ultimo.enlace = nuevo;
			
		ultimo = nuevo;
	}
	
	public Object eliminar()
	{
		try
		{
			if(vacia())
				throw new ColaVacia();
			else
			{
				Object aux = primero.inf;
				primero = primero.enlace;
				
				if(vacia())
					ultimo = null;
					
				return aux;
			}
		}
		
		catch(ColaVacia error)
		{
			System.out.println("La Cola esta Vacia");
			return null;
		}
	}
}

class ColaVacia extends Exception
{
	public ColaVacia()
	{
		super();
	}
}