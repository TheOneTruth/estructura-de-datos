public class Nodo {
    private pagina dato;
    private Nodo siguiente;

    public pagina getDato() { return dato; }
    public void setDato(pagina dato) { this.dato = dato; }

    public Nodo getSiguiente() { return siguiente; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }

    public Nodo(pagina dato) {
        this.dato = dato;
    }
}