
package ejercicioa0402;

public class Circulo {
    
    // Atributos
    private double radio;
    final double PI = 3.14159;
    
    // Constructores
    public Circulo()
    {
        radio = 1;
    }
    
    public Circulo(double r)
    {
        radio = r;
    }
    
    public double getRadio()
    {
        return radio;
    }
    
    public void setRadio(double r)
    {
        radio = r;
    }
    
    public double perimetro()
    {
        return 2*PI*radio;
    }
    
    public double area()
    {
        return PI*radio*radio;
    }
    
}
