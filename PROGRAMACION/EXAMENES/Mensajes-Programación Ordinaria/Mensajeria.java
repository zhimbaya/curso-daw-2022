/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordinario1819;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author anusk
 */
public class Mensajeria {

    public static ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
    public static String fMensajes = "mensajes.dat";
    
    
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
    
    public static int menu()
    {
        
        int op = 0;
        while (op<1 || op >8)
        {
            System.out.println("1. Listar todos los mensajes");
            System.out.println("2. Mostrar mensajes normales");
            System.out.println("3. Mostrar mensajes encriptados");
            System.out.println("4. Buscar mensaje");
            System.out.println("5. Añadir mensaje");
            System.out.println("6. Desencriptar mensaje");
            System.out.println("7. Eliminar mensaje");
            System.out.println("8. Salir");
            
            op = leerInt();
        }
        return op;
        
                
    }
    
    public static void listarMensajes()
    {
       
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea mostrar los mensajes por pantalla o guardarlos en fichero de texto?");
            System.out.println("1. Por pantalla");
            System.out.println("2. Guardar en fichero");
            op = leerInt();
        }
        if (op == 1)
        {
            Iterator <Mensaje> it = mensajes.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            String fichero="";
            System.out.println("Indica el nombre del fichero");
            fichero = sc.nextLine();
            BufferedWriter bw = null;
            try
            {
                bw = new BufferedWriter(new FileWriter(fichero));
                Iterator <Mensaje> it = mensajes.iterator();
                while (it.hasNext())
                {
                    bw.write(it.next().toString());
                    bw.newLine();
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
                    if (bw!= null)
                        bw.close();
                }
                catch (IOException e)
                {
                    System.out.println("Error cerrando el fichero");
                }
            }
        }
        
    }
    
    public static void listarMensajesNormales()
    {
        Iterator <Mensaje> it = mensajes.iterator();
        while (it.hasNext())
        {
            Mensaje m = it.next();
            if (m instanceof MensajeSinEncriptar)
            {
                System.out.println(m);
            }
                
        }
    }
    
    public static void listarEncriptado()
    {
        Iterator <Mensaje> it = mensajes.iterator();
        while (it.hasNext())
        {
            Mensaje m = it.next();
            if (m instanceof MensajeEncriptado)
            {
                System.out.println(m);
            }
                
        }
    }
    
    public static Mensaje buscar(int c)
    {
        Iterator <Mensaje> it = mensajes.iterator();
        while (it.hasNext())
        {
            Mensaje m = it.next();
            if (m.getCodigo() == c)
            {
                return m;
            }               
        }
        return null;
    }
    
    public static void buscarMensaje()
    {
        System.out.print("Código: ");
        int cod = leerInt();
        Mensaje m = buscar(cod);
        if (m == null)
            System.out.println("No existe ningún mensaje con el código "+cod);
        else
            System.out.println(m);
    }
    
    public static void anadirMensaje()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mensaje: ");
        String texto = sc.nextLine();
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea encriptar su mensaje?\n1. Sí\n2.No");
            op = leerInt();
        }
        if (op == 1)
            mensajes.add(new MensajeEncriptado(mensajes.size(),texto));
        else
            mensajes.add(new MensajeSinEncriptar(mensajes.size(),texto));
    }
    
    public static void desencriptarMensaje()
    {
        System.out.print("Código del mensaje a desencriptar: ");
        int cod = leerInt();
        Mensaje m = buscar(cod);
        if (m == null)
            System.out.println("Mensaje no encontrado");
        else if (m instanceof MensajeEncriptado)
            ((MensajeEncriptado)m).mostrarDesencriptado();
        else
            System.out.println("El mensaje con código "+cod+" no es un mensaje encriptado");
    }
    
    public static void eliminarMensaje()
    {
        System.out.print("Código del mensaje a eliminar: ");
        int cod = leerInt();
        Mensaje m = buscar(cod);
        if (m == null)
            System.out.println("Mensaje no encontrado");
        else 
        {
            mensajes.remove(cod);
            for (int i = cod; i < mensajes.size(); i++)
                mensajes.get(i).setCodigo(i);
        }
    }
    
    public static void guardarMensajes()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(fMensajes));
            oos.writeObject(mensajes);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando la lista de mensajes en el fichero");
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
    
    public static void recuperarMensajes()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(fMensajes));
            mensajes = (ArrayList<Mensaje>)ois.readObject();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos del fichero");
        }
        catch (FileNotFoundException e)
        {
            
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos del fichero");
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
    
    public static int main(String[] args) {
        recuperarMensajes();
        int op = menu();
        while (op!=8)
        {
            switch (op)
            {
                case 1: listarMensajes(); break;
                case 2: listarMensajesNormales(); break;
                case 3: listarEncriptado(); break;
                case 4: buscarMensaje(); break;
                case 5: anadirMensaje(); break;
                case 6: desencriptarMensaje(); break;
                case 7: eliminarMensaje(); break;
            }
            op = menu();
        }
        guardarMensajes();
    }
    
}
