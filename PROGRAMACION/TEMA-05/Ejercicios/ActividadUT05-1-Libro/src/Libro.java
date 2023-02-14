
public class Libro {

	 private String titulo;
	    private String autor;
	    private int codigo;
	    private boolean prestado;

	    //constructor por defecto (cargar� "null" en las cadenas, "0" en los n�meros y "false" en los booleanos)
	    public Libro() {
	    }

	    //constructor con par�metros
	    public Libro(String titulo, String autor, int codigo, boolean prestado) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.codigo = codigo;
			this.prestado = prestado;
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

		public boolean isPrestado() {
			return prestado;
		}

		public void setPrestado(boolean prestado) {
			this.prestado = prestado;
		}


	    //m�todo para prestar un libro
	    public boolean prestar() {
	        if (prestado == false){
	        	prestado = true;
        		return true; //Devuelve true si el prestamo es correcto
	        }
	        else{
	        	System.out.println("No se puede prestar el libro '" + this.getTitulo()+"' otra vez");
	        	return false; //Devuelve false si el prestamo no se ha podido realizar
	        }
	    }

	    
		//m�todo para devolver un libro
	    public boolean devolver() {
	        if (prestado == true){ 
	            prestado = false;
	            return true; //Devuelve true si la devoluci�n es correcta
	        }
	        else {
	            System.out.println("No puede devolver el libro '" + this.getTitulo() + "'. Ya est� devuelto");
	            return false; //Devuelve false si la devoluci�n no se ha podido realizar
	        }
	    }

	    
	    //m�todo toString sobrescrito para mostrar los datos de la clase Libro de forma correcta y concisa
	    @Override
	    public String toString() {
	        return "T�tulo: " + titulo + "\nAutor: " + autor + "\nC�digo: " + codigo + "\nPrestado: " + prestado;
	    }


}