package ucp.partido;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Var {
    public Var(Partido partido) {
        super();
        setPartido(partido);
    }

    private Partido partido;
    AsistenteDeVideo asistenteDeVideo;
    ArrayList<AVAR> aVar= new ArrayList<>(); //TODO

    /********************Comienzo encapsulacion********************/
    private void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return asistenteDeVideo;
    }
    /**********************Fin encapsulacion**********************/

    public int cantidadTarjetasRojas() {
        return (int)getPartido().getTarjetas().stream()
        .filter(tarjeta -> tarjeta.getColor().contains("ROJA"))
        .count();
    }

    public int cantidadTarjetasAmarillas() {
        return (int)getPartido().getTarjetas().stream()
        .filter(tarjeta -> tarjeta.getColor().contains("AMARILLA"))
        .count();
    }

    public int cantidadTarjetas(Equipo equipo) { //TODO
        return 0;
        /*return (int)getPartido().getTarjetas().stream()
        .filter()
        .count();*/
    }
}