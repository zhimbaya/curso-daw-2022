import java.nio.file.attribute.PosixFileAttributes;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListCadenas {
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList <String> miListaCadenas = new LinkedList<>();
		for(int i=0; i<5; i++){
			System.out.println("Introduce el nombre en posici�n " + i + ":");
			miListaCadenas.add(sc.nextLine());
		} 
		System.out.println("Tama�o: " + miListaCadenas.size());
		System.out.println("Primer elemento: " + miListaCadenas.getFirst());
		System.out.println("�ltimo elemento"+ miListaCadenas.getLast());
		
		int posFueraRango=7;
		try{
			System.out.println("Nodo en la posici�n 2: " + miListaCadenas.get(2));
			System.out.println("Nodo en la posici�n " + posFueraRango + ": " + miListaCadenas.get(7));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("La posici�n " + posFueraRango + " est� fuera de rango en la lista.");
		}

		
		System.out.println("Recorremos todos los nodos 'a mano' con un for: ");
		for(int i=0; i<miListaCadenas.size(); i++)
			System.out.println("Elemento en posici�n " + i + " = " + miListaCadenas.get(i));
		
		
		System.out.println("Recorremos todos los nodos con un iterador: ");
		Iterator miIterador=miListaCadenas.iterator();
		int pos=0;
		while (miIterador.hasNext()) {
			Object o = miIterador.next();
			System.out.println("Elemento en posici�n " + (pos++) + " = " + o);
		}

		
		System.out.println("Recorremos todos los nodos con un for each: ");
		pos=0;
		for(String elem: miListaCadenas)
			System.out.println("Elemento en posici�n " + (pos++) + " = " + elem);
		
		
		System.out.println("Recorremos todos los nodos 'a mano' con un for al rev�s: ");
		for(int i=miListaCadenas.size()-1; i>=0; i--)
			System.out.println("Elemento en posici�n " + i + " = " + miListaCadenas.get(i));
		
		
		System.out.println("Recorremos todos los nodos con un iterador al rev�s: ");
		//Debemos usar ListIterator en lugar de Iterator, pues tiene implementado m�todos previous() y hasPrevious()
		ListIterator miIterador2=miListaCadenas.listIterator(miListaCadenas.size()); //Dejamos el iterador apuntando al �ltimo elemento de mi LinkedList
		pos=miListaCadenas.size()-1;
		while (miIterador2.hasPrevious()) {
			Object o = miIterador2.previous();
			System.out.println("Elemento en posici�n " + (pos--) + " = " + o);
		}
		
		//No se puede realizar el recorrido en modo inverso con un for-each, ya que �ste solo itera hacia adelante de la lista y de uno en uno, no conoci�ndose la posici�n del �ndice.
		
		
	}

}
