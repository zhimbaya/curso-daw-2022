/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera2021rojos;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author anusk
 */
public class Tercera2021Rojos {

    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static Usuario logueado;
    public static final String FDATOS = "usuarios.bin";
    
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
                System.out.println("Número no válido");
                sc.nextLine();
            }
        }
    }
    
    public static int menuProfesor()
    {
        int op = 0;
        while (op<1 || op >5)
        {
            System.out.println("1. Crear usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Mostrar trabajo");
            System.out.println("4. Cambiar de usuario");
            System.out.println("5. Salir");
            op = leerInt();
        }
        return op;
    }
    
    public static int menuAlumno()
    {
        int op = 0;
        while (op<1 || op >4)
        {
            System.out.println("1. Entregar trabajo");
            System.out.println("2. Mostrar trabajo");
            System.out.println("3. Cambiar de usuario");
            System.out.println("4. Salir");
            op = leerInt();
        }
        return op;
    }
    
    public static void crearUsuario()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Nombre y apelliodos: ");
        String nombre = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("Tipo de usuario:\n1. Alumno\n2. Profesor");
            op = leerInt();
        }
        if (op==1)
            usuarios.add(new Alumno(dni,nombre,pass));
        else
            usuarios.add(new Profesor(dni,nombre,pass));
    }
    
    public static void crearProfesor()
    {
        System.out.println("Se está iniciando la aplicación por primera vez.");
        System.out.println("Dando de alta a un profesor...");
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Nombre y apelliodos: ");
        String nombre = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();  
        Profesor p = new Profesor(dni,nombre,pass);
        usuarios.add(p);
        logueado = p;
        
    }
    
    public static void listarUsuarios()
    {
        Iterator<Usuario>it = usuarios.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
    
    public static void mostrarTrabajo()
    {
        logueado.mostrarTrabajo();
    }
    
    public static Usuario buscar(String dni)
    {
        Iterator<Usuario>it = usuarios.iterator();
        while (it.hasNext())
        {
            Usuario u = it.next();
            if (u.getDni().equals(dni))
                return u;
        }
        return null;
    }
    
    public static void cambiarUsuario()
    {
        logueado = null;
        Scanner sc = new Scanner(System.in);

        while (logueado==null)
        {
            Usuario u = null;
            String dni="";
            while (u==null)
            {                
                System.out.print("DNI: ");
                dni = sc.nextLine();
                u = buscar(dni);    
                if (u==null)
                    System.out.println("Usuario inválido");
            }        

            System.out.print("Password: ");
            String pass = sc.nextLine();
            if (u.getPass().equals(pass))
            {
                logueado = u;
                System.out.println("Se ha logueado el usuario "+dni);
            }
            else
            {
                System.out.println("Password incorrecto");
            }
        }
        
    }
    
    public static void guardarDatos()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FDATOS));
            oos.writeObject(usuarios);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando datos");
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
            ois = new ObjectInputStream(new FileInputStream(FDATOS));
            usuarios = (ArrayList<Usuario>) ois.readObject();
            cambiarUsuario();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos");
        }   
        catch (FileNotFoundException e)
        {
            crearProfesor();
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
            crearProfesor();
        }
         catch (Exception e)
        {
            System.out.println("Error en los datos");
            crearProfesor();
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
        boolean salir = false;
        while (!salir)
        {
            if (logueado instanceof Profesor)
            {
                int op = menuProfesor();
                switch (op)
                {
                    case 1: crearUsuario(); break;
                    case 2: listarUsuarios(); break;
                    case 3: mostrarTrabajo(); break;
                    case 4: cambiarUsuario(); break;
                    case 5: salir = true; break;
                }
            }
            else
            {
                int op = menuAlumno();
                switch (op)
                {
                    case 1: ((Alumno)logueado).entregarTrabajo();break;
                    case 2: mostrarTrabajo(); break;
                    case 3: cambiarUsuario(); break;
                    case 4: salir = true; break;
                }
            }
        }
        guardarDatos();
    }
    
}
