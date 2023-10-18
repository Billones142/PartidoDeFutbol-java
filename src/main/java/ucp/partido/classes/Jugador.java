package ucp.partido.classes;

import ucp.partido.interfaces.Ijugador;

public class Jugador implements Ijugador{
    public Jugador(String nombre, int numeroJugador) {
        super();
        setName(nombre);
        setNumeroJugador(numeroJugador);
    }

    private String name;
    private Tarjeta tarjeta;
    private int numeroJugador;

    /********************Comienzo encapsulacion********************/
    private void setName(String nombre) {
        this.name = nombre;
    }

    public String getName() {
        return name;
    }

    private void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    private void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    /**********************Fin encapsulacion**********************/
}