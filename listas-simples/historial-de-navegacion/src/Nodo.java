public class Nodo {
    private Busqueda dato;
    private Nodo siguiente;

    public Busqueda getDato() {
        return dato;
    }

    public void setDato(Busqueda dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(Busqueda dato) {
        this.dato = dato;
    }
}
