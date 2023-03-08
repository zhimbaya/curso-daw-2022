/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

/**
 *
 * @author diego
 */
public abstract class CCuenta {

    /*
    Pretendemos diseñar una pequeña aplicación para administrar las cuentas de una entidad bancaria. 
    Sabiendo que las entidades financieras utilizan distintos tipos de cuenta, 
    la herencia puede ser una solución para reutilizar  código. La idea es diseñar 
    una aplicación  para administrar las cuentas corrientes y de ahorro de los clientes 
    de una entidad financiera. Como ambas cuentas tienen bastantes cosas en común, hemos 
    decidido agrupar éstas en una clase CCuenta de la cual derivaremos las cuentas específicas 
    que vayan surgiendo. Sería absurdo crear objetos de CCuenta; más bien la intención es que  
    se agrupe el código común que heredarán sus subclases, razón por la cual la declararemos 
    abstracta. Pensemos entonces inicialmente en el diseño de la clase CCuenta. Después de un 
    análisis de los factores que intervienen en una cuenta en general, llegamos a la conclusión 
    de que los atributos y métodos comunes a cualquier tipo de cuenta son los siguientes:
     */
    // Atributos
    protected String nombreTitular;
    protected String numCuenta;
    protected double saldo;
    protected double tipoDeInteres;

    // Constructor
    public CCuenta() {
    }

    public CCuenta(String nombreTitular, String numCuenta, double saldo, double tipoInteres) {
        this.nombreTitular = nombreTitular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoInteres;
    }

    //Métodos
    public void setNombre(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNombre() {
        return nombreTitular;
    }

    public void setCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void comisiones();

    public void ingreso(double cantidad) {
        saldo += cantidad;
    }

    public void reintegro(double cantidad) {
        saldo -= cantidad;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoDeInteres = tipoInteres;
    }

    public double getTipoInteres() {
        return tipoDeInteres;
    }

    public abstract double intereses();
}
