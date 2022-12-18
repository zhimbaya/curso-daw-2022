package propuesta01;

public class ClaseRelacional {
	/*
	 * 3. Actividad UT03-3: Clase Racional.
	 * 
	 * Comprueba que la clase siguiente funciona correctamente. Sin embargo, es
	 * mejorable en su diseño: no dispone de un constructor explícito, el método
	 * main está codificado en el mismo fichero fuente, no se especifican
	 * modificadores de acceso a los miembros de la clase, etc.. Modifica la
	 * aplicación subsanando los inconvenientes antes indicados.
	 */
	
	private int numerador;
	private int denominador;
	
	public ClaseRelacional(){
	}
	
	public ClaseRelacional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public void asignarDatos(int num, int den){

		numerador = num;
		if (den == 0)
			den = 1; // el denominador no puede ser cero
		denominador = den;
	}

	public void visualizarRacional(){
		System.out.println(numerador + "/" + denominador);
	}


}
