import java.util.ArrayList;
import java.util.Scanner;

public class PruebaListadoPersonas {
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		ListadoPersonas miListadoPersonas=new ListadoPersonas();
		
		miListadoPersonas.listaPersonas.add(new Persona("Pedro", "Pérez Domínguez", 1993));
		miListadoPersonas.listaPersonas.add(new Persona("Rosa", "Roldán Rosal", 1992));
		miListadoPersonas.listaPersonas.add(new Persona("Noelia", "González Martínez", 1990));
		miListadoPersonas.listaPersonas.add(new Persona("Rigoberto", "Ramírez Renatez", 1988));
		miListadoPersonas.listaPersonas.add(new Persona("Marina", "Castaño Bienlosabes", 1991));
		miListadoPersonas.listaPersonas.add(new Persona("Manolo", "González Ariza", 1977));
		miListadoPersonas.listaPersonas.add(new Persona("Rosa", "Blanco Pinzón", 1988));
		miListadoPersonas.listaPersonas.add(new Persona("Miguel", "Blanco Pinzón", 1988));
		//Lo que acabo de hacer es correcto, pero es más ortodoxo y seguro, utilizar método setter() para cargar el ArrayList de objetos Persona (el método está implementado en ListadoPersonas
		
		//Otra forma
		ArrayList miArrayList=new ArrayList<Persona>();
		miArrayList.add(new Persona("Pedro", "Pérez Domínguez", 1993));
		miArrayList.add(new Persona("Rosa", "Roldán Rosal", 1992));
		miArrayList.add(new Persona("Noelia", "González Martínez", 1990));
		miArrayList.add(new Persona("Rigoberto", "Ramírez Renatez", 1988));
		miArrayList.add(new Persona("Marina", "Castaño Bienlosabes", 1991));
		miArrayList.add(new Persona("Manolo", "González Ariza", 1977));
		miArrayList.add(new Persona("Rosa", "Blanco Pinzón", 1988));
		miArrayList.add(new Persona("Miguel", "Blanco Pinzón", 1988));
		ListadoPersonas miListadoPersonas2=new ListadoPersonas(miArrayList); 
		//Sobre miListadoPersonas2 podemos invocar los mismos métodos que hacemos a continuacion para miListadoPersonas obteniendo el mismo resultado
		
		
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
		
		System.out.println("Indique año de nacimiento a buscar:");
		int añoNacimiento=leer.nextInt();
		if(!miListadoPersonas.buscarPorFechaNacimiento(añoNacimiento))
			System.out.println("Nadie nacido en " + añoNacimiento);
		System.out.println();
	}
	

}
