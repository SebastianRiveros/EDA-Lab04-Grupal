public class Main{
    public static void main(String[] args){
        // Pruebas con un arbol de enteros
        ArbolBinario<Integer> arbolEntero = new ArbolBinario<>();
        arbolEntero.insertar(50);
        arbolEntero.insertar(30);
        arbolEntero.insertar(70);
        arbolEntero.insertar(20);
        arbolEntero.insertar(40);
        arbolEntero.insertar(60);
        arbolEntero.insertar(80);

        System.out.println("Recorrido en postorden:");
        arbolEntero.postorden();

        // Pruebas con un arbol de cadenas
        ArbolBinario<String> arbolCadena = new ArbolBinario<>();
        arbolCadena.insertar("Sebastian");
        arbolCadena.insertar("Dennis");
        arbolCadena.insertar("Mikail");
        arbolCadena.insertar("kobayashi");
        arbolCadena.insertar("Leonardo");
        arbolCadena.insertar("Gustavo");
        arbolCadena.insertar("Antony");

        System.out.println("Recorrido en postorden:");
        arbolCadena.postorden();
    }
}