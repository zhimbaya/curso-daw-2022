import java.util.Scanner;

public class EcuacionSegundoGrado {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner( System.in );
	
		double a,b,c; // coeficientes correspondientes a: ax^2+bx+c=0
		double x1,x2,d; // soluciones y determinante
		System.out.println("Intro primer coeficiente(a):");
		a=teclado.nextInt();
		System.out.println("Intro segundo coeficiente(b):");
		b=teclado.nextInt();
		System.out.println("Intro tercer coeficiente(c):");
		c=teclado.nextInt();
		
		// calculo del determinante. Si este es negativo, las soluciones ya son complejas (consultar qué son los números complejos)
		d=((b*b)-4*a*c);
		if(d<0)
		System.out.println("No existen soluciones reales");
		else{
			// si a vale 0 se tratará de una ecuación de primer grado (solución única).
			if(a==0.)
				System.out.println("Solución única: " + -c/b);
			else {
				x1=(-b+Math.sqrt(d))/(2*a);
				x2=(-b-Math.sqrt(d))/(2*a);
				System.out.println("Primera solución: " + x1);
				System.out.println("Segunda solución: " + x2);
			}
		}
	}
}
