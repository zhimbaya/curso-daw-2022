package Tema02;

public class TiposEnumeradosPlanetas {

    public enum Planetas {
        Mercurio, Venus, Tierra, Marte, Jupiter, Saturno, Urano, Neptuno, Plutón
    };

    public static void main(String[] args) {
        //Planetas primerPlaneta = Planetas.Mercurio;
        //Planetas ultimoPlaneta = Planetas.Neptuno;
        Planetas primerPlaneta = Planetas.values()[0];
        Planetas ultimoPlaneta = Planetas.values()[Planetas.values().length - 1];

        System.out.println("El primer planeta es: " + primerPlaneta);
        System.out.println("El ultimo planeta es: " + ultimoPlaneta);
        System.out.println("La posición del primer planeta es: " + primerPlaneta.ordinal());
        System.out.println("La posición del ultimo planeta es: " + ultimoPlaneta.ordinal());
        System.out.println("El número de planetas es: " + Planetas.values().length);

    }

}
