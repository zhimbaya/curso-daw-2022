/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centropsicologia;

import java.io.*;

/**
 *
 * @author anusk
 */
public class PruebaPreguntasCortas extends Prueba{
    private String fichero;
    
    public PruebaPreguntasCortas(String codigo, String fichero)
    {
        super(codigo);
        this.fichero = fichero;
    }
    
    public void mostrar()
    {
        System.out.println("Código: "+codigo);
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(fichero));
            String linea = br.readLine();
            while (linea!=null)
            {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        finally
        {
            try
            {
                if (br!=null)
                    br.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
                    
        }
    }

            
}
