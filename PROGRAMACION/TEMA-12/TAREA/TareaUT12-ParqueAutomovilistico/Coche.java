public class Coche {

	//Atributos
	private String matricula;
	private String nombrePropietario;
	private String numBastidor;
	private double impuestoCirculacion;
	private boolean impuestoCirculacionPagado;
	
	
	//Constructor
	public Coche (String matricula, String nombrePropietario, String numBastidor, double impuestoCirculacion, boolean impuestoCirculacionPagado) {
		this.matricula = matricula;
		this.nombrePropietario = nombrePropietario;
		this.numBastidor = numBastidor;
		this.impuestoCirculacion = impuestoCirculacion;
		this.impuestoCirculacionPagado = impuestoCirculacionPagado;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getNombrePropietario() {
		return nombrePropietario;
	}


	public String getNumBastidor() {
		return numBastidor;
	}


	public double getImpuestoCirculacion() {
		return impuestoCirculacion;
	}


	public boolean getImpuestoCirculacionPagado() {
		return impuestoCirculacionPagado;
	}
	
	
}
