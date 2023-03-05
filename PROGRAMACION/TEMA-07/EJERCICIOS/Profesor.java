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
public class Profesor extends Alumno {

    String especialidad;
    double salario;
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
// Método getEspecialidad

    public String getEspecialidad() {
        return especialidad;
    }
// Método getSalario

    public double getSalario() {
        return salario;
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
// Método setSalario

    public void setSalario(double salario) {
        this.salario = salario;
    }
// Método setESpecialidad

    public void setESpecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
