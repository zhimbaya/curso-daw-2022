
public class TestClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciamos una ClaseGenerica para Integer.
		ClaseGenerica<Integer> objetoInteger = new ClaseGenerica<Integer>(18);
		objetoInteger.tipoDeClase();
		//Para mostrar su valor:
		System.out.println(objetoInteger.toString()); //Con toString() me da la dirección de memoria del dato
		System.out.println(objetoInteger.obj.intValue() );
			 
		//Instanciamos una ClaseGenerica para String.
		ClaseGenerica<String> objetoString = new ClaseGenerica<String>("Hola amiguitos!");
		objetoString.tipoDeClase();
		//Para mostrar su valor:
		System.out.println(objetoString.toString()); //Con toString() me da la dirección de memoria del dato
		System.out.println(objetoString.obj);
		
			    
		//Vemos que una instancia de ClaseGenerica para un tipo primitivo da error.
	    //MiClaseGenerica<char> strObj = new MiClaseGenerica<String>("Test");
		//objetoChar.classType();
			 
		
	}

}
