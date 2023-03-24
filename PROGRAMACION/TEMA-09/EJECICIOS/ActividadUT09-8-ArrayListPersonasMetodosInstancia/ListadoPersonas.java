import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ListadoPersonas {
	
	ArrayList<Persona> listaPersonas;
	
	public ListadoPersonas(){
		this.listaPersonas=new ArrayList<Persona>();
	}
	
	public ListadoPersonas(ArrayList<Persona> listaPersonas){
		this.listaPersonas=listaPersonas;
	}

		
	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	//Recorremos el array mediante bucle for clásico
	public boolean buscarPorNombre (String nombre){
		boolean encontrado=false;
		System.out.println("Personas con nombre " + nombre + ":\n"); 
		for(int i=0; i<this.listaPersonas.size(); i++)
			if(this.listaPersonas.get(i).nombre.equals(nombre)){
				System.out.println(this.listaPersonas.get(i).toString());
				encontrado=true;
			}	
		return encontrado;
	}
	
	//Recorremos el array mediante un iterador (clase Iterator)
	public boolean buscarPorApellidos (String apellidos){
		boolean encontrado=false;
		Persona miPersona;
		System.out.println("Personas con apellidos " + apellidos + ":\n"); 
		//Utilizaremos un sistema alternativo para recorrer basado en un objeto de la clase Iterator
		Iterator<Persona> iterador = this.listaPersonas.iterator(); 
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
	public boolean buscarPorCadenaContenidaEnApellidos(String cadena){
		boolean encontrado=false;
		Persona miPersona;
		System.out.println("Personas con apellidos que contienen " + cadena + ":\n");
		ListIterator<Persona> iterador=this.listaPersonas.listIterator(this.listaPersonas.size()); //Este iterador lo situamos al final del ArrayList
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
	public boolean buscarPorFechaNacimiento(int añoNacimiento){
		boolean encontrado=false;
		System.out.println("Personas nacidas el año " + añoNacimiento + ":\n");
		for(Persona indice: this.listaPersonas){
			if(indice.añoNacimiento==añoNacimiento){
				System.out.println(indice.toString());
				encontrado=true;
			}
		}
		return encontrado;
	}

}
