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
public abstract class Envio implements Serializable{
    
    protected int nEnvio;
    protected String nombreR;
    protected String dirR;
    protected CodigoPostal cpR;
    protected String nombreD;
    protected String dirD;
    protected CodigoPostal cpD;
    
    private static int contador = 1;
    
    public Envio(String nr, String dr, CodigoPostal cr, String nd, String dd, CodigoPostal cd)
    {
        nEnvio = contador++;
        nombreR = nr;
        dirR = dr;
        cpR = cr;
        nombreD = nd;
        dirD = dd;
        cpD = cd;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Envio.contador = contador;
    }
    
    

    public int getnEnvio() {
        return nEnvio;
    }
    
    public String toString()
    {
        return nEnvio+"\tRemitente: "+nombreR+"\t"+dirR+"\t"+cpR.getCodigoPostal()+
                "\tDestinatario: "+nombreD+"\t"+dirD+"\t"+cpD.getCodigoPostal();
    }
    
}
