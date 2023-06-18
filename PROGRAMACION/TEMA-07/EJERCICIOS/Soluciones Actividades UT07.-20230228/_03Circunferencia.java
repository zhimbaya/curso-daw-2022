package Tema07.Ejercicios;

class _03Circunferencia implements _03Geometria {

    private double radio;

    //Constructor
    public _03Circunferencia(double radio) {
        this.radio = radio;
    }

    public _03Circunferencia() {
    }

    public void setRadio(double base) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
