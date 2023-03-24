import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//Al usar un LinkedHashMap se colocan en el Map los elementos en el orden en el que se van insertando; 
//es decir, que no tiene una ordenaci�n de los elementos como tal, por lo que esta clase realiza las 
//b�squedas de los elementos de forma m�s lenta que las dem�s clases

public class ImplementacionLinkedHashMap {

	public static void main(String[] args) {
		
		// Creamos un Map en el que la clave va a ser el dorsal de los jugadores 
		//de f�tbol de la selecci�n espa�ola que jugaron de titulares 
		//la final de la copa del mundo de 2010, y su valor va a ser su nombre. 
		Map<Integer, String> linkedHashMap=new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(3, "Piqu�");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(16, "Busquet");
		linkedHashMap.put(8, "Xavi Hern�ndez");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(6, "Iniesta");
		linkedHashMap.put(7, "Villa");
		
		//Imprimimos los datos a trav�s de un iterador, y veremos que se muestran en el mismo orden en que los insertamos
		Iterator iterador=linkedHashMap.keySet().iterator();
		while(iterador.hasNext()){
			Integer clave = (Integer) iterador.next();
			System.out.println("Clave: "+ clave +" ---> Valor: " + linkedHashMap.get(clave));
		}
		
		//Otra forma de recorrer el LinkedHashMap: mediante bucle foreach (especie de foreach, ya que como tal no existe con ese nombre en Java
		System.out.println("Forma alternativa de recorrer los elementos del Map, mostrado clave-->valor:");
		for(Entry<Integer, String> itemJugador: linkedHashMap.entrySet()){
			Integer clave = itemJugador.getKey();
			String valor = itemJugador.getValue();
			System.out.println(clave + "-->" + valor);
		}
		
		//Operaciones varias:
		System.out.println("********* Trabajando con los m�todos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el linkedHashMap: linkedHashMap.size() = "+linkedHashMap.size());
		System.out.println("Vemos si el linkedHashMap esta vacio : linkedHashMap.isEmpty() = "+ linkedHashMap.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6: linkedHashMap.get(6) = "+linkedHashMap.get(6));
		System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): linkedHashMap.remove(18)"); linkedHashMap.remove(18);
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: linkedHashMap.get(18) = "+linkedHashMap.get(18));
		System.out.println("Vemos si existe un elemento con la clave 18: linkedHashMap.containsKey(18) = "+linkedHashMap.containsKey(18));
		System.out.println("Vemos si existe un elemento con la clave 1: linkedHashMap.containsKey(1) = "+linkedHashMap.containsKey(1));
		System.out.println("Vemos si existe el valor 'Villa' en el Map: linkedHashMap.containsValue(\"Villa\") = "+linkedHashMap.containsValue("Villa"));
		System.out.println("Vemos si existe el valor 'Pel�' en el Map: linkedHashMap.containsValue(\"Pel�\") = "+linkedHashMap.containsValue("Pel�"));
		System.out.println("Borramos todos los elementos del Map: linkedHashMap.clear()"); linkedHashMap.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tama�o: linkedHashMap.size() = "+linkedHashMap.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio linkedHashMap.isEmpty() = "+linkedHashMap.isEmpty());
	}

}
