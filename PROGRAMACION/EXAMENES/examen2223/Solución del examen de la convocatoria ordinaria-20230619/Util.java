
package cine;

import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Util {
    
    public static int leerInt()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (Exception e)
            {
                sc.nextLine();                
            }
        }
    }
    
    public static int leerInt(String s)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                System.out.print(s);
                return sc.nextInt();
            }
            catch (Exception e)
            {
                sc.nextLine();                
            }
        }
    }
    
    public static int leerInt(String s, int i, int f)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                System.out.print(s);
                int n = sc.nextInt();
                if (n<i || n>f)
                {
                    System.out.println("El número ha de estar entre "+i+" y "+f);
                }
                else
                    return n;
            }
            catch (Exception e)
            {
                sc.nextLine();                
            }
        }
    }
    
    public static String leerLinea()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static String leerLinea(String t)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(t);
        return sc.nextLine();
    }
    
    public static void guardarFicheroTexto(String texto)
    {
        String f = leerLinea("Nombre del fichero: ");
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write(texto);
        }
        catch (IOException e)
        {
            System.err.println("Error escribiendo el fichero de texto");
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
                System.err.println("Error cerrando el fichero de texto");
            }
        }
    }
    
    public static void guardarDatos(String f, ArrayList<Sala> s)
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeInt(Sala.getContador());
            oos.writeObject(s);
            
        }
        catch (IOException e)
        {
            System.err.println("Error guardando datos");
        }
        finally
        {
            try
            {
                if (oos!=null)
                    oos.close();
            }
            catch (IOException e)
            {
                System.err.println("Error cerrando el fichero de datos");
            }
        }
    }
    
    public static ArrayList<Sala> recuperarDatos(String f)
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(f));
            Sala.setContador(ois.readInt());
            return (ArrayList<Sala>) ois.readObject();
        }
        catch (FileNotFoundException e)
        {}
        catch (IOException e)
        {
            System.err.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.err.println("Error en los datos del fichero");
        }
        finally
        {
            try
            {
                if (ois!=null)
                    ois.close();
            }
            catch (IOException e)
            {
                System.err.println("Error cerrando el fichero de datos");
            }
            
        }
        return null;
    }
    
}
