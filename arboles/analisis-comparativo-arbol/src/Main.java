public class Main {

    static void main() {

        // Códigos de productos del inventario
        int[] productos = { 3050, 1200, 4800, 750, 2100, 6300, 990, 5500, 1750, 4100 };
        int   buscar    = 5500;

        ListaEnlazada lista = new ListaEnlazada();
        for (int cod : productos) lista.insertar(cod);

        lista.imprimir();
        boolean enLista = lista.buscar(buscar);

        System.out.println("Buscar " + buscar + " en Lista  → "
                + (enLista ? "Encontrado" : "No encontrado")
                + " | Pasos: " + lista.getPasosBusqueda());

        System.out.println();

        ArbolBST arbol = new ArbolBST();
        for (int cod : productos) arbol.insertar(cod);

        arbol.imprimir();
        boolean enBST = arbol.buscar(buscar);

        System.out.println("Buscar " + buscar + " en BST    → "
                + (enBST ? "Encontrado" : "No encontrado")
                + " | Pasos: " + arbol.getPasosBusqueda());

        System.out.println();

        System.out.println("=== Comparación de pasos de búsqueda ===");
        System.out.println("Lista enlazada : " + lista.getPasosBusqueda() + " pasos  → O(n)");
        System.out.println("Árbol BST      : " + arbol.getPasosBusqueda() + " pasos  → O(log n) promedio");
    }
}