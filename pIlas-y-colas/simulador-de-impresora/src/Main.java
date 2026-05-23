public class Main {
    public static void main(String[] args) {

        ColaImpresora impresora = new ColaImpresora(10);

        System.out.println("=== Enviando documentos ===");
        impresora.enqueue(new Documento("Tarea_Estructuras.pdf", 5));
        impresora.enqueue(new Documento("Informe_Financiero.docx", 12));
        impresora.enqueue(new Documento("CV_Juan.pdf", 2));
        impresora.enqueue(new Documento("Contrato.pdf", 8));

        System.out.println("\n=== Cola actual ===");
        impresora.mostrarCola();

        System.out.println("\n=== Siguiente a imprimir (peek) ===");
        Documento siguiente = impresora.peek();
        if (siguiente != null) {
            System.out.println("  Siguiente: " + siguiente.getNombre()
                    + " (" + siguiente.getPaginas() + " pags)");
        }

        System.out.println("\n=== Imprimiendo documentos (dequeue) ===");
        for (int i = 0; i < 3; i++) {
            Documento impreso = impresora.dequeue();
            if (impreso != null) {
                System.out.println("  Imprimiendo: " + impreso.getNombre()
                        + " (" + impreso.getPaginas() + " pags)");
            }
        }

        System.out.println("\n=== Cola restante ===");
        impresora.mostrarCola();

        System.out.println("\n=== Documentos pendientes: "
                + impresora.getTamanio() + " ===");
    }
}