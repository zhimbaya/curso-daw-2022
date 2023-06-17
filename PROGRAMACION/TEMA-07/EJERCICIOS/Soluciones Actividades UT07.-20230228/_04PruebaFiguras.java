
public class PruebaFiguras {

	public static void main(String[] args) {
		Figura[] figuras=new Figura[3];
		//Debido al polimorfismo, podremos utilizar en la instanciacion los constructores de la clases hijas
		figuras[0]=new Triangulo(3, 2);
		figuras[1]=new Rectangulo(3, 2);
		figuras[2]=new Rectangulo(1, 2);

		/*La siguiente linea comentada dará error porque no se
		 * puede instanciar una clase abstracta 
		 */
		//figuras[2]=new Figura();
		
		imprimirAreas(figuras);
	}
	
	
	public static void imprimirAreas(Figura[] figs){
		for(int i=0; i<figs.length; i++)
			System.out.println("Area: "+figs[i].area());
	}

}
