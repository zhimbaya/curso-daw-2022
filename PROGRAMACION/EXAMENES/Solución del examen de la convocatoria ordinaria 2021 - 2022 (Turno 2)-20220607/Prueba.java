/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donmarciano;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Prueba implements Serializable{
    protected String fecha;
    
    public Prueba(String fecha)
    {
        this.fecha = fecha;
    }
    
    public String getFecha()
    {
        return fecha;
    }
    
}
