import java.util.Comparator;

public class OrdenarAlumnoPorNombreCreciente implements Comparator<Alumno> {

	@Override
	public int compare(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
