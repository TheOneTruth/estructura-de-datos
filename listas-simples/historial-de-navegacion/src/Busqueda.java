import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class Busqueda {
    private String consulta;
    private String motorBusqueda;
    private URL url;
    private LocalDateTime fecha;

    public Busqueda(String consulta) {
        this.fecha = fecha;
        this.consulta = consulta;
        this.motorBusqueda = motorBusqueda;

        try {
            String consultaCodificada = URLEncoder.encode(consulta, StandardCharsets.UTF_8);
            this.url = new URL("https://www.google.com/search?q=" + consultaCodificada);
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
