
public class TestEstante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estante est=new Estante(10);
		Libro lib1=new Libro("La forja de un rebelde", "Arturo Barea", 879);
		Libro lib2=new Libro("Matemáticas, ejercicios", "Rodriguez Calderón, ...", 178);
		Libro lib3=new Libro("Robinson Crusoe", "Daniel Defoe", 225);
		Libro lib4=new Libro("La casa verde", "Mario Vargas Llosa", 272);
		Libro lib5=new Libro("Los mares del Sur", "Manuel Vázquez Montalbán", 244);
		Libro lib6=new Libro("Crónica del rey pasmado", "Gonzalo Torrente Ballester", 233);
		Disco dis1=new Disco("Ziggy Stardust And The Spiders From Mars", "David Bowie", 12);
		Disco dis2=new Disco("Transformer", "Lou Reed", 11);
		Disco dis3=new Disco("The Wall", "Pink Floyd", 9);
		Disco dis4=new Disco("The Idiot", "Iggy Pop", 10);
		
		//Cargamos en la estantaría todos los libros y discos (la hemos dejado llena)
		est.add(lib1);
		est.add(lib2);
		est.add(lib3);
		est.add(lib4);
		est.add(lib5);
		est.add(lib6);
		est.add(dis1);
		est.add(dis2);
		est.add(dis3);
		est.add(dis4);

		for (Object obj :est) {
			 
			 if( obj instanceof Libro) { //Debemos comprobar de qué clase es el objeto para indicarle que haga una cosa u otra
			 	 Libro miLibro = (Libro) obj;
				 System.out.println(miLibro.getTitulo() + " tiene " + miLibro.getNumPaginas() + " páginas");
			 
			 } else {
				 Disco miDisco= (Disco) obj;
				 System.out.println(miDisco.getTitulo() + " tiene " + miDisco.getNumCanciones() + " canciones");
			 }
		 }

	}
		
}

