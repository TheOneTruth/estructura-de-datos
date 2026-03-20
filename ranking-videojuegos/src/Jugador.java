import java.util.Objects;

public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private String tipo;
    private int score;

    public Jugador(String nombre, String tipo, int ranking) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.score = ranking;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
    public int compareTo(Jugador other) {
        // Orden descendente por score (mayor primero)
        return Integer.compare(other.score, this.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Jugador))
            return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ranking=" + score +
                '}';
    }
}