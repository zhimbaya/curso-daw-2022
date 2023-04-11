/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera2021rojos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author anusk
 */
public class Profesor extends Usuario{
    
    public Profesor(String d, String n, String p)
    {
        super(d,n,p);
    }
    
    @Override
    public void mostrarTrabajo()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI del alumno: ");
        String dniA = sc.nextLine();
        String f = dniA+".txt";
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
}
