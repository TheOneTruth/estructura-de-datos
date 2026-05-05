import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Documento {
    private String nombre;
    private int paginas;
    private String horaEnvio;

    public Documento(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.horaEnvio = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getNombre() { return nombre; }
    public int getPaginas() { return paginas; }
    public String getHoraEnvio() { return horaEnvio; }
}