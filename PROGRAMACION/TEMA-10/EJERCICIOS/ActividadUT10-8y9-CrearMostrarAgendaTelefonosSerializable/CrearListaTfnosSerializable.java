import java.io.*;
import java.lang.*;

public class CrearListaTfnosSerializable
{
	public static void main(String args[])
	{	
		System.out.println("Introduce el Nombre del Fichero");
		String nomFichero = Leer.dato(); //De manera alternativa usar clase Scanner para leer
		
		char respuesta = 's';
		
		File fichero = new File(nomFichero);
		
		if(fichero.exists())
		{
			System.out.print("El Fichero Ya Existe. Deseas Sobreescribirlo?(S/N): ");
			respuesta = getRespuesta();
		}
		
		if(respuesta == 's')
			crearFichero(fichero);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static char getRespuesta() 
	{
		char respuesta = 's';
		boolean respuestaValida;
		
		do
		{
			try
			{
				respuesta = (char)System.in.read();
				System.in.skip(2);
			}
				
			catch(IOException error)
			{
				System.out.println("Error al Leer desde el Teclado");
			}
				
			respuesta = Character.toLowerCase(respuesta);
			respuestaValida = ( respuesta == 's' || respuesta == 'n' );
			if(!respuestaValida)
				System.out.println("La Respuesta No es Valida");
		}while(!respuestaValida);
		
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void crearFichero(File fichero)
	{
		char respuesta;
		//Crea un Flujo hacia el Fichero que Permita Escribir Datos en el Fichero
		ObjectOutputStream oos = null;
		
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(fichero));
			do
			{
				System.out.println("Introduce un Nombre");
			    String nombre = Leer.dato(); //De manera alternativa usar clase Scanner para leer
				System.out.println("Introduce la Direccion");
				String direccion = Leer.dato(); //De manera alternativa usar clase Scanner para leer
				System.out.println("Introduce el Telefono");
				String telefono = Leer.dato(); //De manera alternativa usar clase Scanner para leer
				
				Persona persona = new Persona(nombre,direccion,telefono);
				oos.writeObject(persona);
			
				System.out.print("Deseas Escribir mas Datos?");
				respuesta = getRespuesta();
			
			}while(respuesta == 's');
			
			//Guardamos la Informacion en el Fichero
			oos.close();
		}//Fin Try
	
		catch(IOException error)
		{
			System.out.println("Error al Crear el Flujo o al Leer");
		}
	}
}