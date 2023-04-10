
//Con la clase gen�rica, ahora un objeto Estante, solo admitir� un tipo de elementos, o solo libros, o solo discos.
public class TestEstante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estante<Libro> estLibros=new Estante<Libro>(10);
		Libro lib1=new Libro("La forja de un rebelde", "Arturo Barea", 879);
		Libro lib2=new Libro("Matem�ticas, ejercicios", "Rodriguez Calder�n, ...", 178);
		Libro lib3=new Libro("Robinson Crusoe", "Daniel Defoe", 225);
		Libro lib4=new Libro("La casa verde", "Mario Vargas Llosa", 272);
		Libro lib5=new Libro("Los mares del Sur", "Manuel V�zquez Montalb�n", 244);
		Libro lib6=new Libro("Cr�nica del rey pasmado", "Gonzalo Torrente Ballester", 233);
		
		//Cargamos en la estantar�a de libros todos los libros (quedar� hueco para meter m�s, ya que admite hasta 10 libros)
		estLibros.add(lib1);
		estLibros.add(lib2);
		estLibros.add(lib3);
		estLibros.add(lib4);
		estLibros.add(lib5);
		estLibros.add(lib6);
		
		//Instancio un disco para ver si deja meterlo en la estanter�a de libros (la cual he definido de tipo gen�rico para solo admitir libros
		Disco dis1=new Disco("Ziggy Stardust And The Spiders From Mars", "David Bowie", 12);
		//La siguiente l�nea fallar� no por problemas de espacio, sino porque hemos obligado a que el tipo admitido sea solo de libros
		//estLibros.add(dis1);
		
		//Veo el contenido de la estanter�a de libros
		System.out.println("\nLa estanter�a de libros tiene: ");
		for (Libro obj :estLibros) {
			 System.out.println(obj.getTitulo() + " tiene " + obj.getNumPaginas() + " p�ginas");
		}
		
		
		//Si ahora definimos una estanter�a para almacenar discos (cabr�n hasta 10)
		Estante<Disco> estDiscos=new Estante<Disco>(10);
		//Intento ah� meter el disco anterior y ver� que aqu� si puedo meterlo:
		estDiscos.add(dis1);
		//Pero evidentemente, en esta no podr� meter libros. Por eso la sentencia siguiente dar� error
		//estDiscos.add(lib1);
		
		
		//Veo el contenido de la estanter�a de discos
		System.out.println("\nLa estanter�a de discos tiene: ");
		for (Disco obj :estDiscos) {
			 System.out.println(obj.getTitulo() + " tiene " + obj.getNumCanciones() + " canciones");
		}
	}
		
}

