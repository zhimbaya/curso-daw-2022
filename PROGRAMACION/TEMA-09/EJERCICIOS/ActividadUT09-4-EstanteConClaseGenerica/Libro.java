
public class Libro {
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro(String titulo, String autor, int numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
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

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	

}
