public class Persona {
	String nombre;
	String apellidos;
	int aņoNacimiento;
	
	public Persona(){
	}
	
	public Persona(String nombre, String apellidos, int aņoNacimiento){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.aņoNacimiento=aņoNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", aņo de nacimiento=" + aņoNacimiento + "]";
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

	public int getAņoNacimiento() {
		return aņoNacimiento;
	}

	public void setAņoNacimiento(int aņoNacimiento) {
		this.aņoNacimiento = aņoNacimiento;
	}
	
	
	
}
