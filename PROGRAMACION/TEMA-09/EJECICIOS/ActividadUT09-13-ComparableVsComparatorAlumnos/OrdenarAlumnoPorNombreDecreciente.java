import java.util.Comparator;

public class OrdenarAlumnoPorNombreDecreciente implements Comparator<Alumno> {

	@Override
	public int compare(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p2.getNombre().compareTo(p1.getNombre());
	}

}
