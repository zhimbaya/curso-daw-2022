import java.io.*;

public class ArrayCadenas
{
	public static void main(String args[])
 	{
 		//Instanciamos o Creamos el Array
 		String arrayCadenas1[] = {"Pepe", "Ana", "Carlos"};
 		String arrayCadenas2[] = {"Cristina", "Monica", "Jose"};
 		String arrayCadenas3[];
 		
 		System.out.println("---ARRAYS SIN ORDENAR---");
 		System.out.println("Array de Cadenas 1");
 		escribirArray(arrayCadenas1);
 		System.out.println("\nArray de Cadenas 2");
 		escribirArray(arrayCadenas2);
 		
 		ordenaBurbuja(arrayCadenas1);
 		ordenaBurbuja(arrayCadenas2);
 		
 		System.out.println("\n\n---ARRAYS ORDENADOS---");
 		System.out.println("Array de Cadenas 1");
 		escribirArray(arrayCadenas1);
 		System.out.println("\nArray de Cadenas 2");
 		escribirArray(arrayCadenas2);
 		
 		arrayCadenas3 = fusion(arrayCadenas1,arrayCadenas2);
 		
 		System.out.println("\n\n---ARRAYS FUSIONADOS---");
 		System.out.println("Array de Cadenas 3");
 		escribirArray(arrayCadenas3);
 		System.out.println();
 	}
 	
 	////////////////////////////////////////////////////////////////////////////
 	
 	public static void escribirArray(String array[])
	{
		for(int i = 0; i < array.length; i++)
			System.out.println("Array[" + i + "] = " + array[i]);
	}
 	
 	////////////////////////////////////////////////////////////////////////////
 	
 	public static void ordenaBurbuja(String array[])
 	{
 		boolean intercambio;
 		String aux;
 		
 		do
 		{
 			intercambio = false;
 			
 			for( int i = 0; i < array.length - 1; i++ )
 			{
 				if( array[i].compareTo( array[i+1] ) > 0 )
 				{
 					aux = array[i];
 					array[i] = array[i+1];
 					array[i+1] = aux;
 					intercambio = true;		
 				}
 			}
 			
 			
 		}while( intercambio );
 	}
 	
 	////////////////////////////////////////////////////////////////////////////
 	
 	public static String[] fusion(String arrayCadenas1[],String arrayCadenas2[])
 	{
 		int a = 0;
 		int b = 0;
 		int c = 0;
 		
 		String arrayCadenas3[] = new String[arrayCadenas1.length + arrayCadenas2.length];
 		
 		while(a < arrayCadenas1.length && b < arrayCadenas2.length)
 		{
 			if(arrayCadenas1[a].compareTo(arrayCadenas2[b]) < 0)
 			{
 				arrayCadenas3[c] = arrayCadenas1[a];
 				c++;
 				a++;
 			}
 			else
 			{
 				arrayCadenas3[c] = arrayCadenas2[b];
 				c++;
 				b++;
 			}
 		}
 		
 		while(a < arrayCadenas1.length)
 		{
 			arrayCadenas3[c] = arrayCadenas1[a];
 			c++;
 			a++; 
 		}
 		
 		while(b < arrayCadenas2.length)
 		{
 			arrayCadenas3[c] = arrayCadenas2[b];
 			c++;
 			b++;
 		}
 		
 		
 		return arrayCadenas3;
 	}
}