package cuentas;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float cantidad = 2f;
		operar_cuenta(cantidad);
	}

	/**
	 * @param cantidad
	 */
	private static void operar_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es: " + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(1000);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}

		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es: " + saldoActual);
	}
}
