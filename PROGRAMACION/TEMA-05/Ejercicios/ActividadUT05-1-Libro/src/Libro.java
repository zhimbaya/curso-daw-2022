
public class Libro {

	 private String titulo;
	    private String autor;
	    private int codigo;
	    private boolean prestado;

	    //constructor por defecto (cargará "null" en las cadenas, "0" en los números y "false" en los booleanos)
	    public Libro() {
	    }

	    //constructor con parámetros
	    public Libro(String titulo, String autor, int codigo, boolean prestado) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.codigo = codigo;
			this.prestado = prestado;
		}
	    
	    //getters y setters generados automáticamente con el IDE
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


	    //método para prestar un libro
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

	    
		//método para devolver un libro
	    public boolean devolver() {
	        if (prestado == true){ 
	            prestado = false;
	            return true; //Devuelve true si la devolución es correcta
	        }
	        else {
	            System.out.println("No puede devolver el libro '" + this.getTitulo() + "'. Ya está devuelto");
	            return false; //Devuelve false si la devolución no se ha podido realizar
	        }
	    }

	    
	    //método toString sobrescrito para mostrar los datos de la clase Libro de forma correcta y concisa
	    @Override
	    public String toString() {
	        return "Título: " + titulo + "\nAutor: " + autor + "\nCódigo: " + codigo + "\nPrestado: " + prestado;
	    }


}
