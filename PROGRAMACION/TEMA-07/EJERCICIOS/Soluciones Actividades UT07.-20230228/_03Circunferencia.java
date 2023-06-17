class Circunferencia implements Geometria
{
	private double radio;
	
	//Constructor
	public Circunferencia(double radio)
	{
  		this.radio = radio;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public Circunferencia()
	{
	}
	
	////////////////////////////////////////////////////////////////////////////
	
  	public void setRadio(double base)
	{
		this.radio = radio;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double getRadio()	
	{
		return radio;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double calcularArea()
	{
		return Math.PI * radio * radio;
	}
	
	
	public double calcularPerimetro()
	{
		return 2 * Math.PI * radio;
	}
}