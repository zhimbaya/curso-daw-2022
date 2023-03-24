import java.util.Comparator;

public class OrdenarAlumnoPorNotaCreciente implements Comparator<Alumno> {

	@Override
	public int compare(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p1.getNota()-p2.getNota();
	}

}
