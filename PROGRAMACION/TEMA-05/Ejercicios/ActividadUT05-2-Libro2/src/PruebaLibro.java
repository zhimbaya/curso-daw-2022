

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int  codigo, numEjemplares, numEjemplaresPrestados;

        //Creamos el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("La forja de un rebelde", "Arturo Barea", 1001, 2, 0);
        //Creamos el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();

        System.out.print("Introduce titulo del libro: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor del libro: ");
        autor = sc.nextLine();
        System.out.print("Introduce código del libro: ");
        codigo = sc.nextInt();
        System.out.print("Introduce número de ejemplares del libro: ");
        numEjemplares = sc.nextInt();
        System.out.print("Introduce número de ejemplares prestados del libro: ");
        numEjemplaresPrestados = sc.nextInt();

        //Cargamos en libro2 los datos leídos de teclado mediante los métodos setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setCodigo(codigo);
        libro2.setNumEjemplares(numEjemplares);
        libro2.setNumEjemplaresPrestados(numEjemplaresPrestados);
        
        //Mostramos por pantalla los datos (atributos) del objeto libro1 mediante los métodos getters 
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Código: " + libro1.getCodigo());
        System.out.println("Número de ejemplares: " + libro1.getNumEjemplares());
        System.out.println("Número de ejemplares prestados");
        System.out.println("=======================================");

        //Prestamos el libro1. El método devolverá true si se ha podido realizar el préstamo y false en caso contrario
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro '" + libro1.getTitulo() +"' exitosamente");
        } else {
            System.out.println("No se ha podido prestar el libro '" + libro1.getTitulo() + "' . Se encuentra ya prestado");
        }

        //Devolvemos el libro1. El método devolverá true si se ha podido realizar la devolución y false en caso contrario
        if (libro1.devolver()) {
            System.out.println("Se ha devuelto el libro '" + libro1.getTitulo() + "'");
        } else {
            System.out.println("No hay ejemplar del libro '" + libro1.getTitulo() + "' prestado");
        }

        //Prestamos de nuevo el libro1 (Aquí quedará uno de los 2 disponibles)
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro '" + libro1.getTitulo() + "' para prestar");
        }

        //Prestamos de nuevo el libro1 (Aquí ya no quedarña ninguno disponible)
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro '" + libro1.getTitulo() + "'");
        } else {
            System.out.println("No queda ejemplar del libro '" + libro1.getTitulo() + "' para prestar");
        } 
        
        //Prestamos de nuevo el libro1 (Aquí debe decir que ya está prestado)
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro '" + libro1.getTitulo() + "'");
        } else {
            System.out.println("No queda ejemplar del libro '" + libro1.getTitulo() + "' para prestar");
        } 
        
        System.out.println("=======================================");
        //mostramos los datos del libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Código: " + libro1.getCodigo());
        System.out.println("Número de ejemplares: " + libro1.getNumEjemplares());
        System.out.println("Número de ejemplares disponibles: " + (libro1.getNumEjemplares()-libro1.getNumEjemplaresPrestados()));
        System.out.println("=======================================");

        //mostrar los datos del libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Código: " + libro2.getCodigo());
        System.out.println("Número de ejemplares: " + libro2.getNumEjemplares());
        System.out.println("Número de ejemplares disponibles: " + (libro2.getNumEjemplares()-libro2.getNumEjemplaresPrestados()));


	}

}
