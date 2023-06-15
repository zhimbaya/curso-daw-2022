package Tema05;

//Nota: Adaptación de ejercicio de www.discoduroderoer.es/
public class Persona {

    //Atributos
    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Edad de la persona
     */
    private int edad;

    /**
     * DNI de la persona, se genera al construir el objeto
     */
    private String dni;

    /**
     * Sexo de la persona, H hombre M mujer
     */
    private char sexo;

    /**
     * Peso de la persona
     */
    private double peso;

    /**
     * Altura de la persona
     */
    private double altura;

    //Contructores
    /**
     * Constructor por defecto
     */
    public Persona() {
        this("", "", 0, 'V', 0, 0);
    }

    /**
     * Constructor con 3 parametroe
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     */
    public Persona(String nombre, String dni, int edad, char sexo) {
        this(nombre, dni, edad, sexo, 0, 0);
    }

    /**
     * Constructor con 5 parametros
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param peso de la persona
     * @param altura de la persona
     */
    public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo();
    }

    //Métodos publicos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Otros métodos públicos
    /**
     * Calcula el indice de masa corporal
     */
    public double calcularIMC() {
        //Calculamos el peso de la persona
        double imc = peso / (Math.pow(altura, 2));
        return imc;

    }

    /**
     * Valoración de IMC()
     */
    public String valoracionIMC(double imc) {
        String valoracion = "";
        if (imc < 20) {
            valoracion = "Peso por debajo de lo normal";
        } else if (imc >= 25) {
            valoracion = "Peso por encima de lo normal";
        } else {
            valoracion = "Peso normal";
        }
        return valoracion;
    }

    /**
     * Indica si la persona es mayor de edad
     *
     * @return true si es mayor de edad y false es menor de edad
     */
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    //Métodos privados
    private void comprobarSexo() {

        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }

    /**
     * Devuelve informacion del objeto
     *
     * @return cadena con toda la informacion
     */
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "DNI: " + dni + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n"
                + "IMC: " + calcularIMC() + "\n"
                + "Valoración de peso: " + valoracionIMC(calcularIMC());
    }
}
