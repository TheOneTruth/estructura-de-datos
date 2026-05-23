public class ColaImpresora {
    private Documento[] cola;
    private int frente;
    private int fin;
    private int tamanio;
    private int capacidad;

    public ColaImpresora(int capacidad) {
        this.capacidad = capacidad;
        this.cola = new Documento[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.tamanio = 0;
    }

    public void enqueue(Documento d) {
        if (tamanio == capacidad) {
            System.out.println("  Cola llena, no se puede agregar: " + d.getNombre());
            return;
        }
        cola[fin] = d;
        fin = (fin + 1) % capacidad;
        tamanio++;
        System.out.println("  Agregado: " + d.getNombre()
                + " (" + d.getPaginas() + " pags) | Enviado: " + d.getHoraEnvio());
    }

    public Documento dequeue() {
        if (estaVacia()) {
            System.out.println("  No hay documentos en cola.");
            return null;
        }
        Documento impreso = cola[frente];
        cola[frente] = null;
        frente = (frente + 1) % capacidad;
        tamanio--;
        return impreso;
    }

    public Documento peek() {
        if (estaVacia()) {
            System.out.println("  Cola vacia.");
            return null;
        }
        return cola[frente];
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("  Cola vacia.");
            return;
        }
        System.out.println("  Cola de impresion (primero → ultimo):");
        for (int i = 0; i < tamanio; i++) {
            int idx = (frente + i) % capacidad;
            System.out.println("    " + (i == 0 ? ">> " : "   ")
                    + cola[idx].getNombre()
                    + " (" + cola[idx].getPaginas() + " pags)");
        }
    }
}