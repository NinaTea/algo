package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    // Completar atributos privados

    private Nodo primero;
    private Nodo ultimo;
    //private ListaEnlazada lista = new ListaEnlazada<>();
    private int size;

    Iterador it = iterador();

    private class Nodo {
        // Completar
        T valor;
        Nodo sig;
        Nodo ant;

        Nodo(T v){
            valor=v;
        }
    }

    public ListaEnlazada() {
        primero = null;
        ultimo = null;
    }

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados
        int dedito;

        ListaIterador(){
            dedito = 0;
        }

        public boolean haySiguiente() {
	        return dedito != longitud();
        }
        
        public boolean hayAnterior() {
	        return 0 < dedito;
        }

        public T siguiente() {
	        //int i = dedito;
            //dedito = dedito + 1;
            //return 
            throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        //int i = dedito;
            //dedito = dedito - 1;
            //return 
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
        return iterador();

    }

    public int longitud() {
        return size;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);
        nuevo.sig = primero;
        primero = nuevo; 
        size = size + 1;

    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        nuevo.ant = ultimo;
        ultimo = nuevo; 
        size = size + 1;
    }

    public T obtener(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void eliminar(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada<T> copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }


}
