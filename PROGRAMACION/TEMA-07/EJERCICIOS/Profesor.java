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
public class Profesor extends Persona {

    String especialidad;
    double salario;

    // Método getEspecialidad
    public String getEspecialidad() {
        return especialidad;
    }
    // Método getSalario

    public double getSalario() {
        return salario;
    }
    // Método setSalario

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Método setESpecialidad

    public void setESpecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String getNombre() {
        return "Profesor: " + this.nombre;
    }

    public void mostrar() {
        super.mostrar(); // Llamada al método “mostrar” de la superclase
        // A continuación mostramos la información “especializada” de esta subclase 
        System.out.printf("Especialidad: %s\n", this.especialidad);
        System.out.printf("Salario: %7.2f euros\n", this.salario);
    }

    public Profesor(String nombre, String apellidos, GregorianCalendar fechaNacim, String especialidad, double salario) {
        super(nombre, apellidos, fechaNacim);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    @Override
    protected void mostrar2() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String stringFecha = formatoFecha.format(this.fechaNacim.getTime());
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringFecha);
        System.out.printf("Especialidad: %s\n", this.especialidad);
        System.out.printf("Salario: %7.2f euros\n", this.salario);
    }
    
    @Override
    public Hashtable devolverContenidoHashtable(){
        Hashtable contenido = super.devolverContenidoHashtable();
        contenido.put("especialidad", this.especialidad);
        contenido.put("salario", this.salario);
        return contenido;
    }
    
    @Override
    public ArrayList devolverContenidoArrayList(){
        ArrayList contenido = super.devolverContenidoArrayList();
        contenido.add(this.especialidad);
        contenido.add(this.salario);
        return contenido;
    }
    
    @Override
    public String devolverContenidoString(){
        String contenido = super.devolverContenidoString();
        return contenido;
    }

}
