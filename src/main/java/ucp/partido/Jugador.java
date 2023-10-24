package ucp.partido;

import ucp.partido.interfaces.IImprimible;
import ucp.partido.interfaces.IJugador;

public class Jugador implements IJugador, IImprimible{
    public Jugador(String nombre, int numeroJugador) {
        super();
        setName(nombre);
        setNumero(numeroJugador);
    }

    private String name;
    private TarjetaBase tarjeta;
    private int numero;
    private String posicion;

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

    public void setTarjeta(TarjetaBase tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TarjetaBase getTarjeta() {
        return tarjeta;
    }

    public void setPosicion(String position) {
        this.posicion = position;
    }

    public String getPosicion() {
        return posicion;
    }
    /**********************Fin encapsulacion**********************/

    public String impresion() {
        return "[Jugador "+ getNumero() +"] " + getName() +
        " > " + getPosicion();
    }
}