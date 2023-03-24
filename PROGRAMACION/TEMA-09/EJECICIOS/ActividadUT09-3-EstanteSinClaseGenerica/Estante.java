import java.util.ArrayList;
import java.util.Iterator;
	 
public class Estante implements Iterable{
	 
	private ArrayList miLista= new ArrayList();
	private int cantidadMaxima;
	 
	public Estante(int cantidadMaxima) {
	super();
	this.cantidadMaxima = cantidadMaxima;
	}
	public void add(Object objeto ) {
		if (miLista.size()<=cantidadMaxima) {
	 		miLista.add(objeto);
		}else {
			throw new RuntimeException("La estantar�a est� llena.");
		}
	 
	}
	 
	@Override
	public Iterator iterator() { //M�todo que devuelve un iterador que permitir� recorrer la lista
		return miLista.iterator();
	}
		

}
