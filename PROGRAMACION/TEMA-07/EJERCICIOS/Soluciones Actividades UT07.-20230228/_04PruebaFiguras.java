package Tema07.Ejercicios;

public class _04PruebaFiguras {

    public static void main(String[] args) {
        _04Figura[] figuras = new _04Figura[3];
        //Debido al polimorfismo, podremos utilizar en la instanciacion los constructores de la clases hijas
        figuras[0] = new _04Triangulo(3, 2);
        figuras[1] = new _04Rectangulo(3, 2);
        figuras[2] = new _04Rectangulo(1, 2);

        /**
         * La siguiente linea comentada dar� error porque no se puede instanciar
         * una clase abstracta
         */
        //figuras[2]=new Figura();
        imprimirAreas(figuras);
    }

    public static void imprimirAreas(_04Figura[] figs) {
        for (int i = 0; i < figs.length; i++) {
            System.out.println("Area: " + figs[i].area());
        }
    }

}
