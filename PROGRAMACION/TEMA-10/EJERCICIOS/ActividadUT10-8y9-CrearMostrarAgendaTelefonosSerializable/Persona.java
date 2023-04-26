package Tema10;


import java.io.*;

public class Persona implements Serializable {
    //Miembros Dato

    private String nombre;
    private String direccion;
    private String telefono;

    //Constructores
    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Persona() {
    }

    //Metodos Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void serTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Metodos Get
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
