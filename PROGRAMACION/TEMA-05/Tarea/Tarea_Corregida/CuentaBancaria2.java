package Tema05;

class CuentaBancaria2 {
    //Propiedades
    private String numCuenta;
    private String nomTitular;
    private double saldo;
    private double tipoInteres;

    //Metodos
    public CuentaBancaria2(String numCuenta, String nomTitular, double saldo, double tipoInteres) {
        this.numCuenta = numCuenta;
        this.nomTitular = nomTitular;
        this.tipoInteres = tipoInteres;
        ingreso(saldo);
    }

    //Metodos Set
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    //Metodos Get
    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        } else {
            System.out.println("ERROR. La Cantidad debe ser >= 0");
        }
    }

    public void reintegro(double cantidad) {
        if (cantidad > 0) {
            if (cantidad > saldo) {
                System.out.println("Saldo Insuficiente");
            } else {
                saldo = saldo - cantidad;
            }
        } else {
            System.out.println("ERROR. La Cantidad debe ser >= 0");
        }

    }
}
