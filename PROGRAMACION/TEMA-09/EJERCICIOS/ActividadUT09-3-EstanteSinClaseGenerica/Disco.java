
public class Disco {

	private String titulo;
	private String autor;
	private int numCanciones;
	
	public Disco(String titulo, String autor, int numCanciones) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numCanciones = numCanciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setNombre(String nombre) {
		this.titulo = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumCanciones() {
		return numCanciones;
	}

	public void setNumPaginas(int numCanciones) {
		this.numCanciones = numCanciones;
	}
	
	
}
