
package donmarciano;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class DonMarciano {

    
    public static ArrayList<Prueba> pruebas = new ArrayList<Prueba>();
    public static final String FICHERO = "pruebas.bin";
    
    public static int menu()
    {
        int op = 0;
        while (op < 1 || op > 6)
        {
            System.out.println("1. Añadir test");
            System.out.println("2. Añadir examen práctico");
            System.out.println("3. Mostrar exámenes tipo test");
            System.out.println("4. Mostrar exámenes prácticos");
            System.out.println("5. Mostrar exámenes por fecha");
            System.out.println("6. Salir");
            op = Util.leerInt();
        }
        return op;
    }

    public static void anadirTest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fecha: ");
        String f = sc.nextLine();
        System.out.print("Número de preguntas: ");
        int n = Util.leerInt();
        pruebas.add(new Test(f,n));        
    }
    
    public static void anadirExamenPractico()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fecha: ");
        String c = sc.nextLine();
        System.out.print("Fichero: ");
        String f = sc.nextLine();
        pruebas.add(new ExamenPractico(c,f));        
    }
    
    public static void mostrarTest()
    {
        Iterator<Prueba> it = pruebas.iterator();
        while (it.hasNext())
        {
            Prueba p = it.next();
            if (p instanceof Test)
                System.out.println(p+"\n");
        }
    }
    
    public static void mostrarExamenesPracticos()
    {
        Iterator<Prueba> it = pruebas.iterator();
        while (it.hasNext())
        {
            Prueba p = it.next();
            if (p instanceof ExamenPractico)
            {
                ((ExamenPractico) p).mostrar();
                System.out.println();
            }
        }
    }
    
    public static void mostrarExamenPorFecha()
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Fecha: ");
        String f = sc.nextLine();
        Iterator<Prueba> it = pruebas.iterator();
        while (it.hasNext())
        {
            Prueba p = it.next();
            if (p.getFecha().equals(f))
            {
                if (p instanceof ExamenPractico)
                {
                    ((ExamenPractico) p).mostrar();
                    System.out.println();
                }
                else
                    System.out.println(p+"\n");
            }
        }
    }
    
    public static void guardarDatos()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FICHERO));
            oos.writeObject(pruebas);
        }
        catch (IOException e)
        {
            System.out.println("Error escrbiendo los datos");
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
                System.out.println("Error cerrando el fichero");
            }
        }
                
    }
    
    public static void recuperarDatos()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO));
            pruebas = (ArrayList<Prueba>)ois.readObject();
        }
        catch (FileNotFoundException e)
        {}
        catch (ClassNotFoundException e)
        {
            System.out.println("Error leyendo los datos");
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos");
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
                System.out.println("Error cerrando el fichero");
            }
        }
    }
    
    public static void main(String[] args) {
        
        recuperarDatos();
        int op = menu();
        while (op!=6)
        {
            switch (op)
            {
                case 1: anadirTest(); break;
                case 2: anadirExamenPractico(); break;
                case 3: mostrarTest(); break;
                case 4: mostrarExamenesPracticos(); break;
                case 5: mostrarExamenPorFecha(); break;
            }
            op = menu();
        }
        guardarDatos();
        
    }
    
}
