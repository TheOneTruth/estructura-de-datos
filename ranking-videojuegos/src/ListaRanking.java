public class ListaRanking {

    private Nodo cabeza;

    public ListaRanking() {
        cabeza = null;

    }

    public void insertarFinal(Jugador contacto) {
        Nodo nuevo = new Nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Jugador buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }



    public  void listar(){
        Nodo actual=cabeza;
        while (actual !=null){
            System.out.println(actual.getDato());
            actual= actual.getSiguiente();

        }
    }

    public ListaRanking  lobby (){
        int  max = 100;










       /* Nodo actual = cabeza;
        int max = actual.getDato().getRanking();

        while ( actual !=null){

            if ( actual.getDato().getRanking()<max){
max=actual.getDato().getRanking();


            }
actual= actual.getSiguiente();

        }

*/
        return null;
    }


}