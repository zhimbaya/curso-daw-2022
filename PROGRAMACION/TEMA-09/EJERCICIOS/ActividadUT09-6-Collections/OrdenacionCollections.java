import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class OrdenacionCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//En esta declaracion e instanciación del ArrayList no indicamos explicitamente 
				//el tipo de dato que manejaremos, admitiendose cualquier objeto
				ArrayList arrayListEnteros=new ArrayList<>();
				
				//Incorporamos los datos en el arrayList desordenados. Metemos números, pero podríamos haber metido cualquier cosa
				//Java lo asimilará a objeto Integer
				arrayListEnteros.add(3);
				arrayListEnteros.add(2);
				arrayListEnteros.add(4);
				arrayListEnteros.add(1);
				arrayListEnteros.add(7);
				arrayListEnteros.add(5);
				arrayListEnteros.add(6);
				arrayListEnteros.add(0);
				
				//Datos en el orden en el que se han insertado
				System.out.println("Datos en el mismo orden en el que se han insertado");
				int pos=0;
				for (Object obj :arrayListEnteros) {
					System.out.println("Posición: " + (pos++) + " --->Valor: " + ((Integer) obj).intValue()); //Debemos castear para convertir a Integer y sacar continuación el valor númerico de ese objeto Integer
				}

				//Para ordenar los elementos del ArrayList usamos la clase "Collections" (no es la misma que "Collection")
				Collections.sort(arrayListEnteros); //Ordenará de menor a mayor
				//Imprimimos a continuación el ArrayList
				System.out.println("Datos del ArrayList ordenados de menor a mayor:");
				for(int i=0; i<arrayListEnteros.size(); i++)
					System.out.println("Posición: "+i+" --->Valor: " + arrayListEnteros.get(i));
				
				System.out.println("------------------------------");
				
				//Para ordenar los datos del ArrayList ahora de mayor a menor usamos la clase Comparator
				//la cual compara los elementos y los pone en orden inverso.
				Comparator<Integer> comparador = Collections.reverseOrder();
				Collections.sort(arrayListEnteros, comparador);
				//Recorremos de manera alternariva el ArrayList con un Iterator
				Iterator<Integer> miIterador=arrayListEnteros.iterator();
				int i=0;
				System.out.println("Datos del ArrayList ordenados de mayor a menor:");
				while(miIterador.hasNext()){
					Integer elemento = miIterador.next();
					System.out.println("Posición: "+i+" --->Valor: " + elemento);
					i++;
				}
				
		
	}

}
