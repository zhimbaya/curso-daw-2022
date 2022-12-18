package propuesta01;

public class Circulo {
	/*
	 * 4. Actividad UT03-4: Clase Circulo.
	 * 
	 * Crea una clase denominada Circulo con los siguientes datos:
	 * 
	 *  
	 * 
	 * Miembros dato o atributos:
	 * 
	 * El radio.
	 */
	private long radio;

	/*
	 * Métodos:
	 * 
	 * Dos constructores, uno que reciba el radio como argumento; y otro, que por
	 * defecto le asigne al radio el valor 2.
	 */
	public Circulo() {
		this.radio = 2;
	}
	
	public Circulo(long radio) {
		this.radio = radio;
	}
	
	public long getRadio() {
		return radio;
	}

	public void setRadio(long radio) {
		this.radio = radio;
	}

	/*
	 * Un método de instancia u objeto denominado calcularSuperficie que devuelva el
	 * área del círculo. Sabemos que el área es igual a PI multiplicado por el radio
	 * al cuadrado. PI = 3.141592.
	 * 
	 */ 
	 public double calcularSuperficie() {
		 return Math.pow(radio, 2) * Math.PI;
	 }
	 /* 
	 * Construye otra clase denominada TestCirculo donde se arranque la aplicación.
	 * Crea un círculo de radio 10 llamado circulo1 y visualiza su área. A
	 * continuación, instancia otro círculo circulo2 cuyo radio sea el asignado por
	 * defecto y muestra igualmente su área.
	 */
	

}
