import java.util.ArrayList;

public class GestionHistorial {
    private ArrayList<pagina> lista;

    public GestionHistorial() {
        this.lista = new ArrayList<>();
    }

    public void insertar(pagina p) {
        lista.add(p);
    }

    public pagina buscar(String url) {
        for (pagina p : lista) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                return p;
            }
        }
        return null;
    }

    public void mostrar() {
        if (lista.isEmpty()) {
            System.out.println("  Historial vacio.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("  " + (i + 1) + ". "
                    + lista.get(i).getUrl()
                    + " | " + lista.get(i).getFecha());
        }
    }

    public void eliminarTodo() {
        lista.clear();
    }

    public int getTamanio() {
        return lista.size();
    }
}