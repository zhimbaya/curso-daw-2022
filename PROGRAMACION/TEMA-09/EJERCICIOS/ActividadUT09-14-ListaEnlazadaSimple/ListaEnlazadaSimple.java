class ListaEnlazadaSimple
{
	//Miembros Dato
	Nodo inicio;

	//Constructor
	public ListaEnlazadaSimple()
	{
		inicio = null;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void insertarAlPrincipio(Object info)
	{
		Nodo nuevo = new Nodo(info,inicio);
		inicio = nuevo;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public boolean listaVacia()
	{
		return (inicio == null);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void insertarAlFinal(Object info)
	{
		Nodo nuevo = new Nodo(info,null);
		if(listaVacia())
			inicio = nuevo;
		else
		{
			//Nos Situamos en el ultimo Nodo
			Nodo actual = inicio;
			while(actual.enlace != null)
				actual = actual.enlace;
				
			//Enlazamos el ultimo Nodo con el Nuevo
			actual.enlace = nuevo;
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public Nodo buscar(Object info)
	{
		Nodo actual = inicio;
		while(actual != null)
		{
			if(actual.inf.equals(info))
				return actual;
				
			actual = actual.enlace;
		}
		
		return null;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void mostrarLista()
	{
		Nodo actual = inicio;
		while(actual != null)
		{
			System.out.print(actual.inf + "  ");
			actual = actual.enlace;
		}
		System.out.println();
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public boolean eliminar(Object info)
	{
		Nodo actual = inicio.enlace;
		Nodo anterior = inicio;
		
		if(inicio.inf.equals(info))
		{
			inicio = inicio.enlace;
			return true;
		}
		else
		{
			while(actual != null)
			{
				if(actual.inf.equals(info))
				{
					anterior.enlace = actual.enlace;
					return true;
				}
				else
				{
					anterior = actual;
					actual = actual.enlace;
				}
			}
		}
		
		return false;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public boolean elimina2(Object info)
	{
		Nodo actual = inicio;
		Nodo anterior = null;
		boolean encontrado = false;
		
		while(actual != null && !encontrado)
		{
			if(actual.inf.equals(info))
				encontrado = true;
			else
			{
				anterior = actual;
				actual = actual.enlace;
			}
		}
		
		if(encontrado)
		{
			//Si es el Primero
			if(anterior == null)
				inicio = inicio.enlace;
			else
				anterior.enlace = actual.enlace;
		}
		
		return encontrado;
	}
}
