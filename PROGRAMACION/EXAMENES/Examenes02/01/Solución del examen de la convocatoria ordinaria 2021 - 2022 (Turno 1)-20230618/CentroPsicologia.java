
package centropsicologia;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CentroPsicologia {

    
    public static ArrayList<Prueba> pruebas = new ArrayList<Prueba>();
    public static final String FICHERO = "pruebas.bin";
    
    public static int menu()
    {
        int op = 0;
        while (op < 1 || op > 6)
        {
            System.out.println("1. Añadir test");
            System.out.println("2. Añadir prueba de preguntas cortas");
            System.out.println("3. Mostrar pruebas tipo test");
            System.out.println("4. Mostrar pruebas de preguntas cortas");
            System.out.println("5. Mostrar pruebas por código");
            System.out.println("6. Salir");
            op = Util.leerInt();
        }
        return op;
    }

    public static void anadirTest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Código: ");
        String c = sc.nextLine();
        System.out.print("Número de preguntas: ");
        int n = Util.leerInt();
        pruebas.add(new Test(c,n));        
    }
    
    public static void anadirPruebaPreguntasCortas()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Código: ");
        String c = sc.nextLine();
        System.out.print("Fichero: ");
        String f = sc.nextLine();
        pruebas.add(new PruebaPreguntasCortas(c,f));        
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
    
    public static void mostrarPPreguntasCortas()
    {
        Iterator<Prueba> it = pruebas.iterator();
        while (it.hasNext())
        {
            Prueba p = it.next();
            if (p instanceof PruebaPreguntasCortas)
            {
                ((PruebaPreguntasCortas) p).mostrar();
                System.out.println();
            }
        }
    }
    
    public static void mostrarPruebaPorCodigo()
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Código: ");
        String c = sc.nextLine();
        Iterator<Prueba> it = pruebas.iterator();
        while (it.hasNext())
        {
            Prueba p = it.next();
            if (p.getCodigo().equals(c))
            {
                if (p instanceof PruebaPreguntasCortas)
                {
                    ((PruebaPreguntasCortas) p).mostrar();
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
                case 2: anadirPruebaPreguntasCortas(); break;
                case 3: mostrarTest(); break;
                case 4: mostrarPPreguntasCortas(); break;
                case 5:  mostrarPruebaPorCodigo(); break;
            }
            op = menu();
        }
        guardarDatos();
        
    }
    
}
