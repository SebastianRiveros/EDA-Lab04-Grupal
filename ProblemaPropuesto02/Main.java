
import java.util.*;
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
      
        // Pruebas con un arbol de cadenas
        ArbolBinario<String> arbolCadena = new ArbolBinario<>();
        arbolCadena.insertar("Sebastian");
        arbolCadena.insertar("Dennis");
        arbolCadena.insertar("Mikail");
        arbolCadena.insertar("kobayashi");
        arbolCadena.insertar("Leonardo");
        arbolCadena.insertar("Gustavo");
        arbolCadena.insertar("Antony");

        System.out.println("Recorrido en inorden en la cadena String::");
        arbolCadena.recorrerInorden();
        System.out.println("");
        System.out.println("Recorrido en inorden en la cadena enteros::");
        arbolEntero.recorrerInorden();
        System.out.println("");
        System.out.println("Recorrido en postorden en la cadena String::");
        arbolCadena.recorrerPostorden();
        System.out.println("");
        System.out.println("Recorrido en postorden en la cadena enteros:");
        arbolEntero.recorrerPostorden();
    }
}