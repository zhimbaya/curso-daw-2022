import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ListadoPersonas {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
		listaPersonas.add(new Persona("Pedro", "P�rez Dom�nguez", 1993));
		listaPersonas.add(new Persona("Rosa", "Rold�n Rosal", 1992));
		listaPersonas.add(new Persona("Noelia", "Gonz�lez Mart�nez", 1990));
		listaPersonas.add(new Persona("Rigoberto", "Ram�rez Renatez", 1988));
		listaPersonas.add(new Persona("Marina", "Casta�o Bienlosabes", 1991));
		listaPersonas.add(new Persona("Manolo", "Gonz�lez Ariza", 1977));
		listaPersonas.add(new Persona("Rosa", "Blanco Pinz�n", 1988));
		listaPersonas.add(new Persona("Miguel", "Blanco Pinz�n", 1988));
		
		System.out.println("Indique nombre a buscar:");
		String nombre=leer.nextLine();
		if(!buscarPorNombre(listaPersonas, nombre))
			System.out.println("Nadie llamado " + nombre);
		System.out.println();
		
		System.out.println("Indique apellidos a buscar:");
		String apellidos=leer.nextLine();
		if(!buscarPorApellidos(listaPersonas, apellidos))
			System.out.println("Nadie apellidado " + apellidos);
		System.out.println();
		
		System.out.println("Indique cadena contenida en apellidos a buscar:");
		String cadena=leer.nextLine();
		if(!buscarPorCadenaContenidaEnApellidos(listaPersonas, cadena))
			System.out.println("Nadie que contenga en sus apellidos la cadena " + cadena);
		System.out.println();
		
		System.out.println("Indique a�o de nacimiento a buscar:");
		int a�oNacimiento=leer.nextInt();
		if(!buscarPorFechaNacimiento(listaPersonas, a�oNacimiento))
			System.out.println("Nadie nacido en " + a�oNacimiento);
		System.out.println();
	}
	
	//Recorremos el array mediante bucle for cl�sico
	public static boolean buscarPorNombre (ArrayList<Persona> lista, String nombre){
		boolean encontrado=false;
		System.out.println("Personas con nombre " + nombre + ":\n"); 
		for(int i=0; i<lista.size(); i++)
			if(lista.get(i).nombre.equals(nombre)){
				System.out.println(lista.get(i).toString());
				encontrado=true;
			}	
		return encontrado;
	}
	
	//Recorremos el array mediante un iterador (clase Iterator)
	public static boolean buscarPorApellidos (ArrayList<Persona> lista, String apellidos){
		boolean encontrado=false;
		Persona miPersona;
		System.out.println("Personas con apellidos " + apellidos + ":\n"); 
		//Utilizaremos un sistema alternativo para recorrer basado en un objeto de la clase Iterator
		Iterator<Persona> iterador = lista.iterator(); 
		while(iterador.hasNext()){
			miPersona=iterador.next(); //Hacemos avanzar mediante el iterador por el ArrayList
			if(miPersona.apellidos.equals(apellidos)){
				System.out.println(miPersona.toString());
				encontrado=true;
			}	
		}
		return encontrado;
	}
	
	//Recorremos el array utilizando otro iterador (clase ListIterator)
	public static boolean buscarPorCadenaContenidaEnApellidos(ArrayList<Persona> lista, String cadena){
		boolean encontrado=false;
		Persona miPersona;
		System.out.println("Personas con apellidos que contienen " + cadena + ":\n");
		ListIterator<Persona> iterador=lista.listIterator(lista.size()); //Este iterador lo situamos al final del ArrayList
		while(iterador.hasPrevious()){ //Recorremos en orden inverso
			miPersona=iterador.previous();
			if(miPersona.apellidos.contains(cadena)){
				System.out.println(miPersona.toString());
				encontrado=true;
			}
		}
		
		
		return encontrado;
	}
	
	//Recorremos el array mediante bucle for-each de Java
	public static boolean buscarPorFechaNacimiento(ArrayList<Persona> lista, int a�oNacimiento){
		boolean encontrado=false;
		System.out.println("Personas nacidas el a�o " + a�oNacimiento + ":\n");
		for(Persona indice: lista){
			if(indice.a�oNacimiento==a�oNacimiento){
				System.out.println(indice.toString());
				encontrado=true;
			}
		}
		return encontrado;
	}

}
