import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//Al usar un hashMap los elementos que inserta en el map no tendrán un orden específico. 
//No aceptan claves duplicadas ni valores nulos. 
import java.util.Map.Entry;

public class ImplementacionHashMap {

	public static void main(String[] args) {
		
		// Creamos un Map en el que la clave va a ser el dorsal de los jugadores 
		//de fútbol de la selección española que jugaron de titulares 
		//la final de la copa del mundo de 2010, y su valor va a ser su nombre. 
		Map<Integer, String> hashMap=new HashMap<Integer, String>();
		
		hashMap.put(1, "Casillas");
		hashMap.put(15, "Ramos");
		hashMap.put(3, "Piqué");
		hashMap.put(5, "Puyol");
		hashMap.put(11, "Capdevila");
		hashMap.put(14, "Xabi Alonso");
		hashMap.put(16, "Busquet");
		hashMap.put(8, "Xavi Hernández");
		hashMap.put(18, "Pedrito");
		hashMap.put(6, "Iniesta");
		hashMap.put(7, "Villa");


		
		//Imprimimos los datos a través de un iterador, y veremos que los escribe sin ningún orden lógico
		Iterator iterador=hashMap.keySet().iterator();
		while(iterador.hasNext()){
			Integer clave = (Integer) iterador.next();
			System.out.println("Clave: "+ clave +" ---> Valor: " + hashMap.get(clave));
		}
		
		//Otra forma de recorrer el HashMap: mediante bucle foreach (especie de foreach, ya que como tal no existe con ese nombre en Java
		System.out.println("Forma alternativa de recorrer los elementos del Map, mostrado clave-->valor:");
		for(Entry<Integer, String> itemJugador: hashMap.entrySet()){
			Integer clave = itemJugador.getKey();
			String valor = itemJugador.getValue();
			System.out.println(clave + "-->" + valor);
		}
				
		
		//Operaciones varias:
		System.out.println("********* Trabajando con los métodos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el HashMap: hashMap.size() = "+hashMap.size());
		System.out.println("Vemos si el HashMap esta vacio : hashMap.isEmpty() = "+ hashMap.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasándole la clave 6: hashMap.get(6) = "+hashMap.get(6));
		System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): hashMap.remove(18)"); hashMap.remove(18);
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: hashMap.get(18) = "+hashMap.get(18));
		System.out.println("Vemos si existe un elemento con la clave 18: hashMap.containsKey(18) = "+hashMap.containsKey(18));
		System.out.println("Vemos si existe un elemento con la clave 1: hashMap.containsKey(1) = "+hashMap.containsKey(1));
		System.out.println("Vemos si existe el valor 'Villa' en el Map: hashMap.containsValue(\"Villa\") = "+hashMap.containsValue("Villa"));
		System.out.println("Vemos si existe el valor 'Pelé' en el Map: hashMap.containsValue(\"Pelé\") = "+hashMap.containsValue("Pelé"));
		System.out.println("Borramos todos los elementos del Map: hashMap.clear()"); hashMap.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: hashMap.size() = "+hashMap.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio hashMap.isEmpty() = "+hashMap.isEmpty());
	}

}
