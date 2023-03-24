import java.util.Comparator;

public class OrdenarAlumnoPorNotaDecreciente implements Comparator<Alumno> {

	@Override
	public int compare(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p2.getNota()-p1.getNota();
	}

}
