public class Circulo extends ObjetoGeometrico
{
  private double radio;

  public Circulo(double r, String nom)
  {
    super(nom);
    radio = r;
  }

  public Circulo()
  {
    this(1.0, "Círculo estándar");
  }

  public double devolverRadio()
  {
    return radio;
  }
  public double calcularArea()
  {
    return radio * radio * Math.PI;
  }
  public double calcularPerimetro()
  {
    return 2 * Math.PI * radio; 
  }
  public String toString()
  {
    return "Nombre = "+ super.toString() +"  radio = " + radio;
  }
}
