package cuentas;

/**
 * Clase para ingresar datos de usuario a la cuenta.
 * @author diego
 * @version 1.0
 * @since 25/05/2023
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	
	/**
	 * Constructor vacio
	 */
	public CCuenta() {
	}

	/**
	 * @param nom nombre
	 * @param cue cuenta
	 * @param sal salario
	 * @param tipo tipo
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * @return el salado
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * @param cantidad introduce cantidad
	 * @throws Exception a la cantidad
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * @param cantidad introduce cantidad
	 * @throws Exception a la cantidad
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre introduce el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta introduce la cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return el saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo introduce el saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return el tipo
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés introduce el tipo
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
