/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera2021rojos;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author anusk
 */
public class Alumno extends Usuario{
    
    public Alumno(String d, String n, String p)
    {
        super(d,n,p);
    }
    
    public void entregarTrabajo()
    {
        String f = dni+".txt";
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;
        System.out.println("Escribe el documento. Termina con una línea con el texto FIN");
        try
        {
            bw = new BufferedWriter(new FileWriter(f));
            String linea = sc.nextLine();
            while (!linea.equalsIgnoreCase("FIN"))
            {
                bw.write(linea);
                bw.newLine();
                linea = sc.nextLine();
            }
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
    
    public boolean entregado()
    {
        File f = new File(dni+".txt");
        return f.exists();
    }
    
    public boolean esValido()
    {
        String f = dni+".txt";
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(f));
            int cont = 0;
            while (br.readLine()!=null)
                cont++;
            return cont>=10 && cont<=20;
        }
        catch (FileNotFoundException e)
        {
            System.out.println("El trabajo no se ha entregado");
            return false;
        }
        catch (IOException e)
        {
            System.out.println("Error leytendo el fichero");
            return false;
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
    
    @Override
    public void mostrarTrabajo()
    {
        String f = dni+".txt";
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(f));
            String linea = br.readLine();
            while (linea!=null)
            {
                System.out.println(linea); 
                linea = br.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("El trabajo no se ha entregado");
        }
        catch (IOException e)
        {
            System.out.println("Error leytendo el fichero");
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
    
    public String toString()
    {
        return super.toString()+"\t"+(entregado()?"Entregado":"No entregado")+"\t"+(entregado()&& esValido()?"Válido":(entregado()?"No valido":""));
    }
}
