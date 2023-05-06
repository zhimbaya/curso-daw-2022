import java.io.Serializable;
import java.util.Scanner;

public class CalculadoraVectores implements Serializable{
	//Atributos miembro
	final int dim=3;
	int []vector1;
	int []vector2;
	int escalar;
	char operacion;
	Scanner leer;
	
	public CalculadoraVectores(){ //Constructor por defecto
	}
	
	public CalculadoraVectores(int v1[], int v2[]){
		Scanner leer=new Scanner(System.in);
		this.vector1=new int[this.dim];
		this.vector2=new int[this.dim];
		for(int i=0; i<this.dim; i++){
			this.vector1[i]=v1[i];
			this.vector2[i]=v2[i];
		}
	}
	
	public CalculadoraVectores(int v1[], int v2[], int num){
		
		this.vector1=new int[this.dim];
		this.vector2=new int[this.dim];
		for(int i=0; i<this.dim; i++){
			this.vector1[i]=v1[i];
			this.vector2[i]=v2[i];
		this.escalar=num;	
		}
	}
	
	public char menuOperacion(){
		Scanner leer=new Scanner(System.in);
		char oper=' ';
		int opcion;
		boolean opcionValida=false;
		do{
			System.out.println("Introduzca operación:\n1-Sumar Vectores.\n2-Restar Vectores.\n3-Producto Escalar de primer Vector.\n4-Salir");
			opcion=leer.nextInt();
			opcionValida=(opcion>0 && opcion<5);
		}while(!opcionValida);
		switch(opcion){
		case 1:
			oper='+';
			break;
		case 2:
			oper='-';
			break;
		case 3:
			oper='*';
			break;
		case 4:
			oper='#';
			break;
		}
		return oper;
	}
	
	public int[] realizarOperacion(char oper){
		int result[]=new int[this.dim];
		switch (oper){
			case '+':
				result=this.sumaVectores();
				break;
			case '-':
				result=this.restaVectores();
				break;
			case '*':
				result=this.productoEscalarVectores();
				break;
		}
		return result;
	}
	
	
	public int[] sumaVectores(){
		int suma[]=new int[this.dim];
		for(int i=0; i<this.dim; i++) //Inicializamos primero a 0 todos los componentes
			suma[i]=0;
		for(int i=0; i<this.dim; i++) //Hacemos la suma
			suma[i]=this.vector1[i]+this.vector2[i];
		return suma;		
	}
	
	public int[] restaVectores(){
		int resta[]=new int[this.dim];
		for(int i=0; i<this.dim; i++)
			resta[i]=this.vector1[i]-this.vector2[i];
		return resta;		
	}
	
	public int[] productoEscalarVectores(){
		Scanner leer=new Scanner(System.in);
		System.out.println("Indique vector del cual quiere el producto (1-2):");
		int pos=leer.nextInt();
		int productoEscalar[]=new int[dim];
		if(pos==1)
			for(int i=0; i<dim; i++)
				productoEscalar[i]=this.escalar*this.vector1[i];
		if(pos==2)
			for(int i=0; i<dim; i++)
				productoEscalar[i]=this.escalar*this.vector2[i];
		return productoEscalar;		
	}

	public int[] productoEscalarVectores(int num){
		int productoEscalar[]=new int[dim];
		if(num==1)
			for(int i=0; i<dim; i++)
				productoEscalar[i]=this.escalar*this.vector1[i];
		if(num==2)
			for(int i=0; i<dim; i++)
				productoEscalar[i]=this.escalar*this.vector2[i];
		return productoEscalar;		
	}
	
	public int[] getVector1() {
		return vector1;
	}

	public void setVector1(int[] vector1) {
		this.vector1 = vector1;
	}

	public int[] getVector2() {
		return vector2;
	}

	public void setVector2(int[] vector2) {
		this.vector2 = vector2;
	}

	public int getEscalar() {
		return escalar;
	}

	public void setEscalar(int escalar) {
		this.escalar = escalar;
	}

	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

	public int getDim() {
		return dim;
	}
	
	public String mostrarVectorIndividual(int pos){
		String cad="[ ";
		if(pos==1)
			for(int i=0; i<this.vector1.length; i++)
				cad+=this.vector1[i]+" ";
		if(pos==2)
			for(int i=0; i<this.vector2.length; i++)
				cad+=this.vector2[i]+" ";
		cad+="]";
		return cad;
	}	
	
	@Override
	public String toString() {
		return "(vector1: " + this.mostrarVectorIndividual(1) +", vector2: " + this.mostrarVectorIndividual(2) +", escalar: "+ this.escalar + ")";
	}
	
	
}
