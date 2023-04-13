package Tema09;

import java.io.*;

class ColaDinamica implements PilasColasDinamicas {

    private Nodo primero;
    private Nodo ultimo;

    public ColaDinamica() {
        primero = null;
        ultimo = null;
    }

    @Override
    public boolean vacia() {
        return (primero == null);
    }
    
    @Override
    public void insertar(Object obj) {
        Nodo nuevo = new Nodo(obj, null);

        if (vacia()) {
            primero = nuevo;
        } else {
            ultimo.enlace = nuevo;
        }

        ultimo = nuevo;
    }

    @Override
    public Object eliminar() {
        try {
            if (vacia()) {
                throw new ColaVacia();
            } else {
                Object aux = primero.inf;
                primero = primero.enlace;

                if (vacia()) {
                    ultimo = null;
                }

                return aux;
            }
        } catch (ColaVacia error) {
            System.out.println("La Cola esta Vacia");
            return null;
        }
    }
}

class ColaVacia extends Exception {

    public ColaVacia() {
        super();
    }
}
