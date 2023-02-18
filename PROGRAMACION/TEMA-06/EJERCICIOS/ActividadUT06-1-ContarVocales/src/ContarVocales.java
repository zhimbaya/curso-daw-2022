import java.util.Scanner;

public class ContarVocales {
		/*
		Crear un clase que tenga un método principal que incorpore el 
		conteo del número de vocales de una cadena de texto introducida 
		por teclado. Tener en cuenta que debe considerar tanto mayúsculas 
		como minúsculas, así como sus variantes con tilde.
		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numVocales = 0;
		System.out.println("Introduzca cadena:");
        String cad = sc.nextLine(); //leemos la cadena a analizar
        
        //Uniformizamos la cadena para cubrir minúsculas y mayúsculas en una sola vez
        cad=cad.toLowerCase();
        
        //Recorremos toda la cadena
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(i); //tomamos el caracter en la posicion i
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'a' || car == 'e' || car ==  'i' || car == 'o' || car == 'u' ||
            		car == 'á' || car == 'é' || car ==  'í' || car == 'ó' || car == 'ú') {
                numVocales++; //incrementamos en 1 con cada aparición el número de vocales
            }
        }
        //mostramos por pantalla cantidad de vocales
        System.out.println("La cadena tiene  "  + numVocales + " vocales.");
    }


}
