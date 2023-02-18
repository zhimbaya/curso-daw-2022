import java.util.Scanner;

public class ContarVocales {
		/*
		Crear un clase que tenga un m�todo principal que incorpore el 
		conteo del n�mero de vocales de una cadena de texto introducida 
		por teclado. Tener en cuenta que debe considerar tanto may�sculas 
		como min�sculas, as� como sus variantes con tilde.
		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numVocales = 0;
		System.out.println("Introduzca cadena:");
        String cad = sc.nextLine(); //leemos la cadena a analizar
        
        //Uniformizamos la cadena para cubrir min�sculas y may�sculas en una sola vez
        cad=cad.toLowerCase();
        
        //Recorremos toda la cadena
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(i); //tomamos el caracter en la posicion i
            //si el caracter es igual a "a", "e", "i", "o", � "u" entonces es vocal
            if (car == 'a' || car == 'e' || car ==  'i' || car == 'o' || car == 'u' ||
            		car == '�' || car == '�' || car ==  '�' || car == '�' || car == '�') {
                numVocales++; //incrementamos en 1 con cada aparici�n el n�mero de vocales
            }
        }
        //mostramos por pantalla cantidad de vocales
        System.out.println("La cadena tiene  "  + numVocales + " vocales.");
    }


}
