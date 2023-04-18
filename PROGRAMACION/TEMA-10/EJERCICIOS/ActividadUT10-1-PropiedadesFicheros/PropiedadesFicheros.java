import java.io.*;
import java.lang.*;

public class PropiedadesFicheros
{
	public static void main(String [] args)
	{
		try
		{
			if(args.length < 1)
				throw new ArgumentosIncorrectos();
			 	
			 	else
			 	{
			 		for(int i = 0; i < args.length; i++)
			 		{
			 			File fichero = new File(args[i]);
			 		
			 			if(!fichero.exists())
			 			throw new FicheroInexistente();
			 			
			 			else
			 			{
			 				propiedades(fichero);
			 			}
			 		
			 		}
			 	}
		}
		
		////////////////////////////////////////////////////////////////////////
		
		catch(ArgumentosIncorrectos error)
		{
			System.out.println("El Numero de Argumentos es Incorrecto");
		}
		
		catch(FicheroInexistente error)
		{
			System.out.println("El Fichero no Existe");
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void propiedades(File fichero)
	{
		
			if(fichero.isFile())
			{
				System.out.println("El Nombre del Fichero es: " + fichero.getName());
				System.out.println("La Ruta Absoluta del Fichero es: " + fichero.getAbsolutePath());
				System.out.println("La Ruta Relativa del Fichero es: " + fichero.getPath());
			
				if(fichero.canRead())
					System.out.println("El Fichero se Puede Leer");
					else
						System.out.println("El Fichero No se Puede Leer");
					
				if(fichero.canWrite())
					System.out.println("El Fichero se Puede Escribir");
					else
						System.out.println("El Fichero No se Puede Escribir");
			}
			else
			{
				if(fichero.isDirectory())
				{
					String nomFicheros[] = fichero.list();
					for(int i = 0; i < nomFicheros.length; i++)
						System.out.println(nomFicheros[i]);	
				}
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