/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra21;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class Extra21 {

    public static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public static String fichero = "productos.bin";

    public static void guardarProductos()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(listaProductos);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando el fichero");
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

    public static void cargarProductos()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(fichero));
            listaProductos = (ArrayList<Producto>)ois.readObject();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos del fichero");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No hay fichero de productos");
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



    public static int menu()
    {
        int op = 0;
        while (op<1 || op>3)
        {
            System.out.println("1. Registrar producto");
            System.out.println("2. Realizar compra");
            System.out.println("3. Salir");
            op = Util.leerInt();
        }
        return op;
    }

    public static void registrarProducto()
    {
        System.out.print("Código: ");
        int c = Util.leerInt();
        System.out.print("Descripción: ");
        String d = Util.leerLinea();
        int tipo = 0;
        while (tipo!=1 && tipo!=2)
        {
            System.out.println("¿Se vende por peso (1) o por unidades (2)?");        
            tipo = Util.leerInt();
        }
        System.out.print("Precio por "+((tipo==1)?"kilo":"unidad"));
        double p = Util.leerDouble();
        if (tipo==1)
            listaProductos.add(new PPeso(c, d, p));
        else
            listaProductos.add(new PUnidad(c, d, p));
    }

    public static void mostrarProductos()
    {
        Iterator <Producto> it = listaProductos.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    public static Producto buscar(int cod)
    {
        Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext())
        {
            Producto p = it.next();
            if (p.getCodigo()==cod)
                return p;
        }
        return null;
    }

    public static String generarFactura(ArrayList<Producto> l,
                                        ArrayList<Integer> pesos, double pTotal)
    {
        String texto ="";
        for (int i = 0; i < l.size(); i++)
        {
            Producto p = l.get(i);
            texto += p.getCodigo()+"\t"+p.getDesc()+"\t";

            if (p instanceof PPeso)
            {
            texto+=p.getPrecio()+"€/kilo"+"\t"+((PPeso) p).calcularPrecio(pesos.get(i))+"€\n";
            }
            else
            {
                texto+=p.getPrecio()+"€/u"+"\t"+p.getPrecio()+"€\n";
            }             
        }
        texto+="TOTAL: "+pTotal;
        return texto;
    }

    public static void guardarFactura(String factura, String fichero)
    {
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fichero));
                    bw.write(factura);
        }
        catch (IOException e)
        {
            System.out.println("Error escribiendo factura");
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
                System.out.println("Error cerrando fichero de factura");
            }
        }
    }

    public static void realizarCompra()
    {
        ArrayList<Producto> listaCompra = new ArrayList<Producto>();
        ArrayList<Integer> pesos = new ArrayList<Integer>();
        double precioTotal = 0;
        mostrarProductos();
        System.out.println("Indica los códigos de los productos a comprar. Termina con 0");
        int c = Util.leerInt();
        while (c!=0)
        {
            Producto p = buscar(c);
            if (p==null)
                System.out.println("No existe ningún producto con código "+c);
            else if (p instanceof PPeso)
            {
                System.out.print("Peso en gramos: ");
                int gramos = Util.leerInt();
                listaCompra.add(p);
                pesos.add(gramos);
                precioTotal+=((PPeso) p).calcularPrecio(gramos);
            }
            else
            {
                listaCompra.add(p);
                pesos.add(0);
                precioTotal+=p.getPrecio();
            }
            mostrarProductos();
            c = Util.leerInt();
        }
        String factura = generarFactura(listaCompra, pesos, precioTotal);
        System.out.println(factura);
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea guardar la factura en un fichero?\n1. Sí\n2.no");
            op = Util.leerInt();
        }
        if (op==1)
        {
            System.out.print("Nombre del fichero: ");
            guardarFactura(factura, Util.leerLinea());
        }

    }

    public static void main(String[] args) {
        cargarProductos();
        int op = menu();
        while (op!=3)
        {
            switch (op)
            {
                case 1: registrarProducto(); break;
                case 2: realizarCompra(); break;
            }
            op = menu();
        }
        guardarProductos();
    }

}
