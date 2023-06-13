package Tema05;

public class Libro2 {

    private String titulo;
    private String autor;
    private int codigo;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    //constructor por defecto
    public Libro2() {
    }

    //constructor con par�metros
    public Libro2(String titulo, String autor, int codigo, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    //getters y setters generados autom�ticamente con el IDE
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    //m�todo para prestar un libro
    public boolean prestar() {
        boolean prestado = true;
        if (numEjemplaresPrestados < numEjemplares) {
            numEjemplaresPrestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //m�todo para devolver un libro
    public boolean devolver() {
        boolean devuelto = true;
        if (numEjemplaresPrestados == 0) {
            devuelto = false;
        } else {
            numEjemplaresPrestados--;
        }
        return devuelto;
    }

    //m�todo toString sobrescrito para mostrar los datos de la clase Libro de forma correcta y concisa
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nN�mero de ejemplares: " + numEjemplares + "\nN�mero de ejemplares prestados: " + numEjemplaresPrestados;
    }

}
