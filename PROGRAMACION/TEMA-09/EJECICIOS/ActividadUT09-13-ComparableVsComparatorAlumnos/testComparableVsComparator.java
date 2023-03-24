import java.util.ArrayList;
import java.util.Collections;

public class testComparableVsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

	    listaAlumnos.add(new Alumno(1,"Rosa", 1));
	    listaAlumnos.add(new Alumno(2,"Pedro", 5));
	    listaAlumnos.add(new Alumno(3,"Marina", 7));
	    listaAlumnos.add(new Alumno(4,"Noelia", 10));
	    listaAlumnos.add(new Alumno(5,"Jose antonio", 7));
	    listaAlumnos.add(new Alumno(6,"Sonia", 6));

	    System.out.println("Alumnos según se han introducido: \n");
	    for(Alumno p: listaAlumnos){
	    	System.out.println(p.toString());
	    }
	    
	    System.out.println("========================================");
	    
        Collections.sort(listaAlumnos);  // Ejemplo uso ordenación natural

        System.out.println("\nInterfaz Comparable: Alumnos ordenados por orden natural(el criterio en Comparable es el nombre de forma creciente): \n");
	    for(Alumno p: listaAlumnos){
	    	System.out.println(p.toString());
	    }
	    
	    System.out.println("========================================");

	    Collections.sort(listaAlumnos, new OrdenarAlumnoPorNotaCreciente());
	    System.out.println("\nInterfaz Comparator: Alumnos ordenados por orden total (mediante la nota: creciente): \n");
	    for(Alumno p: listaAlumnos){
	    	System.out.println(p.toString());
	    }
	    
	    System.out.println("========================================");

	    Collections.sort(listaAlumnos, new OrdenarAlumnoPorNotaDecreciente());
	    System.out.println("\nInterfaz Comparator: Alumnos ordenados por orden total (mediante la nota: decreciente): \n");
	    for(Alumno p: listaAlumnos){
	    	System.out.println(p.toString());
	    }
	    
	    System.out.println("========================================");

	    Collections.sort(listaAlumnos, new OrdenarAlumnoPorNombreCreciente());
	    System.out.println("\nInterfaz Comparator: Alumnos ordenados por orden total (mediante el nombre: creciente): \n");
	    for(Alumno p: listaAlumnos){
	    	System.out.println(p.toString());
	    }

	    System.out.println("========================================");

	    Collections.sort(listaAlumnos, new OrdenarAlumnoPorNombreDecreciente());
	    System.out.println("\nInterfaz Comparator: Alumnos ordenados por orden total (mediante el nombre: decreciente ): \n");
	    for(Alumno p: listaAlumnos){
	    	System.out.println(p.toString());
	    }

	}

}
