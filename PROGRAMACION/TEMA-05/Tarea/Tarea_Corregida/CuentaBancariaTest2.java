package Tema05;

class CuentaBancariaTest2
{
	public static void main(String args[])
	{
		CuentaBancaria2 cuenta = new CuentaBancaria2("1234521","Director Banco",100,0);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}