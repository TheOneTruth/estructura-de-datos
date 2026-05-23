public class ListaEnlazada {

    private NodoLista cabeza;
    private int       pasosBusqueda; // Contador para medir recorrido

    public ListaEnlazada() {
        this.cabeza        = null;
        this.pasosBusqueda = 0;
    }

    public void insertar(int codigo) {
        NodoLista nuevo = new NodoLista(codigo);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        NodoLista actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
    }

    public boolean buscar(int codigo) {
        pasosBusqueda = 0;
        NodoLista actual = cabeza;
        while (actual != null) {
            pasosBusqueda++;
            if (actual.getCodigoProducto() == codigo) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int getPasosBusqueda() { return pasosBusqueda; }

    public void imprimir() {
        NodoLista actual = cabeza;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.getCodigoProducto());
            if (actual.getSiguiente() != null) System.out.print(" -> ");
            actual = actual.getSiguiente();
        }
        System.out.println(" -> null");
    }
}
