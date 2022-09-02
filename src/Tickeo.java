import java.util.List;

public class Tickeo {
    String humano;
    Integer suben;
    Integer bajan;
    List<Autobus> Autobuses;
    List<Parada> Paradas;

    public Tickeo(){

    }


    public Tickeo(String humano, Integer suben, Integer bajan, List<Autobus> autobuses, List<Parada> paradas) {
        this.humano = humano;
        this.suben = suben;
        this.bajan = bajan;
        Autobuses = autobuses;
        Paradas = paradas;
    }
}
