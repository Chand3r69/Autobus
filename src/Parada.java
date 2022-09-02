import java.util.List;

public class Parada {
    int numero;
    String direccion;
    String horario;
    List<Linea> Lineas ;
    public Parada(){
    }
    public Parada(int numero, String direccion, String horario){
        this.numero = numero;
        this.direccion = direccion;
        this.horario = horario;
    }


}
