
import java.util.Date;

public class Incidencia {
    Date fecha;
    double costo;
    String descripcion;
    String tipo;
    public Incidencia(){

    }

    public Incidencia(Date fecha, double costo, String descripcion, String tipo) {
        this.fecha = fecha;
        this.costo = costo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
}
