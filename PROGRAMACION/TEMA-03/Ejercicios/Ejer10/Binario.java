/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0410;

public class Binario {

	private long valor;

	public Binario() {

	}

	public Binario(long n) {
		valor = n;
	}

	public Binario(int n) {
		valor = toBinario(n);
	}

	public long toBinario(int n) {
		if (n < 2) {
			return n;
		} else {
			long m = toBinario(n/2);
			long j = m *10;
			return j + (n % 2);
		}
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;

	}

	public int toDecimal() {
		long n = valor;
		int nDec = 0;
		int pos = 0;
		while (n > 0) {
			nDec = nDec + (int) (n % 10) * (int) Math.pow(2, pos);
			pos++;
			n = n / 10;
		}
		return nDec;
	}

	public static boolean esValido(long n) {
		if (n == 0 || n == 1) {
			return true;
		} else {
			int ultima = (int) n % 10;

			return (ultima == 0 || ultima == 1) && esValido(n / 10);

		}
	}

	public boolean esValido() {
		return esValido(valor);
	}

}
