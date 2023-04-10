import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class ColeccionAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Alumno> listaAlumnos = new ArrayList<Alumno>(); // El tipo de listaAlumnos es Collection
		Alumno a1=new Alumno("Pepe", 6);
		Alumno a2=new Alumno("Pedro", 4);
		Alumno a3=new Alumno("Rosa", 8);
		Alumno a4=new Alumno("Felisa", 9);
		Alumno a5=new Alumno("Noelia", 6);
		Alumno a6=new Alumno("Juan", 6);
		
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);
		listaAlumnos.add(a4);
		listaAlumnos.add(a5);
		listaAlumnos.add(a6);
		
		System.out.println("\nNúmero de elementos antes de eliminar: " + listaAlumnos.size() ) ;
		
		System.out.println("Son:");
		for (Alumno e : listaAlumnos) {
			System.out.print("(" + e.getNombre() + ", " + e.getNota() + ")   ");
		}
		
		
		listaAlumnos.remove(a2); //Eliminamos a Pedro
		listaAlumnos.remove(a2); //Si intento borrar por segunda vez el mismo objeto, ya no lo encontrará y por tanto no hará nada

		listaAlumnos.remove(a4); //Eliminamos a Felisa
		
		System.out.println("\n\nNúmero de elementos después de la eliminación: " + listaAlumnos.size() ) ;
		System.out.println("Son:");
		for (Alumno e : listaAlumnos) {
			System.out.print("(" + e.getNombre() + ", " + e.getNota() + ")   ");
		}
	}

}
