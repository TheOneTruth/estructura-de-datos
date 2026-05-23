
public class RecorridosArbol {


    public void preorden(NodoBinario nodo) {
        if (nodo == null) return;            // Caso base

        System.out.print(nodo.getCodigo() + " ");  // 1. Raíz
        preorden(nodo.getHijoIzquierdo());          // 2. Izquierdo
        preorden(nodo.getHijoDerecho());             // 3. Derecho
    }

    public void inorden(NodoBinario nodo) {
        if (nodo == null) return;            // Caso base

        inorden(nodo.getHijoIzquierdo());           // 1. Izquierdo
        System.out.print(nodo.getCodigo() + " ");  // 2. Raíz
        inorden(nodo.getHijoDerecho());              // 3. Derecho
    }

    public void postorden(NodoBinario nodo) {
        if (nodo == null) return;            // Caso base

        postorden(nodo.getHijoIzquierdo());         // 1. Izquierdo
        postorden(nodo.getHijoDerecho());            // 2. Derecho
        System.out.print(nodo.getCodigo() + " ");  // 3. Raíz
    }
}
