package Tema05;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class PruebaLibro {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String titulo, autor;
        int codigo;

        //Creamos el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("La forja de un rebelde", "Arturo Barea", 1, false);
        //Creamos el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce titulo del libro: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor del libro: ");
        autor = sc.nextLine();
        System.out.print("Introduce código del libro: ");
        codigo = sc.nextInt();

        //Cargamos en libro2 los datos leídos de teclado mediante los métodos setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setCodigo(codigo);
        //Como por defecto, al utilizar el constructor por defecto determina sus valores booleanos a false, asumimos
        //que lo dejará como no prestado (atributo "prestado" a false)

        //Mostramos por pantalla los datos (atributos) del objeto libro1 mediante los m�todos getters
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Código: " + libro1.getCodigo());
        System.out.println();
        System.out.println("=======================================");

        //Prestamos el libro1. El método devolveré true si se ha podido realizar el préstamo y false en caso contrario
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro '" + libro1.getTitulo() + "' exitosamente");
        } else {
            System.out.println("No se ha podido prestar el libro '" + libro1.getTitulo() + "' . Se encuentra ya prestado");
        }

        //Devolvemos el libro1. El método devolverá true si se ha podido realizar la devolución y false en caso contrario
        if (libro1.devolver()) {
            System.out.println("Se ha devuelto el libro '" + libro1.getTitulo() + "'");
        } else {
            System.out.println("No hay ejemplar del libro '" + libro1.getTitulo() + "' prestado");
        }

        //Prestamos de nuevo el libro1
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro '" + libro1.getTitulo() + "' para prestar");
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
        String cadPrestado1 = "";
        cadPrestado1 = libro1.getPrestado() ? "SI" : "No";
        System.out.println("Prestado: " + cadPrestado1);
        System.out.println();
        System.out.println("=======================================");

        //mostrar los datos del libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Código: " + libro2.getCodigo());
        System.out.println("Prestado: " + (libro2.getPrestado() ? "SI" : "No"));
        sc.close();
    }

}
