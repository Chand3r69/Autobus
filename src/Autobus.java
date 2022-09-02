import java.util.List;
public class Autobus {
    String placa;
    Integer numero;
    Modelo modelo;
    List<Linea> Lineas;


    public Autobus(){

    }
    public Autobus(String placa, Integer numero, Modelo modelo){
        this.placa = placa;
        this.numero = numero;
        this.modelo = modelo;
    }
}
