/*4)Escribe un programa denominado LeerFicheroTexto  que se ejecute de la siguiente forma: 
 C> java LeerFicheroTexto  texto.txt.
El  programa deberá controlar que el número de parámetros pasados a main es correcto, 
manejará excepciones de tipo IOException, 
si el número de argumentos es correcto, 
	invocará a un método denominado mostrarFichero, 
	donde se llevará a cabo la visualización del fichero de texto. 
Si el número de parámetros no es correcto 
	lanzará una excepción propia indicando que los parámetros son incorrectos 
	y la sintaxis correcta para ejecutar el programa. 
La información se procesará carácter a carácter.*/

import java.io.*;
import java.lang.*;

public class LeerFicheroTexto
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			if(args.length != 1)
				throw new ArgumentosIncorrectos();
				
				else
				{
						mostrarFichero(args[0]);
				}
		}
		
		////////////////////////////////////////////////////////////////////////
		
		catch(ArgumentosIncorrectos error)
		{
			System.out.println("El Numero de Argumentos es Incorrecto");
			System.out.println("Sintaxis: java CrearFicheroTexto nomFichero");
		}
		
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void mostrarFichero(String nomFichero) throws IOException
	{
		File fichero = new File(nomFichero);
		FileReader flujoEntrada = null;
		
		try
		{
			if(fichero.exists())
			{
				flujoEntrada = new FileReader(fichero);
				char caracter;
        		char eof =(char) -1;
        		while ((caracter = (char)flujoEntrada.read()) != eof)
            		System.out.print(caracter);
			}
			else
				throw new FicheroInexistente();
		}
		
		catch(FicheroInexistente error)
		{
			System.out.println("El Fichero No Existe");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////

class ArgumentosIncorrectos extends Exception
{
	public ArgumentosIncorrectos()
	{
		super();
	}
}

class FicheroInexistente extends Exception
{
	public FicheroInexistente()
	{
		super();
	}
}
