/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

import java.util.GregorianCalendar;

/**
 *
 * @author diego
 */
public class Alumno extends Persona {

    protected String grupo;
    protected double notaMedia;
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
// Método getGrupo

    public String getGrupo() {
        return grupo;
    }
// Método getNotaMedia

    public double getNotaMedia() {
        return notaMedia;
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
// Método setGrupo

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
// Método setNotaMedia

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
