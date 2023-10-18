package ucp.partido.classes;

public class Tarjeta {
    public Tarjeta(String color, Jugador player) {
        super();
        setColor(color);
        setJugador(player);
    }

    String color;
    Jugador jugador;

    /********************Comienzo encapsulacion********************/
    private String getColor() {
        return color;
    }

    public void setColor(String color) {
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