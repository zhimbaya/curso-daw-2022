import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaConjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementaremos la interfaz Set mediante la subclases HashSet
		Set<Persona> conjuntoSetPersonas = new HashSet<Persona>();
		//Implementaremos la interfaz SortedSet mediante la subclases TreeSet
		SortedSet<Persona> conjuntoSortedSetPersonas = new TreeSet<Persona>();
		
		Persona p = new Persona(1, "Rosa", 172);
		Persona p2 = new Persona(2, "Ana", 168);
		Persona p3 = new Persona(3, "Mario", 185);
		Persona p4 = new Persona(4, "Ana", 182);
		Persona p5 = new Persona(5, "Pedro", 181);
		
		//Incorporamos los objetos Persona en los 2 conjuntos creados para ver las diferencias de comportamiento:
		//Primero en el Set:
		conjuntoSetPersonas.add(p);
		conjuntoSetPersonas.add(p2);
		conjuntoSetPersonas.add(p3);
		conjuntoSetPersonas.add(p4);
		conjuntoSetPersonas.add(p5);
		
		//Segundo en el SortedSet:
		conjuntoSortedSetPersonas.add(p);
		conjuntoSortedSetPersonas.add(p2);
		conjuntoSortedSetPersonas.add(p3);
		conjuntoSortedSetPersonas.add(p4);
		conjuntoSortedSetPersonas.add(p5);

		//El conjunto de tipo Set se mostrará desordenado (nada que ver con el orden en que se introdujeron los elementos)
		System.out.println("El conjunto de tipo Set contiene: ");
		//Utilizará en método toString() sobreescrito anteriormente. Como JavaScript al escribir un array, escribe 
		//todos los elementos separados por ",", y con un corchete al principio de todos y al final de todos. 
		//Además hemos sobreescrito toString() para que cada elemento sea inteligible y mostrando todos sus campos
		System.out.println(conjuntoSetPersonas);  
		
		//El conjunto de tipo SortedSet se mostrará ordenado con arreglo al criterio que hayamos indicado en la implementación del
		//método compareTo() de la interfaz Comparable. Además no puede haber repeticiones con respecto al criterio de comparación
		System.out.println("El conjunto de tipo SortedSet contiene: ");
		//Utilizará en método toString() sobreescrito anteriormente. Como JavaScript al escribir un array, escribe 
		//todos los elementos separados por ",", y con un corchete al principio de todos y al final de todos. 
		//Además hemos sobreescrito toString() para que cada elemento sea inteligible y mostrando todos sus campos
		System.out.println(conjuntoSortedSetPersonas); //Utilizará en método toString() sobreescrito anteriormente
		

	}

}
