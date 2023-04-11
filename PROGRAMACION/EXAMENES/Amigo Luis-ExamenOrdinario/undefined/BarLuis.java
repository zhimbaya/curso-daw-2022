
package barluis;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class BarLuis {

    
    public static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    public static final String FICHERO = "reservas.bin";
    
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
                System.out.println("Número incorrecto");
                sc.nextLine();
            }
        }
    }
    
    public static int menu()
    {
        int op = 0;
        while (op<1 || op>5)
        {
            System.out.println("1. Añadir reserva");
            System.out.println("2. Mostrar todas las reservas");
            System.out.println("3. Mostrar listado de las reservas con catering");
            System.out.println("4. Anular reserva");
            System.out.println("5. Salir");
            op = leerInt();
        }
        return op;
    }
    
    public static Reserva buscar(int id)
    {
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext())
        {
            Reserva r = it.next();
            if (r.getId()==id)
                return r;
        }
        return null;
    }
    
    public static void anadirReserva()
    {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Qué tipo de reserva quiere realizar?\n1. Sólo local\n2. Con catering y barra libre");
            op = leerInt();
        }
        System.out.print("Año: ");
        int anio = leerInt();
        int sem = 0;
        while (!Reserva.esSemanaValida(sem))
        {
            System.out.print("Semana: ");
            sem = leerInt();
        }
        
        if (buscar(Reserva.generarId(anio, sem))== null)
        {
        
            System.out.print("Cliente: ");
            String cliente = sc.nextLine();
            if (op==2)
            {
                int personas = 0;
                while (!ReservaCatering.esPersonasValido(personas))
                {
                    System.out.print("Número de personas: ");
                    personas = leerInt();
                }
                System.out.print("Horas contratadas: ");
                int horas = leerInt();
                reservas.add(new ReservaCatering(anio,sem,cliente,personas,horas));
            }
            else
            {
                reservas.add(new ReservaLocal(anio,sem,cliente));
            }
        }
        else
            System.out.println("Esa fecha ya estña reservada.");
    }
    
    public static void guardarFicheroTexto()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String f = sc.nextLine();
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(f));
            Iterator<Reserva> it = reservas.iterator();
            while (it.hasNext())
            {
                bw.write(it.next().toString()+"\n");
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
                System.out.println("Error cerrando el fichero");
            }
        }
    }
    
    public static void guardarDatos()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FICHERO));
            oos.writeObject(reservas);
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
            ois = new ObjectInputStream(new FileInputStream(FICHERO));
            reservas = (ArrayList<Reserva>) ois.readObject();
        }
        catch (FileNotFoundException e)
        {
            
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos");
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo los datos");
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
    
    public static void mostrarReservas()
    {
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
             
        }
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea guardar el listado en un fichero?\n1. Si\n2. No");
            op = leerInt();
        }
        if (op==1)
        {
            guardarFicheroTexto();
        }
        
    }
    
    public static void mostrarReservasCatering()
    {
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext())
        {
            Reserva r = it.next();
            if (r instanceof ReservaCatering)
                System.out.println(r);
        }
    }
    
    public static void anularReserva()
    {
        System.out.print("Año: ");
        int anio = leerInt();
        int sem = 0;
        while (!Reserva.esSemanaValida(sem))
        {
            System.out.print("Semana: ");
            sem = leerInt();
        }
        
        Reserva r = buscar(Reserva.generarId(anio, sem));
        if (r==null)
            System.out.println("No he encontrado ninguna reserva para esa fecha");
        else
        {
            reservas.remove(r);
            System.out.println("La reserva ha sido anulada correctamente");
        }
    }
    
    
    
    public static void main(String[] args) {
        
        recuperarDatos();
        int op = menu();
        while (op!=5)
        {
            switch (op)
            {
                case 1: anadirReserva(); break;
                case 2: mostrarReservas(); break;
                case 3: mostrarReservasCatering(); break;
                case 4: anularReserva(); break;
            }
            op = menu();
        }
        guardarDatos();
    }
    
}
