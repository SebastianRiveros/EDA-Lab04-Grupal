//clase generica nodo
class Nodo<T>{
    T dato;
    Nodo<T> izquierda;
    Nodo<T> derecha;

    // contructor
    public Nodo(T dato){
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}