
public class ArbolBinario<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Método para insertar un nodo en el árbol
    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> raiz, T dato) {
        // si es el primer nodo se le considera como raiz
        if (raiz == null) {
            raiz = new Nodo<>(dato);
            return raiz;
        }
        // se decide si el nuevo nodo ira a la izquierda o derecha
        if (dato.compareTo(raiz.dato) < 0) {
            raiz.izquierda = insertarRecursivo(raiz.izquierda, dato);
        } else if (dato.compareTo(raiz.dato) > 0) {
            raiz.derecha = insertarRecursivo(raiz.derecha, dato);
        }
        return raiz;
    }

    // Método para recorrer el árbol en inorden
    public void recorrerInorden() {
        recorrerInordenRecursivo(raiz);
    }

    private void recorrerInordenRecursivo(Nodo<T> nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            recorrerInordenRecursivo(nodo.derecha);
        }
    }

    // Método para recorrer el árbol en preorden
    public void recorrerPreorden() {
        recorrerPreordenRecursivo(raiz);
    }

    private void recorrerPreordenRecursivo(Nodo<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorrerInordenRecursivo(nodo.izquierda);
            recorrerInordenRecursivo(nodo.derecha);
        }
    }

    // Método para recorrer el árbol en postorden
    public void recorrerPostorden() {
        recorrerPostordenRecursivo(raiz);
    }

    private void recorrerPostordenRecursivo(Nodo<T> nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.izquierda);
            recorrerInordenRecursivo(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

}