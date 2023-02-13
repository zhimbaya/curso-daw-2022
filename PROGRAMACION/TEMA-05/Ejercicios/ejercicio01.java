package Banco;

public class Cuenta {
	/*
	 * Diseña una clase denominada CuentaBancaria con los siguientes datos:
	 * 
	 *  
	 * 
	 * Miembros dato:
	 * 
	 * - Nombre del titular, número de cuenta, tipo de interés y saldo.
	 * 
	 *  
	 * 
	 * Miembros método u operaciones:
	 * 
	 * - Dos constructores, uno con argumentos y otro por defecto. El constructor
	 * con argumentos invocará a unos métodos set que asignen un contenido a cada
	 * miembro dato. En lugar de llamar a un método setSaldo es preferible que
	 * inicialicemos el saldo de la cuenta invocando a un método llamado ingreso que
	 * reciba la cantidad a ingresar y actualice el saldo anterior.
	 * 
	 * - Los métodos set y get correspondientes.
	 * 
	 * - Un método ingreso que actualice el saldo de la cuenta. La cantidad a
	 * ingresar tiene que ser mayor que 0.
	 * 
	 * - Un método reintegro que saque dinero de la cuenta. La cantidad a reintegrar
	 * tiene que ser mayor que 0. Comprobar que si la cantidad a sacar supera el
	 * saldo se imprimirá un mensaje de error.
	 * 
	 *  
	 * 
	 * Implementa la aplicación en dos ficheros fuente: uno para la clase
	 * CuentaBancaria, y otro, que contenga el método main, donde instanciaremos un
	 * objeto de tipo CuentaBancaria con un saldo inicial de 100 euros y le
	 * enviaremos los mensajes siguientes:
	 * 
	 * Obtener el saldo. Sacar 50 euros (reintegro). Ingresar 100 euros. Volver a
	 * obtener el saldo.
	 * 
	 * 
	 * Se deberá entregar dos ficheros .java SIN COMPRIMIR
	 */

	private String titular;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {
	}

	public Cuenta(String titular, String numeroCuenta, double tipoInteres) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = 100;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String cliente) {
		this.titular = cliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;                                                                         
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
	
}
