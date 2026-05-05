import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pagina {
    private String url;
    private String fecha;

    public pagina(String url) {
        this.url = url;
        this.fecha = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public String getUrl() { return url; }
    public String getFecha() { return fecha; }
}