import java.util.ArrayList;
import java.util.Scanner;

public class PruebaListadoPersonas {
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		ListadoPersonas miListadoPersonas=new ListadoPersonas();
		
		miListadoPersonas.listaPersonas.add(new Persona("Pedro", "P�rez Dom�nguez", 1993));
		miListadoPersonas.listaPersonas.add(new Persona("Rosa", "Rold�n Rosal", 1992));
		miListadoPersonas.listaPersonas.add(new Persona("Noelia", "Gonz�lez Mart�nez", 1990));
		miListadoPersonas.listaPersonas.add(new Persona("Rigoberto", "Ram�rez Renatez", 1988));
		miListadoPersonas.listaPersonas.add(new Persona("Marina", "Casta�o Bienlosabes", 1991));
		miListadoPersonas.listaPersonas.add(new Persona("Manolo", "Gonz�lez Ariza", 1977));
		miListadoPersonas.listaPersonas.add(new Persona("Rosa", "Blanco Pinz�n", 1988));
		miListadoPersonas.listaPersonas.add(new Persona("Miguel", "Blanco Pinz�n", 1988));
		//Lo que acabo de hacer es correcto, pero es m�s ortodoxo y seguro, utilizar m�todo setter() para cargar el ArrayList de objetos Persona (el m�todo est� implementado en ListadoPersonas
		
		//Otra forma
		ArrayList miArrayList=new ArrayList<Persona>();
		miArrayList.add(new Persona("Pedro", "P�rez Dom�nguez", 1993));
		miArrayList.add(new Persona("Rosa", "Rold�n Rosal", 1992));
		miArrayList.add(new Persona("Noelia", "Gonz�lez Mart�nez", 1990));
		miArrayList.add(new Persona("Rigoberto", "Ram�rez Renatez", 1988));
		miArrayList.add(new Persona("Marina", "Casta�o Bienlosabes", 1991));
		miArrayList.add(new Persona("Manolo", "Gonz�lez Ariza", 1977));
		miArrayList.add(new Persona("Rosa", "Blanco Pinz�n", 1988));
		miArrayList.add(new Persona("Miguel", "Blanco Pinz�n", 1988));
		ListadoPersonas miListadoPersonas2=new ListadoPersonas(miArrayList); 
		//Sobre miListadoPersonas2 podemos invocar los mismos m�todos que hacemos a continuacion para miListadoPersonas obteniendo el mismo resultado
		
		
		System.out.println("Indique nombre a buscar:");
		String nombre=leer.nextLine();
		if(!miListadoPersonas.buscarPorNombre(nombre))
			System.out.println("Nadie llamado " + nombre);
		System.out.println();
		
		System.out.println("Indique apellidos a buscar:");
		String apellidos=leer.nextLine();
		if(!miListadoPersonas.buscarPorApellidos(apellidos))
			System.out.println("Nadie apellidado " + apellidos);
		System.out.println();
		
		System.out.println("Indique cadena contenida en apellidos a buscar:");
		String cadena=leer.nextLine();
		if(!miListadoPersonas.buscarPorCadenaContenidaEnApellidos(cadena))
			System.out.println("Nadie que contenga en sus apellidos la cadena " + cadena);
		System.out.println();
		
		System.out.println("Indique a�o de nacimiento a buscar:");
		int a�oNacimiento=leer.nextInt();
		if(!miListadoPersonas.buscarPorFechaNacimiento(a�oNacimiento))
			System.out.println("Nadie nacido en " + a�oNacimiento);
		System.out.println();
	}
	

}
