public class NodoBST {

    private final int codigoProducto;
    private NodoBST hijoIzquierdo;
    private NodoBST hijoDerecho;

    public NodoBST(int codigoProducto) {
        this.codigoProducto = codigoProducto;
        this.hijoIzquierdo  = null;
        this.hijoDerecho    = null;
    }

    public int getCodigoProducto()             { return codigoProducto; }

    public NodoBST getHijoIzquierdo()          { return hijoIzquierdo; }
    public void setHijoIzquierdo(NodoBST n)    { this.hijoIzquierdo = n; }

    public NodoBST getHijoDerecho()            { return hijoDerecho; }
    public void setHijoDerecho(NodoBST n)      { this.hijoDerecho = n; }

    @Override
    public String toString() {
        return "NodoBST{codigo=" + codigoProducto + "}";
    }
}
