/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carniceriamanolo;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Usuario implements Serializable{
    
    protected String user;
    protected String pass;
    
    public Usuario(String u, String p)
    {
        user = u;
        pass = p;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    
    
}
