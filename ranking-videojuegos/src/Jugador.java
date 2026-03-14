public class Jugador {
    private String nombre;
    private String tipo;
    private int ranking;

    public Jugador(String nombre, String tipo, int ranking) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}