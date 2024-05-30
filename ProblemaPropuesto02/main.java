
import java.util.*;
public class main {
    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();

        // Simulación de inserción de 100 datos
        for (int i = 0; i < 100; i++) {
            arbol.insertar((int) (Math.random() * 1000));
        }

        System.out.println("Recorrido en inorden:");
        arbol.recorrerInorden();
        System.out.println();
    }
}