
public class Alumno implements Comparable<Alumno> {
	private int idAlumno;
    private String nombre;
    private int nota;

    public Alumno (int idPersona, String nombre, int nota) {
        this.idAlumno = idPersona;
        this.nombre = nombre;
        this.nota = nota;}

    @Override
    public String toString() {
        return "Alumno --> Id: "+idAlumno+" --- Nombre: "+nombre+" --- Nota: "+nota +"\n";}

    @Override
    public int compareTo(Alumno o) { //Solo admitirá un criterio de ordenación. En este caso hemos elegido por nombre
        return this.nombre.compareTo(o.nombre); //Ordenará alfabéticamente de menor a mayor con respecto al nombre
    }

    public int getIdPersona() {
    	return idAlumno;
	}
    public String getNombre() {
    	return nombre;
	}
    public int getNota() {
    	return nota;
	}

}
