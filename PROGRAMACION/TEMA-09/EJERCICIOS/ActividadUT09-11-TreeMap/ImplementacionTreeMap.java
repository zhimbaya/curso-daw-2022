import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
//Al usar un TreeMap Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores enteros 
//los ordena de menor a mayor por la clave.  
import java.util.Map.Entry;

public class ImplementacionTreeMap {

	public static void main(String[] args) {
		
		// Creamos un Map en el que la clave va a ser el dorsal de los jugadores 
		//de fútbol de la selección española que jugaron de titulares 
		//la final de la copa del mundo de 2010, y su valor va a ser su nombre. 
		Map<Integer, String> treeMap=new TreeMap<Integer, String>();
		
		treeMap.put(1, "Casillas");
		treeMap.put(15, "Ramos");
		treeMap.put(3, "Piqué");
		treeMap.put(5, "Puyol");
		treeMap.put(11, "Capdevila");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(16, "Busquet");
		treeMap.put(8, "Xavi Hernández");
		treeMap.put(18, "Pedrito");
		treeMap.put(6, "Iniesta");
		treeMap.put(7, "Villa");
		
		//Imprimimos los datos a través de un iterador, y veremos que se ordenar de menor a mayor por la clave
		Iterator iterador=treeMap.keySet().iterator();
		while(iterador.hasNext()){
			Integer clave = (Integer) iterador.next();
			System.out.println("Clave: "+ clave +" ---> Valor: " + treeMap.get(clave));
		}
		
		//Otra forma de recorrer el TreeMap: mediante bucle foreach (especie de foreach, ya que como tal no existe con ese nombre en Java
		System.out.println("Forma alternativa de recorrer los elementos del Map, mostrado clave-->valor:");
		for(Entry<Integer, String> itemJugador: treeMap.entrySet()){
			Integer clave = itemJugador.getKey();
			String valor = itemJugador.getValue();
			System.out.println(clave + "-->" + valor);
		}
		
		//Operaciones varias:
		System.out.println("********* Trabajando con los métodos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el treeMap: treeMap.size() = "+treeMap.size());
		System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = "+ treeMap.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = "+treeMap.get(6));
		System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18)"); treeMap.remove(18);
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = "+treeMap.get(18));
		System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = "+treeMap.containsKey(18));
		System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+treeMap.containsKey(1));
		System.out.println("Vemos si existe el valor 'Villa' en el Map: treeMap.containsValue(\"Villa\") = "+treeMap.containsValue("Villa"));
		System.out.println("Vemos si existe el valor 'Pelé' en el Map: treeMap.containsValue(\"Pelé\") = "+treeMap.containsValue("Pelé"));
		System.out.println("Borramos todos los elementos del Map: treeMap.clear()"); treeMap.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = "+treeMap.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = "+treeMap.isEmpty());
	}

}
