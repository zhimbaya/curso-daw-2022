//Nota: Adaptación de ejercicio de www.discoduroderoer.es/

import java.util.Locale;
import java.util.Scanner;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Para que escribamos el separador de los enteros con los decimales con ".". Si no lo ponemos tendremos que escribirlo con ","
                
        //Introducimos los datos de la primera persona
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Introduce el dni: ");
        String dni = sc.nextLine();
 
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
 
        System.out.println("Introduce el sexo: ");
        char sexo = sc.next().charAt(0);
 
        System.out.println("Introduce el peso (en kilogramos): ");
        double peso = sc.nextDouble();
 
        System.out.println("Introduce la altura (en metros): ");
        double altura = sc.nextDouble();
 
        //Creamos objetos con los diferentes constructores
        Persona persona1 = new Persona(); //Usamos constructor por defecto
        Persona persona2 = new Persona(nombre, dni, edad, sexo); //Usamos constructor que no incorpora peso ni altura
        Persona persona3 = new Persona(nombre, dni, edad, sexo, peso, altura); //Usamos constructor que incorpora todos los campos 
 
        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
 
        //Mostramos los datos
        System.out.println("=========================================");
        System.out.println("Persona1");
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
        
        System.out.println("=========================================");
        System.out.println("Persona2");
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
        
        System.out.println("=========================================");
        System.out.println("Persona3");
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }
 
    
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
 


}
