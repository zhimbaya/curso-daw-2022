import java.io.*;
import java.util.Scanner;

class TestListaEnlazadaSimple
{
	static ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
	
	public static void main (String [] args)
	{
		arrancarAplicacion();	
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static int menu()
	{
		Scanner sc=new Scanner(System.in);
		
		int opcion;
		boolean opcionValida;
		System.out.println("\nMENU");
		System.out.println("1.Insertar al Principio");
		System.out.println("2.Insertar al Final");
		System.out.println("3.Buscar");
		System.out.println("4.Mostrar");
		System.out.println("5.Eliminar");
		System.out.println("6.Salir");
		System.out.print("Introduce una Opcion: ");
		do
		{
			opcion = sc.nextInt();
			opcionValida = (opcion >= 1 && opcion <= 6);
			if(!opcionValida)
				System.out.println("Error. La Opcion No es Valida. Introduce de Nuevo");
		}while(!opcionValida);
		
		return opcion;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void arrancarAplicacion()
	{
		int opcion;
		boolean salir;
		String nombre;
		
		do
		{
			opcion = menu();
			salir = (opcion == 6);
			
			switch(opcion)
			{
				case 1:
					nombre = pedirNombre();
					lista.insertarAlPrincipio(nombre);
					break;
				case 2:
					nombre = pedirNombre();
					lista.insertarAlFinal(nombre);
					break;
				case 3:
					if(lista.listaVacia())
						System.out.println("La Lista esta Vacia");
					else
					{
						nombre = pedirNombre();
						if(lista.buscar(nombre) == null)
							System.out.println(nombre + " no se Encuentra en la Lista");
						else
							System.out.println(nombre + " se Encuentra en la Lista");
					}
					break;
				case 4:
					if(lista.listaVacia())
						System.out.println("La Lista esta Vacia");
					else
						lista.mostrarLista();
					break;
				case 5:
					if(lista.listaVacia())
						System.out.println("La Lista esta Vacia");
					else
					{
						nombre = pedirNombre();
						if(lista.eliminar(nombre))
							System.out.println(nombre + " ha sido Eliminado");
						else
							System.out.println(nombre + " no se Encuentra en la Lista");
					}
					break;
			}
		}while(!salir);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static String pedirNombre()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un Nombre");
		return (sc.nextLine());
	}
}