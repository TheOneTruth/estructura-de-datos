public class Main {
    public static void main(String[] args) {
        GestionHistorial historial = new GestionHistorial();

        System.out.println("=== Insertando paginas ===");
        historial.insertar(new pagina("https://google.com"));
        historial.insertar(new pagina("https://youtube.com"));
        historial.insertar(new pagina("https://github.com"));
        historial.insertar(new pagina("https://stackoverflow.com"));

        System.out.println("\n=== Historial completo ===");
        historial.mostrar();

        System.out.println("\n=== Busqueda ===");
        pagina resultado = historial.buscar("https://github.com");
        if (resultado != null) {
            System.out.println("  Encontrada: " + resultado.getUrl()
                    + " | " + resultado.getFecha());
        } else {
            System.out.println("  No encontrada.");
        }

        pagina noExiste = historial.buscar("https://facebook.com");
        if (noExiste == null) {
            System.out.println("  No encontrada: https://facebook.com");
        }

        System.out.println("\n=== Eliminando historial ===");
        historial.eliminarTodo();
        System.out.println("  Historial eliminado. Total: "
                + historial.getTamanio() + " paginas.");
        historial.mostrar();
    }
}