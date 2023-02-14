import java.util.Scanner;

public class ConteoAbecedario {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayCont[];
		int tamAbc = 'z' - 'a' + 1;
		arrayCont = new int[tamAbc];
		
		inicializarArray( arrayCont );
		contadorLetras( arrayCont );
	}
	
	public static void inicializarArray( int arrayCont[] )
	{
		/* no hace falta inicializar el contador a 0 porque al crear el array
		 inicializa todas las posiciones  a 0, pero se haria: */
			
		int i;
		for( i = 0; i < arrayCont.length; i++ )
			arrayCont[i] = 0;
	}
	
	
	public static void contadorLetras(int arrayCont[]) 
	{
		Scanner sc = new Scanner(System.in);
		int numVocales = 0;
		System.out.println("Introduzca cadena:");
        String cad = sc.nextLine(); //leemos la cadena a analizar
     
        char car;
		
        for (int i = 0; i < cad.length(); i++) //Recorremos los caracteres de la cadena
		{
        	car=cad.charAt(i);
			car = Character.toLowerCase( car ); //Uniformizamos ya que el enunciado nos dice que no debe ser case sensitive
			if( car >= 'a' && car <= 'z' )
				arrayCont[car - 'a']++;
			
		}
			
		for( char letra = 'a'; letra <= 'z'; letra++ )
			System.out.print( letra + " " );
			
		
		System.out.println("\n\n");	
			
			
		for(int i = 0; i < arrayCont.length; i++ )
			System.out.print( arrayCont[i]  + " ");
	}
	
		
        
        
	
}
