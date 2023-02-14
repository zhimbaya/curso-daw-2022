import java.util.Scanner;
import java.util.regex.Pattern;

public class ComprobacionFormatoFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		boolean formatoCorrecto=false;
		String fecha="";
		
		//Con la "(?i)" hará un ignore case de culaquiera de las letras, es decir, admitirá "mar", "Mar", "MAR", "mAR", etc
		String literalMonthRegexp = "\\d{1,2}/(?i)(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/\\d{4}";
		
		while(!formatoCorrecto) {
			System.out.println("Indique una fecha. El formato válido es '1/ene/2019'.");
			fecha=sc.nextLine();
		
			formatoCorrecto=Pattern.matches(literalMonthRegexp,fecha);
			if(!formatoCorrecto)
				System.out.println("Formato incorrecto. vuelva a intentarlo.");
		}
	
		System.out.println("La fecha " + fecha + " es correcta.");
	}

}
