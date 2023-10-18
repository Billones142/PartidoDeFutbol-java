package ucp.partido.classes;

public class Tarjeta {
    public Tarjeta(String color, Jugador player) {
        super();
        setColor(color);
        setJugador(player);
    }

    private String color;
    private Jugador jugador;

    /********************Comienzo encapsulacion********************/
    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public Jugador getJugador() {
        return jugador;
    }

    private void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    /**********************Fin encapsulacion**********************/
}