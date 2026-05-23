public class Main {

    static void main() {

        ConstructorArbol constructor = new ConstructorArbol();
        NodoBinario raiz = constructor.construir();

        AnalizadorArbol analizador = new AnalizadorArbol();

        System.out.println("=== Ejercicio 3 — Análisis recursivo del árbol ===");
        System.out.println();

        int totalNodos  = analizador.contarNodos(raiz);
        int alturaArbol = analizador.altura(raiz);

        System.out.println("Cantidad de nodos : " + totalNodos);
        System.out.println("Altura del árbol  : " + alturaArbol);
    }
}
