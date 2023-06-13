package Tema04;

import java.io.*;
public class SumaSeriePara
{
	public static void main(String args[]) throws IOException
	{
		//declaracion de variables
		int contador;
		int suma;
		final int incremento = 4;
		
		//inicializamos variable
		suma = 0;
		
		for (contador = 3; contador <= 1500; contador = contador + incremento)
		{
			suma = suma + contador;
		}//fin para
		
		System.out.println("La suma de la serie es: " + suma);
	}//fin main
}//fin class