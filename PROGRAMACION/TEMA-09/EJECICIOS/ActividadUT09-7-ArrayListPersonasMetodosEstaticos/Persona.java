public class Persona {
	String nombre;
	String apellidos;
	int añoNacimiento;
	
	public Persona(){
	}
	
	public Persona(String nombre, String apellidos, int añoNacimiento){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.añoNacimiento=añoNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", año de nacimiento=" + añoNacimiento + "]";
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

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	
	
	
}
