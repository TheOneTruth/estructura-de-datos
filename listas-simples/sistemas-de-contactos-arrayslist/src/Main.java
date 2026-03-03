public class Main {
    public static void main(String[] args) {
        GestionContactos gestion = new GestionContactos();

        gestion.insertar(
                new Contacto("Ana", "310000000", "Ana@gmail.com")
        );
        gestion.insertar(
                new Contacto("Luis", "32200000", "luis@gmail.com")
        );

        System.out.println("Lista de contactos: ");
        gestion.listar();

        System.out.println("Buscar a Ana");
        System.out.println(gestion.buscar("Ana"));

        System.out.println("Eliminar a Luis");
        gestion.eliminar("Luis");

        System.out.println("Lista de contactos final: ");
        gestion.listar();
    }
}