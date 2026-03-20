import java.util.*;

public class ListaRanking {

    private Nodo cabeza;

    public ListaRanking() {
        cabeza = null;
    }

    public void insertarFinal(Jugador contacto) {
        Nodo nuevo = new Nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Jugador buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void listar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    // 1) Encontrar el valor máximo de la lista (Jugador con mayor score)
    public Jugador findMax() {
        if (cabeza == null) return null;
        Nodo actual = cabeza;
        Jugador max = actual.getDato();
        while (actual != null) {
            if (actual.getDato().getScore() > max.getScore()) {
                max = actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return max;
    }

    // 2) Contar cuántos nodos tiene la lista
    public int countNodes() {
        int count = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.getSiguiente();
        }
        return count;
    }

    // 3) Ordenar la lista de mayor a menor (reconstruye la lista)
    public void sortDescending() {
        if (cabeza == null || cabeza.getSiguiente() == null) return;
        List<Jugador> temp = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            temp.add(actual.getDato());
            actual = actual.getSiguiente();
        }
        // ordenar por score descendente
        temp.sort((a, b) -> Integer.compare(b.getScore(), a.getScore()));
        // reconstruir lista
        cabeza = null;
        for (Jugador j : temp) {
            insertarFinal(j);
        }
    }

    // 4) Buscar todos los valores repetidos (por score). Devuelve mapa score -> lista de jugadores repetidos
    public Map<Integer, List<Jugador>> findDuplicatesByScore() {
        Map<Integer, List<Jugador>> grouped = new HashMap<>();
        Nodo actual = cabeza;
        while (actual != null) {
            int s = actual.getDato().getScore();
            grouped.computeIfAbsent(s, k -> new ArrayList<>()).add(actual.getDato());
            actual = actual.getSiguiente();
        }
        // filtrar solo los scores con más de 1 jugador
        grouped.entrySet().removeIf(e -> e.getValue().size() < 2);
        return grouped;
    }

    // 5) Encontrar el nodo medio (si hay par devuelve el segundo medio)
    public Jugador findMiddleNode() {
        if (cabeza == null) return null;
        Nodo slow = cabeza;
        Nodo fast = cabeza;
        while (fast != null && fast.getSiguiente() != null) {
            slow = slow.getSiguiente();
            fast = fast.getSiguiente().getSiguiente();
        }
        return slow != null ? slow.getDato() : null;
    }

    // Mantener o eliminar según tu diseño
    public ListaRanking lobby() {
        return this;
    }
}
