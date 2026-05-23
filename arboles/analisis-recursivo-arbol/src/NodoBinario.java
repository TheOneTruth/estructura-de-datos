public class NodoBinario {

    private final int codigo;
    private NodoBinario hijoIzquierdo;
    private NodoBinario hijoDerecho;

    public NodoBinario(int codigo) {
        this.codigo        = codigo;
        this.hijoIzquierdo = null;
        this.hijoDerecho   = null;
    }

    public NodoBinario getHijoIzquierdo()         { return hijoIzquierdo; }
    public void setHijoIzquierdo(NodoBinario n)   { this.hijoIzquierdo = n; }

    public NodoBinario getHijoDerecho()           { return hijoDerecho; }
    public void setHijoDerecho(NodoBinario n)     { this.hijoDerecho = n; }

    @Override
    public String toString() {
        return "NodoBinario{codigo=" + codigo + "}";
    }
}