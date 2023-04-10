class Nodo
{
	//Miembros Dato
	Object inf; //Contiene la información o dato (de tipo Object para ser lo más general posible)
	Nodo enlace;
	
	//Constructor
	public Nodo(Object inf,Nodo enlace)
	{
		this.inf = inf;
		this.enlace = enlace;
	}
}