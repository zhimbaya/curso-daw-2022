import java.util.Comparator;
import java.util.Objects;

public class Persona implements Comparable<Persona>{ 
    public int id;       
    public String nombre;       
    public int altura; 
    
    public Persona(int id, String nombre, int altura) { 
        this.id = id;   
        this.nombre = nombre;    
        this.altura = altura;
    } 
    
    @Override 
    public String toString() {  
        return "Persona: id: " + id + " Nombre: "+nombre + " Altura: " + altura + "\n";  
    } 

    @Override 
    public int compareTo(Persona per) { //Método que habrá que sobreescribir para implementar la interfaz Comparable
    	return per.altura-this.altura; //De esta forma, en las SortedSet ordenará de mayor a menor por altura
    	//return this.altura-per.altura; //De esta forma, en las SortedSet ordenará de menor a menor por altura
    	//return per.nombre.compareTo(this.nombre); //De esta forma, en las SortedSet ordenará de mayor a menor por nombre
    	//return this.nombre.compareTo(per.nombre); //De esta forma, en las SortedSet ordenará de mayor a menor por nombre

	}
	
    
    
} 