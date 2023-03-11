/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author diego
 */
public class Alumno extends Persona {

    protected String grupo;
    protected double notaMedia;

    // Método getGrupo
    public String getGrupo() {
        return grupo;
    }
    // Método getNotaMedia

    public double getNotaMedia() {
        return notaMedia;
    }

    // Método setGrupo
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    // Método setNotaMedia
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String getNombre() {
        return "Alumno: " + this.nombre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        // A continuación mostramos la información “especializada” de esta subclase 
        System.out.printf("Grupo: %s\n", this.grupo);
        System.out.printf("Nota media: %5.2f\n", this.notaMedia);
    }

    public Alumno(String nombre, String apellidos, GregorianCalendar fechaNacim, String grupo, double notaMedia) {
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public void mostrar2() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String stringFecha = formatoFecha.format(this.fechaNacim.getTime());
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringFecha);
        System.out.printf("Grupo: %s\n", this.grupo);
        System.out.printf("Nota media: %s\n", this.notaMedia);

    }

    // Método devolverContenidoHashtable 
    @Override
    public Hashtable devolverContenidoHashtable() {
        // Llamada al método de la superclase
        Hashtable contenido = super.devolverContenidoHashtable();
        // Añadimos los atributos especí!cos
        contenido.put("grupo", this.grupo);
        contenido.put("notaMedia", this.notaMedia);
        // Devolvemos la Hashtable rellena
        return contenido;
    }

    // Método devolverContenidoArray
    @Override
    public ArrayList devolverContenidoArrayList() {
        // Llamada al método de la superclase
        ArrayList contenido = super.devolverContenidoArrayList();
        // Añadimos los atributos especí!cos 
        contenido.add(this.grupo);
        contenido.add(this.notaMedia);
        // Devolvemos el ArrayList relleno
        return contenido;
    }

    // Método devolverContenidoString @Override
    public String devolverContenidoString() {
        // Aprovechamos el método estático para transformar una Hashtable en String
        String contenido = Persona.HashtableToString(this.devolverContenidoHashtable());
        // Devolvemos el String creado.
        return contenido;
    }

}
