public class ListaHistorial {
    private Nodo cabeza;
    private int tamanio;

    public ListaHistorial() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void insertar(pagina p) {
        Nodo nuevo = new Nodo(p);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public Nodo buscar(String url) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getDato().getUrl().equalsIgnoreCase(url)) {
                return temp;
            }
            temp = temp.getSiguiente();
        }
        return null;
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("  Historial vacio.");
            return;
        }
        Nodo temp = cabeza;
        int i = 1;
        while (temp != null) {
            System.out.println("  " + i + ". "
                    + temp.getDato().getUrl()
                    + " | " + temp.getDato().getFecha());
            temp = temp.getSiguiente();
            i++;
        }
    }

    public void eliminarTodo() {
        cabeza = null;
        tamanio = 0;
    }

    public int getTamanio() { return tamanio; }
}