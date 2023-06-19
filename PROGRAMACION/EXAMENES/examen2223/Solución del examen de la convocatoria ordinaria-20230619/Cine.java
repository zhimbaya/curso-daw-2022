
package cine;

import java.util.ArrayList;
import java.util.Iterator;


public class Cine {
    
    public static ArrayList<Sala> salas;
    public static String fDatos = "salas.bin";
    
    public static int menu()
    {
        int op = 0;
        while (op<1 || op >4)
        {
            System.out.println("1. Crear sala");
            System.out.println("2. Cambiar película");
            System.out.println("3. Comprar entradas");
            System.out.println("4. Salir");
            op = Util.leerInt();
        }
        return op;
    }

    public static int menuSala()
    {
        int op = 0;
        while (op<1 || op >2)
        {
            System.out.println("1. Sala numerada");
            System.out.println("2. Sala no numerada");            
            op = Util.leerInt();
        }
        return op;
    }
    
    public static void crearSala()
    {
        String titulo = Util.leerLinea("Título: ");
        int tipo = menuSala();
        if (tipo == 1) //Sala numerada
        {
            int f = Util.leerInt("Filas: ");
            int b = Util.leerInt("Butacas por fila: ");
            salas.add(new SalaNumerada(titulo, f, b));
        }
        else //Sala no numerada
        {
            int b = Util.leerInt("Nº Butacas: ");
            salas.add(new SalaNoNumerada(titulo, b));
        }
    }
    
    public static Sala buscar(int n)
    {
        Iterator <Sala> it = salas.iterator();
        while (it.hasNext())
        {
            Sala s = it.next();
            if (s.getNumSala()==n)
                return s;
        }
        return null;
    }
    
    public static void cambiarPelicula()
    {
        int n = Util.leerInt("Nº de sala: ");
        Sala s = buscar(n);
        if (s==null)
            System.out.println("La sala "+n+" no existe");
        else
        {
            s.setTitulo(Util.leerLinea("Nuevo título: "));
            s.vaciarSala();
        }
    }
    
    public static void mostrarSalas()
    {
        Iterator<Sala> it = salas.iterator();
        System.out.println("SALAS");
        System.out.println("--------------------------------------------");
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("--------------------------------------------");
    }
    
    public static void comprarEntradas()
    {        
        mostrarSalas();
        int n = Util.leerInt("Sala: ");
        Sala s = buscar(n);
        if (s==null)
            System.out.println("No existe la sala "+n);
        else
            s.venderEntradas();
        
    }

    public static void main(String[] args) {
        
        salas = Util.recuperarDatos(fDatos);
        if (salas==null)
            salas = new ArrayList<Sala>();
        
        int op = menu();
        while (op!=4)
        {
            switch (op)
            {
                case 1: crearSala(); break;
                case 2: cambiarPelicula(); break;
                case 3: comprarEntradas(); break;
            }
            op = menu();
        }
        Util.guardarDatos(fDatos, salas);
    }
    
}
