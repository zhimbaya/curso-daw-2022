
//Con la clase genérica, ahora un objeto Estante, solo admitirá un tipo de elementos, o solo libros, o solo discos.
public class TestEstante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estante<Libro> estLibros=new Estante<Libro>(10);
		Libro lib1=new Libro("La forja de un rebelde", "Arturo Barea", 879);
		Libro lib2=new Libro("Matemáticas, ejercicios", "Rodriguez Calderón, ...", 178);
		Libro lib3=new Libro("Robinson Crusoe", "Daniel Defoe", 225);
		Libro lib4=new Libro("La casa verde", "Mario Vargas Llosa", 272);
		Libro lib5=new Libro("Los mares del Sur", "Manuel Vázquez Montalbán", 244);
		Libro lib6=new Libro("Crónica del rey pasmado", "Gonzalo Torrente Ballester", 233);
		
		//Cargamos en la estantaría de libros todos los libros (quedará hueco para meter más, ya que admite hasta 10 libros)
		estLibros.add(lib1);
		estLibros.add(lib2);
		estLibros.add(lib3);
		estLibros.add(lib4);
		estLibros.add(lib5);
		estLibros.add(lib6);
		
		//Instancio un disco para ver si deja meterlo en la estantería de libros (la cual he definido de tipo genérico para solo admitir libros
		Disco dis1=new Disco("Ziggy Stardust And The Spiders From Mars", "David Bowie", 12);
		//La siguiente línea fallará no por problemas de espacio, sino porque hemos obligado a que el tipo admitido sea solo de libros
		//estLibros.add(dis1);
		
		//Veo el contenido de la estantería de libros
		System.out.println("\nLa estantería de libros tiene: ");
		for (Libro obj :estLibros) {
			 System.out.println(obj.getTitulo() + " tiene " + obj.getNumPaginas() + " páginas");
		}
		
		
		//Si ahora definimos una estantería para almacenar discos (cabrán hasta 10)
		Estante<Disco> estDiscos=new Estante<Disco>(10);
		//Intento ahí meter el disco anterior y veré que aquí si puedo meterlo:
		estDiscos.add(dis1);
		//Pero evidentemente, en esta no podré meter libros. Por eso la sentencia siguiente dará error
		//estDiscos.add(lib1);
		
		
		//Veo el contenido de la estantería de discos
		System.out.println("\nLa estantería de discos tiene: ");
		for (Disco obj :estDiscos) {
			 System.out.println(obj.getTitulo() + " tiene " + obj.getNumCanciones() + " canciones");
		}
	}
		
}

