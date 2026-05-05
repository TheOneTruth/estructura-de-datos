public class PilaNave {
    private Pagina[] pila;
    private int tope;
    private int capacidad;

    public PilaNave(int capacidad) {
        this.capacidad = capacidad;
        this.pila = new Pagina[capacidad];
        this.tope = -1;
    }

    public void push(Pagina p) {
        if (tope == capacidad - 1) {
            System.out.println("  Pila llena, no se puede agregar: " + p.getUrl());
            return;
        }
        tope++;
        pila[tope] = p;
        System.out.println("  Visitando: [" + p.getTitulo() + "] " + p.getUrl());
    }

    public Pagina pop() {
        if (estaVacia()) {
            System.out.println("  No hay paginas anteriores.");
            return null;
        }
        Pagina eliminada = pila[tope];
        pila[tope] = null;
        tope--;
        return eliminada;
    }

    public Pagina peek() {
        if (estaVacia()) {
            System.out.println("  No hay pagina actual.");
            return null;
        }
        return pila[tope];
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public int getTamanio() {
        return tope + 1;
    }

    public void mostrarHistorial() {
        if (estaVacia()) {
            System.out.println("  Historial vacio.");
            return;
        }
        System.out.println("  Historial (tope → base):");
        for (int i = tope; i >= 0; i--) {
            System.out.println("    " + (i == tope ? ">> " : "   ")
                    + "[" + pila[i].getTitulo() + "] " + pila[i].getUrl());
        }
    }
}