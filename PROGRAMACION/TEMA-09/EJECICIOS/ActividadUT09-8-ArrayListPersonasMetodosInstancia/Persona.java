public class Persona {
	String nombre;
	String apellidos;
	int a�oNacimiento;
	
	public Persona(){
	}
	
	public Persona(String nombre, String apellidos, int a�oNacimiento){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.a�oNacimiento=a�oNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", a�o de nacimiento=" + a�oNacimiento + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getA�oNacimiento() {
		return a�oNacimiento;
	}

	public void setA�oNacimiento(int a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}
	
	
	
}
