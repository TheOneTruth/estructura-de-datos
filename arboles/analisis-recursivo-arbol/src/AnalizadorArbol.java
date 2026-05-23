public class AnalizadorArbol {

    public int contarNodos(NodoBinario nodo) {
        if (nodo == null) return 0;                    // Caso base

        return 1
             + contarNodos(nodo.getHijoIzquierdo())   // Subárbol izquierdo
             + contarNodos(nodo.getHijoDerecho());      // Subárbol derecho
    }

    public int altura(NodoBinario nodo) {
        if (nodo == null) return -1;                   // Caso base

        int altIzq = altura(nodo.getHijoIzquierdo());
        int altDer = altura(nodo.getHijoDerecho());

        return 1 + Math.max(altIzq, altDer);
    }
}
