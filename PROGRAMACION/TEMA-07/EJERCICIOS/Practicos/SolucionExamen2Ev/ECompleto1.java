
package ecompleto1;

import java.util.Scanner;


public class ECompleto1 {

    public static final int MAX = 200;
    public static Producto[] productos = new Producto[MAX];
    public static int cantProductos = 0;
    
    public static int menu()
    {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op <1 || op >3)
        {
            System.out.println("1. Registrar producto");
            System.out.println("2. Comprar");
            System.out.println("3. Salir");
            op = sc.nextInt();
        }
        return op;
    }
    
    public static int menuProducto()
    {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op <1 || op >2)
        {
            System.out.println("1. Producto por unidad");
            System.out.println("2. Producto al peso");
            
            op = sc.nextInt();
        }
        return op;
    }
    
    public static void registrar()
    {
        Scanner sc = new Scanner(System.in);
        
            if (cantProductos==MAX)
                System.out.println("No se puede añadir más productos");
            else
            {
            int tipo = menuProducto();
            System.out.print("Descripción: ");
            String desc = sc.nextLine();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            if (tipo == 1)
                productos[cantProductos++] = new PUnidad(desc,precio);
            else
                productos[cantProductos++] = new PPeso(desc, precio);
        }
    }
    
    public static Producto buscar(int c)
    {
        for (int i = 0; i < cantProductos; i++)
        {
            if (productos[i].getRef()==c)
                return productos[i];
        }
        return null;
    }
    
    public static void comprar()
    {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        String factura="FACTURA\n---------\n";
        System.out.println("PRODUCTOS");
        System.out.println("---------");
        for (int i = 0; i < cantProductos; i++)
            System.out.println(productos[i]);
        System.out.println("---------");
        
        System.out.println("Indique los productos a comprar (terminar con 0");
        int cod = sc.nextInt();
        while (cod!=0)
        {
            Producto p = buscar(cod);
            if (p==null)
                System.out.println("Producto no encontrado");
            else
            {
                if (p instanceof PPeso)
                {
                    System.out.print("Peso en gramos: ");
                    int gr = sc.nextInt();
                    factura+="\n"+((PPeso)p).mostrar(gr);
                    total+=((PPeso) p).calcularPrecio(gr);
                }
                else
                {
                    factura+="\n"+p;
                    total+=p.getPrecio();
                }
            }
            cod = sc.nextInt();
        }
        factura+="\n\n-----------------\nTOTAL________ "+total+"€";
        System.out.println(factura);
    }
    
    public static void main(String[] args) {
        
        int op = menu();
        
        while (op!=3)
        {
            switch (op)
            {
                case 1: registrar(); break;
                case 2: comprar(); break;
            }
            op = menu();
        }
        
    }
    
}
