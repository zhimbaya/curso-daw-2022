abstract class ObjetoGeometrico
{
  private String nombre;
  public ObjetoGeometrico(String nom)
  {
    nombre = nom;
  }

  abstract public double calcularArea();
  abstract public double calcularPerimetro();

  public String toString()
  {
    return nombre;
  }
}
