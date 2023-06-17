package Tema06.Ejercicios;

/**
 * Implementar una función que busque un número en un vector ordenado usando el
 * algoritmo de búsqueda binaria sobre un array/vector de enteros.  *
 * La función recibirá el vector y el número a buscar y debe devolver si ha
 * encontrado o no el número y el número de comparaciones con elementos del
 * vector que ha requerido para encontrarlo.  *
 * Probarlo con el vector int v[] = {2,3,4,5,6,7,8,9,10,11,12} y los números 11
 * y 13
 *
 * Algoritmo binario en pseudocódigo:
 *
 * menor_pos = 0
 *
 * mayor_pos = N
 *
 * medio_pos = (menor_pos + mayor_pos) / 2
 *
 * while (menor_pos <= mayor_pos AND vector[medio_pos] != valor) {
 *
 * if (valor < vector[medio_pos])
 *
 * mayor_pos = medio_pos -1;
 *
 * else
 *
 * menor_pos = medio_pos +1;
 *
 * medio_pos = (menor_pos + mayor_pos)/2 @author diego
 */
public class _11BuscarNumVector {

    public static int busquedaBinaria(int[] vector, int valor) {
        int menor_pos = 0;
        int mayor_pos = vector.length - 1;
        int medio_pos = (menor_pos + mayor_pos) / 2;
        int comp = 1;
        while (menor_pos <= mayor_pos && vector[medio_pos] != valor) {
            comp++;
            if (valor < vector[medio_pos]) {
                mayor_pos = medio_pos - 1;
            } else {
                menor_pos = medio_pos + 1;
            }
            medio_pos = (menor_pos + mayor_pos) / 2;
        }
        return (vector[medio_pos] == valor) ? comp : -1;
    }

    public static void main(String[] args) {

        int v[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = busquedaBinaria(v, 11);
        if (n == -1) {
            System.out.println("Valor 11 no encontrado");
        } else {
            System.out.println("Se ha encontrado tras " + n + " comparaciones");
        }
        n = busquedaBinaria(v, 13);
        if (n == -1) {
            System.out.println("Valor 13 no encontrado");
        } else {
            System.out.println("Se ha encontrado tras " + n + " comparaciones");
        }
    }

}
