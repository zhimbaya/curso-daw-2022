
package ejercicio0213;

import java.util.Scanner;

public class Ejercicio0213 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el año");
        int anio = sc.nextInt();
        if (anio%4==0 && !(anio%100==0 && anio%400!=0))
            System.out.println("El año "+anio+" es bisiesto");
        else
            System.out.println("El año "+anio+" no es bisiesto");
    }
    
}
