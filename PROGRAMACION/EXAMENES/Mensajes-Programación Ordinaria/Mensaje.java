/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordinario1819;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Mensaje implements Serializable{
    
    protected int codigo;
    protected String texto;
    
    public Mensaje(int c, String t)
    {
        codigo = c;
        texto = t;
    }
    
    @Override
    public String toString()
    {
        return codigo+" "+texto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
