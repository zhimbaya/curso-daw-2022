/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendientes2022;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public class CodigoPostal implements Serializable{
    
    private String cp;
    
    public CodigoPostal(String cp) throws CPException
    {
        if (esValido(cp))
            this.cp = cp;
        else
            throw new CPException();
        
    }
    
    public  static boolean esValido(String cp)
    {
        if (cp.length()!=5) return false;
        try
        {
            int numero = Integer.valueOf(cp);
            if (numero>=0 && numero<=99999)
                return true;
            else
                return false;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    public String getCodigoPostal()
    {
        return cp;
    }
    
}
