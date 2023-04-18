import java.io.*;

public class MostrarListaTfnosSerializable
{
	public static void main (String [] args)
	{
		try
		{
			if(args.length != 1)
				throw new ArgumentosIncorrectos();			
				else
				{
					File fichero = new File(args[0]);
					
					if(fichero.exists())
						mostrarFichero(fichero);
						else
							throw new FileNotFoundException();
				}
		}
		
		catch(ArgumentosIncorrectos error)
		{
			System.out.println("El Numero de Argumentos es Incorrecto");
			System.out.println("Sintaxis: java MostrarListaTfnos nomFichero");
		}
		
		catch(FileNotFoundException error)
		{
			System.out.println("El Fichero " + args[0] + " No Existe");
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void mostrarFichero(File fichero)
	{
		ObjectInputStream ois = null;
		
		try
		{
			ois = new ObjectInputStream(new FileInputStream(fichero));
			
			do
			{
				Persona persona = (Persona)ois.readObject(); //Hemos de usar un cast para la compatibilidad de tipos
				System.out.println("Nombre: " + persona.getNombre());
				System.out.println("Direccion: " + persona.getDireccion());
				System.out.println("Telefono: " + persona.getTelefono());
			}while(true);
		}
		
		catch(EOFException error)
		{
			System.out.println("Hemos LLegado al Fin del Fichero");
		}
		
		catch(IOException error)
		{
			System.out.println("Error de Entrada/Salida");
		}
		
		catch(ClassNotFoundException error)
		{
			System.out.println("Clase No Encontrada");
		}
		
		
		finally
		{
			try
			{
				if(ois != null)
					ois.close();
			}
			
			catch(IOException error)
			{
				System.out.println("Error al Cerrar el Flujo de Lectura");
			}
		}
	}
}

class ArgumentosIncorrectos extends Exception
{
	public ArgumentosIncorrectos()
	{
		super();
	}
}