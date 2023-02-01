package Banco;

import java.util.Scanner;

public class CuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Diseña una clase denominada CuentaBancaria con los siguientes datos:
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
		Cuenta cuenta1 = new Cuenta();
		Scanner sc = new Scanner(System.in);
		String titular, numero;
		double tipo, importe;

		System.out.print("Titular : ");
		titular = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();

		cuenta1.setTitular(titular);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);

		Cuenta cuenta2 = new Cuenta("Diego Armando Simbaña", "12345678901234567890", 0);

		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getTitular());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo €: " + cuenta1.getSaldo());
		System.out.println();

		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getTitular());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo €: " + cuenta2.getSaldo());
		System.out.println();

		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		// System.out.println("Saco €: " + cuenta2.reintegro(500));
		if (cuenta2.reintegro(500) == false) {
			System.out.println("No hay suficiente dinero!!");

		} else {
			System.out.println("Se puede retirar dinero de la cuenta.");
		}
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println("Ingreso €: " + cuenta2.ingreso(100));
		System.out.println("Total €: " + cuenta2.getSaldo());
		System.out.println();
	}

}
