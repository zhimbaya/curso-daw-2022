
import java.util.Scanner;

/*
 * TareaUT03-4
 * Proyecto Persona
 */


public class Persona {

    String nombre;
    int edad;
    float altura;
    
    public Persona(String nombre, int edad, float altura) {
        this.nombre= nombre;
        this.edad=edad;
        this.altura=altura;
    }

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
        Persona persona=new Persona("Luisa Perez",22,1.70f);

      
        // Declaración de variables
        String n;
        int e;
        float a;

        // Salida de datos
        n=persona.consulta_Nombre();
        e=persona.consulta_Edad();
        a=persona.consulta_Altura();

        System.out.println("El nombre de la persona es: " + n);
        System.out.println("La edad de la persona es: " + e);
        System.out.println("La altura de la persona es: " + a);
    }
}
