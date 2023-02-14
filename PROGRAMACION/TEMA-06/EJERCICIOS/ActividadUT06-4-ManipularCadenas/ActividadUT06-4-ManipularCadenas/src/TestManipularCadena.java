import java.io.*;
import java.lang.*;

public class TestManipularCadena
{
	public static void main(String args[]) throws IOException
	{
		ManipularCadena cadena = new ManipularCadena(50);
		
		cadena.leerCadena();
		
		System.out.print("\nLa Cadena es: ");
		cadena.escribirCadena();
		
		ManipularCadena copia = new ManipularCadena(cadena);
		System.out.print("\nLa Copia de la Cadena: ");
		copia.escribirCadena();
		
		ManipularCadena cadena2 = new ManipularCadena(50);
		cadena2.copiar(cadena);
		System.out.print(" \n\nLa Cadena Copiada es: ");
		cadena2.escribirCadena();
		
		System.out.println("\n\nLa Longitud de la Cadena es de: " + cadena.longitud() + " caracteres");
		
		if(cadena.esVocal('m'))
			System.out.println("\nEs una Vocal");
			else
				System.out.println("\nNo es una Vocal");
				
		if(cadena.esPalindromo())
			System.out.println("\nEs Palindromo");
			else
				System.out.println("\nNo Es Palindromo");
				
		cadena2.convertirAmayusculas();
		System.out.print("\nLa Cadena convertida a Mayusculas es: ");
		cadena2.escribirCadena();
				
		cadena2.eliminarVocales();
		System.out.print("\n\nLa Cadena Copia sin Vocales es: ");
		cadena2.escribirCadena();

		ManipularCadena cadena3 = new ManipularCadena(50);
		cadena3.copiar(cadena); 		
		cadena3.eliminarEspacios();
		System.out.print("\nLa Cadena sin Espacios es: ");
		cadena3.escribirCadena();
		
		/*System.out.println("\n");
		Cadena cadena4 = new Cadena(50);
		cadena4.leerCadena();
		if(cadena.contieneCadena(cadena4))
			System.out.println("\nSi");
			else
				System.out.println("\nNo");*/
	}
}