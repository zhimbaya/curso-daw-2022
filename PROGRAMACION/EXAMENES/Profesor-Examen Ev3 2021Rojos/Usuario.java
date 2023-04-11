/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera2021rojos;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Usuario implements Serializable {
    
    protected String dni;
    protected String nombre;
    protected String pass;
    
    public Usuario(String d, String n, String p)
    {
        dni = d;
        nombre = n;
        pass = p;
    }

    public String getDni() {
        return dni;
    }

    public String getPass() {
        return pass;
    }
    
    public abstract void mostrarTrabajo();
    
    @Override
    public String toString()
    {
        return dni+"\t"+nombre;
    }
    
}
