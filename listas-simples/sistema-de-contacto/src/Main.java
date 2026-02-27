public class Main {
    public static void main(String[] args) {

        ListaContactos lista = new ListaContactos();

        lista.insertarFinal(
                new Contacto("Ana", "3150000", "ana@gmail.com")
        );
        lista.insertarFinal(
                new Contacto("Luis", "3160000", "luis@gmail.com")
        );
        lista.insertarFinal(
                new Contacto("Carlos", "3170000", "carlos@gmail.com")
        );

        System.out.println("Lista actual");
        lista.listar();

        System.out.println("\nBuscar Ana: ");
        System.out.println(lista.buscar("Ana"));

        System.out.println("\nEliminar Luis: ");
        System.out.println(lista.eliminar("Luis"));

        System.out.println("\nLista final");
        lista.listar();
    }
}