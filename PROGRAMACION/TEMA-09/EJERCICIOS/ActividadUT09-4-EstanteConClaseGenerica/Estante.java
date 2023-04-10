import java.util.ArrayList;
import java.util.Iterator;
	 
public class Estante<T> implements Iterable<T>{
	 
	private ArrayList<T> miLista= new ArrayList<T>();
	private int cantidadMaxima;
	 
	public Estante(int cantidadMaxima) {
	super();
	this.cantidadMaxima = cantidadMaxima;
	}
	public void add(T objeto ) {
		if (miLista.size()<=cantidadMaxima) {
	 		miLista.add(objeto);
		}else {
			throw new RuntimeException("La estantar�a est� llena.");
		}
	 
	}
	
	@Override
	public Iterator<T> iterator() { //M�todo que devuelve un iterador que permitir� recorrer la lista
		return miLista.iterator();
	}
	

}
