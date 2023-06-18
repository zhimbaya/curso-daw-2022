package Tema07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author diego
 */
public abstract class _01Persona implements _01Imprimible {

    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNacim;
// Método getNombre

    public String getNombre() {
        return nombre;
    }
// Método getApellidos

    public String getApellidos() {
        return apellidos;
    }
// Método getFechaNacim

    public GregorianCalendar getFechaNacim() {
        return this.fechaNacim;
    }
// Método setNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
// Método setApellidos

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
// Método setFechaNacim

    public void setFechaNacim(GregorianCalendar fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public void mostrar() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String Stringfecha = formatoFecha.format(this.fechaNacim.getTime());
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", Stringfecha);
    }

    public _01Persona(String nombre, String apellidos, GregorianCalendar fechaNacim) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNacim;
        //this.fechaNacim= new GregorianCalendar (fechaNacim);
    }

    // Método abstracto
    protected abstract void mostrar2();

    // Método devolverContenidoString
    @Override
    public String devolverContenidoString() {
        String contenido = _01Persona.HashtableToString(this.devolverContenidoHashtable());
        return contenido;
    }

    // Método devolverContenidoHashtable
    @Override
    public Hashtable devolverContenidoHashtable() {
        // Creamos la Hashtable que va a ser devuelta 
        Hashtable contenido = new Hashtable();
        // Añadimos los atributos especí!cos
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String stringFecha = formatoFecha.format(this.fechaNacim.getTime());
        contenido.put("nombre", this.nombre);
        contenido.put("apellidos", this.apellidos);
        contenido.put("fechaNacim", stringFecha);
        // Devolvemos la Hashtable
        return contenido;
    }

    // Método devolverContenidoArrayList
    @Override
    public ArrayList devolverContenidoArrayList() {
        ArrayList contenido = new ArrayList();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String stringFecha = formatoFecha.format(this.fechaNacim.getTime());
        contenido.add(this.nombre);
        contenido.add(this.apellidos);
        contenido.add(stringFecha);
        return contenido;
    }

    // Método HashtableToString
    protected static String HashtableToString(Hashtable tabla) {
        String contenido;
        String clave;
        Enumeration claves = tabla.keys();
        contenido = "{";
        if (claves.hasMoreElements()) {
            clave = claves.nextElement().toString();
            contenido = contenido + clave + "=" + tabla.get(clave).toString();
        }
        while (claves.hasMoreElements()) {
            clave = claves.nextElement().toString();
            contenido += ",";
            contenido = contenido.concat(clave);
            contenido = contenido.concat("=" + tabla.get(clave));
        }
        contenido = contenido + "}";
        return contenido;
    }
}
