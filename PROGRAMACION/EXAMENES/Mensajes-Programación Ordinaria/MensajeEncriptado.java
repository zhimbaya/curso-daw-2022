/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordinario1819;

/**
 *
 * @author anusk
 */
public class MensajeEncriptado extends Mensaje implements IEncriptable{
    
    public MensajeEncriptado(int c, String t)
    {
        super(c, t);
        encriptar();
    }
    
    public void encriptar()
    {
        String tEncriptado = "";
        for (int i = 0;i<texto.length();i++)
        {
            tEncriptado+=(char)(texto.charAt(i)+1);
        }
        texto = tEncriptado;
    }
    
    public String desencriptar()
    {
        String tDesencriptado = "";
        for (int i = 0;i<texto.length();i++)
        {
            tDesencriptado+=(char)(texto.charAt(i)-1);
        }
        return tDesencriptado;
    }
    
    public void mostrarDesencriptado()
    {
        System.out.println(codigo+" "+desencriptar());
    }    
}
