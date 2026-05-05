public class Main {
    public static void main(String[] args) {

        PilaNave navegador = new PilaNave(10);

        System.out.println("=== Navegando ===");
        navegador.push(new Pagina("https://google.com",        "Google"));
        navegador.push(new Pagina("https://youtube.com",       "YouTube"));
        navegador.push(new Pagina("https://github.com",        "GitHub"));
        navegador.push(new Pagina("https://stackoverflow.com", "Stack Overflow"));

        System.out.println("\n=== Historial actual ===");
        navegador.mostrarHistorial();

        System.out.println("\n=== Pagina actual (peek) ===");
        Pagina actual = navegador.peek();
        if (actual != null) {
            System.out.println("  Estas en: [" + actual.getTitulo() + "] " + actual.getUrl());
        }

        System.out.println("\n=== Presionando Atras (pop) ===");
        Pagina anterior = navegador.pop();
        if (anterior != null) {
            System.out.println("  Saliste de: [" + anterior.getTitulo() + "] " + anterior.getUrl());
        }

        anterior = navegador.pop();
        if (anterior != null) {
            System.out.println("  Saliste de: [" + anterior.getTitulo() + "] " + anterior.getUrl());
        }

        System.out.println("\n=== Pagina actual despues de retroceder ===");
        actual = navegador.peek();
        if (actual != null) {
            System.out.println("  Estas en: [" + actual.getTitulo() + "] " + actual.getUrl());
        }

        System.out.println("\n=== Historial restante ===");
        navegador.mostrarHistorial();
    }
}