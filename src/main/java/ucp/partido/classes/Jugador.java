package ucp.partido.classes;

import ucp.partido.interfaces.Ijugador;

public class Jugador implements Ijugador{
    public Jugador(String nombre, int numeroJugador) {
        super();
        setName(nombre);
        setNumero(numeroJugador);
    }

    private String name;
    private TarjetaBase tarjeta;
    private int numero;

    /********************Comienzo encapsulacion********************/
    private void setName(String nombre) {
        this.name = nombre;
    }

    public String getName() {
        return name;
    }

    private void setNumero(int numeroJugador) {
        this.numero = numeroJugador;
    }

    public int getNumero() {
        return numero;
    }

    private void setTarjeta(TarjetaBase tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TarjetaBase getTarjeta() {
        return tarjeta;
    }
    /**********************Fin encapsulacion**********************/
}