
package ejercicioa0402;


public class TrianguloRectangulo {
    
    // Atributos
    double base;
    double altura;
    
    // Constructores
    
    public TrianguloRectangulo()
    {
        base = 1;
        altura = 1;
    }
    
    public TrianguloRectangulo(double b, double a)
    {
        base = b;
        altura = a;
    }
    
    public double getBase()
    {
        return base;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    public void setBase(double b)
    {
        base = b;
    }
    
    public void setAltura(double a)
    {
        altura = a;
    }
    
    public void setLados(double b, double a)
    {
        base = b;
        altura = a;
    }
    
    public double perimetro()
    {
        return base+altura+Math.sqrt(base*base+altura*altura);
    }
    
    public double area()
    {
        return base*altura/2;
    }
}
