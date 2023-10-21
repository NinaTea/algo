package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {

    Nodo _raiz;
    int _tamanio;

    private class Nodo {
        // Agregar atributos privados del Nodo
        T valor;
        Nodo izq;
        Nodo der;
        // Crear Constructor del nodo

        private Nodo(T v){
            valor  = v;
            izq = null;
            der = null;

        }

    }

    public ABB() {
        _raiz = null;
        _tamanio = 0;
    }

    public int cardinal() {
        return _tamanio;
    }

    public T minimo(){

        Nodo actual = _raiz;

        while (actual.izq != null) {
            actual = actual.izq;
            }

        return actual.valor; 


    }

    public T maximo(){

        Nodo actual = _raiz;

        while (actual.der != null) {
            actual = actual.der;
            }
            
        return actual.valor; 
    }

    public void insertar(T elem){
        Nodo nuevo = new Nodo(elem);
        
        Nodo actual = _raiz;

        if (actual == null) {
            _raiz = nuevo;
            _tamanio = 1;
            return;
        }

        if (pertenece(elem)){
            return;
        }

        while (true) {
            if (elem.compareTo(actual.valor) > 0 ) {
                if (actual.der == null) {
                    actual.der = nuevo;
                    _tamanio++;
                    return;
                } else{
                    actual = actual.der;
                }
                
                
            } else {
                if (actual.izq == null) {
                    actual.izq = nuevo;
                    _tamanio++;
                    return;
                }else{
                    actual = actual.izq;
                }

            }
        }


    }

    public boolean pertenece(T elem){
        
        Nodo actual = _raiz;
        // elem1.compareTo(elem2) devuelve un entero: 
        // 1) mayor a 0 si elem1 > elem2,
        // 2) menor a 0 si elem1 < elem2 y 
        // 3) 0 si elem1 = elem2
        while (actual != null) {
            
            if (elem.compareTo(actual.valor) == 0) { 
                return true;
            } else if (elem.compareTo(actual.valor) > 0) {
                actual = actual.der;
            } else {
                actual = actual.izq;
            }
        } 


        return false;

    }

    public void eliminar(T elem){

        Nodo actual = _raiz;

        if (!pertenece(elem)){
            return;
        }
        while (actual.valor != elem){

            if ( elem.compareTo(actual.valor) > 0 ){
                actual = actual.der;
            }
            else {
                actual = actual.izq;
            }

        }

        actual = actual.izq;
        _tamanio--;
 

    }

    public String toString(){
        Object[] valores = new Object[_tamanio]; 
        String out = "{";
        int j = 0;
        while (_tamanio != 0){
            T m = minimo();
            eliminar(m);
            valores[j] = m;
            /*No se esta eliminando el minimo */
            j++;
        }
        

        for (Object t : valores) {
                out = out + t +",";  

        }  
        
        out = out + "}";
        return out;
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;

        public boolean haySiguiente() {            
            throw new UnsupportedOperationException("No implementada aun");
        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
