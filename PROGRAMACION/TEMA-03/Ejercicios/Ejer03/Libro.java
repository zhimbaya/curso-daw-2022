
package ejercicioa0403;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    // Constructores
    public Libro()
    {        
    }
    public Libro(String titulo, String autor, int ejemplares, int prestados)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public String getAutor()
    {
        return this.autor;
    }
    public int getEjemplares()
    {
        return this.ejemplares;
    }
    public int getPrestados()
    {
        return this.prestados;
    }
    public void setTitulo(String t)
    {
        this.titulo = t;
    }
    public void setAutor(String a)
    {
        this.autor = a;
    }
    public void setEjemplares(int e)
    {
        this.ejemplares = e;
    }
    public void setPrestados(int p)
    {
        this.prestados = p;
    }
    public boolean prestamo()
    {
        if (this.prestados < this.ejemplares)
        {
            this.prestados++;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean devolucion()
    {
        if (prestados > 0)
        {
            prestados--;
            return true;
        }
        else
            return false;
    }
    
    public void mostrarLibro()
    {
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ejemplares: "+ejemplares);
        System.out.println("Prestados: "+prestados);
    }
    
}
