/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinario2021;

/**
 *
 * @author Profesor
 */
public abstract class Vacuna {

    protected String nombre;

    public Vacuna(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public String toString()
    {
        return nombre;
    }
    
}
