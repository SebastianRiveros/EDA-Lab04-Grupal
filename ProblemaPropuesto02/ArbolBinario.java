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
}
