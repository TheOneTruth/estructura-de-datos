public class ConstructorArbol {

    public NodoBinario construir() {

        // Creación de nodos
        NodoBinario raiz  = new NodoBinario(192550);
        NodoBinario nodo1 = new NodoBinario(191830);
        NodoBinario nodo2 = new NodoBinario(191070);
        NodoBinario nodo3 = new NodoBinario(191820);
        NodoBinario nodo4 = new NodoBinario(191840);

        // Enlace jerárquico
        raiz.setHijoIzquierdo(nodo1);
        raiz.setHijoDerecho(nodo2);
        nodo1.setHijoIzquierdo(nodo3);
        nodo1.setHijoDerecho(nodo4);

        return raiz;
    }
}
