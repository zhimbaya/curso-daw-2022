/*
 * Un supermercado nos pide que hagamos una pequeña aplicación que almacene los 
* productos pasados por el escáner. La aplicación debe almacenar objetos de la 
* clase Producto en un ArrayList.
* La clase Producto tiene tres atributos:
* • nombre (el nombre será del tipo productoX, siendo X el número de productos 
que se han creado hasta el momento (usar una variable estática para ello)
* • una cantidad (entre 1 y 10), un precio (entre 0.01 y 100.00) 
(estos dos serán generados aleatoriamente por el constructor). La aplicación contendrá dos métodos:
* • generarLista() que devolverá una lista de productos que contendrá entre 1 y 8 elementos
* • mostrarTicket() que recibirá un ArrayList de Productos y nos mostrará por 
pantalla los productos, con su cantidad, precio, precio total
* de cada producto y precio total de la compra, con un formato similar al del siguiente ejemplo: 
***********Cantidad****Precio*****Total
* Producto1   5 3.5 17.5
* Producto2   7 2.5 17.5
* Precio final    35
 */
package Tema09;

public class Producto {

    private String nombre;
    private int cantidad;
    private double precio;

    private static int num = 1;

    private String generarNombre() {
        return "Producto" + num++;
    }

    private int generarCantidad() {
        return (int) (Math.random() * 10 + 1);
    }

    private double generarPrecio() {

        return (double) ((int) (Math.random() * 10000 + 1)) / 100;
    }

    public Producto() {
        nombre = generarNombre();
        cantidad = generarCantidad();
        precio = generarPrecio();
    }

    public double precioTotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return nombre + "\t" + cantidad + "\t" + precio + "\t" + precioTotal();
    }

}
