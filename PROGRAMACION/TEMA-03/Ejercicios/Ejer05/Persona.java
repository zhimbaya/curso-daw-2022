/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0405;

public class Persona {

	private String nombre;
	private int edad;
	private NIF nif;
	private char sexo;
	private double peso;
	private double altura;
	private static int numero_personas = 0;

	private static final char SEXO_POR_DEFECTO = 'H';

	// Constructores
	public Persona() {
		nombre = "";
		edad = 0;
		nif = generaDNI();
		sexo = SEXO_POR_DEFECTO;
		peso = 0;
		altura = 0;
		numero_personas++;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		nif = generaDNI();
		this.sexo = comprobarSexo(sexo);
		peso = 0;
		altura = 0;
		numero_personas++;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		nif = generaDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		numero_personas++;
	}

	// Métodos
	public int calcularIMC() {
		final double MIN = 18.5;
		final double MAX = 24.9;
		double imc = peso / (altura * altura);
		if (imc < MIN)
			return -1;
		else if (imc > MAX)
			return 1;
		else
			return 0;
	}

	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

	private char comprobarSexo(char s) {
		if (s == 'H' || s == 'M')
			return s;
		else
			return SEXO_POR_DEFECTO;
	}
	
	public static NIF generaDNI() {
		int numero = (int) (Math.random() * 100000000);
		NIF nif = new NIF(numero);
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public NIF getNif() {
		return nif;
	}

	public static int getNumPersonas() {
		return numero_personas;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nNIF: " + nif + "\nSexo: " + sexo + "\nPeso: " + peso
				+ "\nAltura: " + altura;
	}

}
