public class Main {
    public static void main(String[] args) {
        ListaRanking lista = new ListaRanking();
        lista.insertarFinal(new Jugador("Good", "ATK", 1200));
        lista.insertarFinal(new Jugador("Raven", "DEF", 900));
        lista.insertarFinal(new Jugador("One", "HEALER", 1200));
        lista.insertarFinal(new Jugador("DirtyDavid", "DEF", 1500));
        lista.insertarFinal(new Jugador("Cross","DEF", 700));

        System.out.println("Lista completa:");
        lista.listar();

        System.out.println("\nCantidad de nodos: " + lista.countNodes());

        Jugador max = lista.findMax();
        System.out.println("\nMayor puntaje: " + (max != null ? max : "lista vacía"));

        System.out.println("\nNodo medio: " + (lista.findMiddleNode() != null ? lista.findMiddleNode() : "lista vacía"));

        System.out.println("\nDuplicados por score:");
        System.out.println(lista.findDuplicatesByScore());

        System.out.println("\nOrdenando descendente...");
        lista.sortDescending();
        lista.listar();

        System.out.println("\nBuscar 'Bob': " + (lista.buscar("Bob") != null ? lista.buscar("Bob") : "no encontrado"));
    }
}
