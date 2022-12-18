package propuesta01;

public class EjerIndividuo {

	public static void main(String[] args) {
		Individuo persona1 = new Individuo("Diego",1985);
		//Individuo persona2 = new Individuo("02562559Z","Armando",1945);
		//Individuo persona3 = new Individuo("02562559Z","Thiago",2020);
		//Individuo persona4 = new Individuo("02562559Z","Diogo",2040);
		System.out.println(persona1);
		System.out.println("Nº de Personas: "+Individuo.poblacion());
		
		
	}

}
