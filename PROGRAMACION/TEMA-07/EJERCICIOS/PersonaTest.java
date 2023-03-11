/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author diego
 */
public class PersonaTest {

    /**
     * Ejemplo de uso de clases abstractas y métodos abstractos
     */
    public static void main(String[] args) {
        // Declaración de objetos de las clases Persona, Profesor y Alumno Persona pers1, pers2;
        Alumno al1, al2;
        Profesor prof1, prof2;
        //pers1= new Persona (); // Error: una clase abstracta no puede ser instanciada

        al1 = new Alumno("Juan", "Torres", new GregorianCalendar(1990, 10, 6), "1DAM-B", 7.5);
        prof1 = new Profesor("Antonio", "Campos", new GregorianCalendar(1970, 8, 15), "Electricidad", 2000);

        // Llamada a métodos abstractos en la clase Persona
        // Pero heredados y definidos en las clases Profesor y en Alummno al1.mostrar();
        prof1.mostrar();
        al1.mostrar2();

        String stringContenidoAlumno, stringContenidoProfesor;
        Hashtable hashtableContenidoAlumno, hashtableContenidoProfesor;
        ArrayList listaContenidoAlumno, listaContenidoProfesor;
        // Creación de objetos alumno y profesor
        Alumno al3 = new Alumno("Juan", "Torres Mula", new GregorianCalendar(2023, 01, 6), "1DAM-B", 7.5);
        Profesor prof3 = new Profesor("Antonio", "Campos Pin", new GregorianCalendar(2023, 8, 15), "Informática", 2000);

        // Obtención del contenido del objeto alumno a través de los métodos del interfaz Imprimible
        stringContenidoAlumno = al3.devolverContenidoString();
        hashtableContenidoAlumno = al3.devolverContenidoHashtable();
        listaContenidoAlumno = al3.devolverContenidoArrayList();
        // Obtención del contenido del objeto profesor a través de los métodos del interfaz Imprimible
        stringContenidoProfesor = prof3.devolverContenidoString();
        hashtableContenidoProfesor = prof3.devolverContenidoHashtable();
        listaContenidoProfesor = prof3.devolverContenidoArrayList();

        // Impresión en pantalla del contenido del objeto alumno a través de las estructuras obtenidas
        System.out.printf("Contenido del objeto alumno: %s\n", stringContenidoAlumno);
        // Impresión en pantalla del contenido del objeto alumno a través de las estructuras obtenidas
        System.out.printf("Contenido del objeto profesor: %s\n", stringContenidoProfesor);
    }
}
