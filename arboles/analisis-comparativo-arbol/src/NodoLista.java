public class NodoLista {

    private final int codigoProducto;
    private NodoLista siguiente;

    public NodoLista(int codigoProducto) {
        this.codigoProducto = codigoProducto;
        this.siguiente      = null;
    }

    public int getCodigoProducto()             { return codigoProducto; }

    public NodoLista getSiguiente()            { return siguiente; }
    public void setSiguiente(NodoLista n)      { this.siguiente = n; }

    @Override
    public String toString() {
        return "NodoLista{codigo=" + codigoProducto + "}";
    }
}
