package ucp.partido.classes;

public class Var {
    public Var(Partido partido) {
        super();
        setPartido(partido);
    }
    private Partido partido;

    /********************Comienzo encapsulacion********************/
    private void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
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
}