package Tema05;

public class Libro_2 {

    // Atributos
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    private static int totalLibros = 0;
    private static int totalPrestados = 0;

    // Constructores
    public Libro_2() {
    }

    public Libro_2(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        totalLibros += ejemplares;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public int getPrestados() {
        return this.prestados;
    }

    public static int getTotalLibros() {
        return totalLibros;
    }

    public static int getTotalPrestados() {
        return totalPrestados;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setEjemplares(int e) {
        int diferencia = e - this.ejemplares;
        totalLibros = totalLibros + diferencia;
        this.ejemplares = e;

    }

    public void setPrestados(int p) {
        this.prestados = p;
    }

    public boolean prestamo() {
        if (this.prestados < this.ejemplares) {
            this.prestados++;
            totalPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (prestados > 0) {
            prestados--;
            totalPrestados--;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Prestados: " + prestados);
        System.out.println("Porcentaje ejemplares: "
                + (double) ejemplares / totalLibros * 100 + "%");
        System.out.println("Porcentaje prestados: "
                + (double) prestados / totalPrestados * 100 + "%");
    }

}
