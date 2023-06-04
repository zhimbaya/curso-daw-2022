
import java.util.Scanner;

/*
 * TareaUT03-2
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

    int consulta_Edad(){
        return edad;
    }

    void cambia_Edad(int e){
        edad=e;
    }

    float consulta_Altura(){
        return altura;
    }

    void cambia_Altura(float alt){
        altura=alt;
    }
  
    public static void main(String[] args) {

        // Creamos objeto persona
        Persona persona=new Persona();

        // Creamos objeto teclado
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables
        String nom,n;
        int ed,e;
        float alt,a;

        // Entrada de datos
        System.out.println("Introduce el nombre de la persona: ");
        nom=teclado.nextLine();

        System.out.println("Introduce la edad de la persona: ");
        ed=teclado.nextInt();

        System.out.println("Introduce la altura de la persona: ");
        alt=teclado.nextFloat();

        // Modificacion de datos
        persona.cambia_Nombre(nom);
        persona.cambia_Edad(ed);
        persona.cambia_Altura(alt);

        // Salida de datos
        n=persona.consulta_Nombre();
        e=persona.consulta_Edad();
        a=persona.consulta_Altura();

        System.out.println("El nombre de la persona es: " + n);
        System.out.println("La edad de la persona es: " + e);
        System.out.println("La altura de la persona es: " + a);
    }
}
