
import java.util.Scanner;

/*
 * Tarea UT03-1
 * Proyecto Persona
 */


public class Persona {

    String nombre;
    int edad;
    float altura;

    public String consulta_Nombre(){
        return nombre;
    }

    public void cambia_Nombre(String n){
        nombre=n;
    }
  
    public static void main(String[] args) {

        // Creamos objeto persona
        Persona persona=new Persona();

        // Creamos objeto teclado
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Introduce el nombre de la persona: ");
        String nom=teclado.nextLine();

        // Modificacion de datos
        persona.cambia_Nombre(nom);

        // Salida de datos
        System.out.println("El nombre de la persona es: " + nom);
    }
}
