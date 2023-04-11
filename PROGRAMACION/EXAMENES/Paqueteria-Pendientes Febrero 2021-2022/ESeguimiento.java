/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendientes2022;

import java.io.*;


/**
 *
 * @author anusk
 */
public class ESeguimiento extends Envio implements ISeguimiento{
    
    public ESeguimiento(String nr, String dr, CodigoPostal cr, String nd, String dd, CodigoPostal cd)
    {
        super(nr,dr,cr,nd,dd,cd);
        
    }

    @Override
    public String generarCodigo() {
        String ne = String.valueOf(nEnvio);
        while (ne.length()<5)
            ne="0"+ne;
        return "PK"+ne+cpD.getCodigoPostal();
    }

    @Override
    public void mostrarSeguimiento() {
        System.out.println("Mostrando seguimiento del envío "+generarCodigo());
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(generarCodigo()+".txt"));
            bw.write("Mostrando seguimiento del envío "+generarCodigo());
        }
        catch (IOException e)
        {
            System.out.println("Error escribiendo el fichero de texto");
        }
        finally
        {
            try
            {
                if (bw!=null)
                    bw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero de texto");
            }
        }
    }
    
    public String toString()
    {
        return super.toString()+"\t"+generarCodigo();
    }
    
}
