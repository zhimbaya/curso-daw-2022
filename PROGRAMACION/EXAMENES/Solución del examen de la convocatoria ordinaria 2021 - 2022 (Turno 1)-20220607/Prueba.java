/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centropsicologia;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Prueba implements Serializable{
    protected String codigo;
    
    public Prueba(String codigo)
    {
        this.codigo = codigo;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
    
}
