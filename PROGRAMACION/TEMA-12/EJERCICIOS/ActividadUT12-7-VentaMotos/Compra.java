public class Compra {
	String modeloMoto;
	boolean extraCajon;
	boolean extraInmovilizador;
	double precioCompraSinExtras;
	
	public Compra(String model, boolean extraC, boolean extraI, double precSinExtras){
		this.modeloMoto=model;
		this.extraCajon=extraC;
		this.extraInmovilizador=extraI;
		this.precioCompraSinExtras=precSinExtras;
	}

	public String getModeloMoto() {
		return modeloMoto;
	}

	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
	}

	public boolean getExtraCajon() {
		return extraCajon;
	}

	public void setExtraCajon(boolean extraCajon) {
		this.extraCajon = extraCajon;
	}

	public boolean getExtraInmovilizador() {
		return extraInmovilizador;
	}

	public void setExtraInmovilizador(boolean extraInmovilizador) {
		this.extraInmovilizador = extraInmovilizador;
	}

	public double getPrecioCompraSinExtras() {
		return precioCompraSinExtras;
	}

	public void setPrecioCompraSinExtras(double precioCompraSinExtras) {
		this.precioCompraSinExtras = precioCompraSinExtras;
	}

	@Override
	public String toString() {
		return "Compra [modeloMoto=" + modeloMoto + ", extraCajon=" + extraCajon + ", extraInmovilizador="
				+ extraInmovilizador + ", precioCompraSinExtras=" + precioCompraSinExtras + "]";
	}
	
	
	
	
}
