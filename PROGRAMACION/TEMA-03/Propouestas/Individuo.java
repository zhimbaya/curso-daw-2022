package Tema04;

public class Individuo {

    /*
	 * 2. Actividad UT03-2: Atributos de clase. Población.
	 * 
	 * Crear una clase Individuo con atributos DNI (de tipo cadena), nombre y otro
	 * relativo al año de nacimiento (de tipo numérico).
     */
    private NIF dni;
    private String nombre;
    private int anioNacimiento;
    private static long contadorIndividuos = 0;

    /*
	 * Incorpora un constructor general que reciba como parámetros los 3 atributos
	 * anteriores. Incorporar métodos getter() y setter() a través de la utilidad
	 * que tendrán los IDE´s como Eclipse o Netbeans para automatizar dicho proceso
	 * (investiga para ver cómo hacerlo).
     */
    public Individuo(String nombre, int anioNacimiento) {
        super();
        dni = generaDNI();
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        contadorIndividuos++;
    }

    public NIF getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    /*
	 * Incorporar un atributo estático o de clase que controle la población
	 * (cantidad de individuos) y que llamaremos poblacion.
     */
    public static long poblacion() {
        return contadorIndividuos;
    }

    /*
	 * Posteriormente, en el método principal, instanciaremos una serie de elementos
	 * Individuo, comprobando que el valor del atributo de clase poblacion se
	 * actualiza, efectivamente, con el número de individuos instanciados.
     */
    public static NIF generaDNI() {
        int numero = (int) (Math.random() * 100000000);
        NIF nif = new NIF(numero);
        return nif;
    }

    @Override
    public String toString() {
        return "Individuo [DNI=" + dni + ", nombre=" + nombre + ", anioNacimiento=" + anioNacimiento + "]";
    }

}
