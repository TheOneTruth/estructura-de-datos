public class ArbolBST {

    private NodoBST raiz;
    private int     pasosBusqueda; // Contador para medir recorrido

    public ArbolBST() {
        this.raiz          = null;
        this.pasosBusqueda = 0;
    }

    public void insertar(int codigo) {
        raiz = insertarRecursivo(raiz, codigo);
    }

    private NodoBST insertarRecursivo(NodoBST nodo, int codigo) {
        if (nodo == null) return new NodoBST(codigo); // Posición encontrada

        if (codigo < nodo.getCodigoProducto()) {
            nodo.setHijoIzquierdo(insertarRecursivo(nodo.getHijoIzquierdo(), codigo));
        } else if (codigo > nodo.getCodigoProducto()) {
            nodo.setHijoDerecho(insertarRecursivo(nodo.getHijoDerecho(), codigo));
        }
        // Código duplicado: no se inserta
        return nodo;
    }

    public boolean buscar(int codigo) {
        pasosBusqueda = 0;
        return buscarRecursivo(raiz, codigo);
    }

    private boolean buscarRecursivo(NodoBST nodo, int codigo) {
        if (nodo == null) return false; // No encontrado

        pasosBusqueda++;

        if (codigo == nodo.getCodigoProducto()) return true;
        if (codigo < nodo.getCodigoProducto())
            return buscarRecursivo(nodo.getHijoIzquierdo(), codigo);
        else
            return buscarRecursivo(nodo.getHijoDerecho(), codigo);
    }

    public int getPasosBusqueda() { return pasosBusqueda; }

    public void imprimir() {
        System.out.print("BST (inorden): ");
        imprimirInorden(raiz);
        System.out.println();
    }

    private void imprimirInorden(NodoBST nodo) {
        if (nodo == null) return;
        imprimirInorden(nodo.getHijoIzquierdo());
        System.out.print(nodo.getCodigoProducto() + " ");
        imprimirInorden(nodo.getHijoDerecho());
    }
}
