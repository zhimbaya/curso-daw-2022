class Nodo
{
	//Miembros Dato
	Object inf; //Contiene la informaci�n o dato (de tipo Object para ser lo m�s general posible)
	Nodo enlace;
	
	//Constructor
	public Nodo(Object inf,Nodo enlace)
	{
		this.inf = inf;
		this.enlace = enlace;
	}
}