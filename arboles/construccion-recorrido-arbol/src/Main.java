public class Main {

    static void main() {

        ConstructorArbol constructor = new ConstructorArbol();
        NodoBinario raiz = constructor.construir();

        RecorridosArbol recorridos = new RecorridosArbol();

        System.out.println("=== Ejercicio 2 — Recorridos del árbol binario ===");
        System.out.println();

        System.out.print("Preorden  : ");
        recorridos.preorden(raiz);
        System.out.println();

        System.out.print("Inorden   : ");
        recorridos.inorden(raiz);
        System.out.println();

        System.out.print("Postorden : ");
        recorridos.postorden(raiz);
        System.out.println();
    }
}