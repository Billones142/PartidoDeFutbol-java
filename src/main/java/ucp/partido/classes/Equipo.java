package ucp.partido.classes;

import java.util.ArrayList;

public class Equipo {
    public Equipo(String nombre, String abreviatura) {
        super();
        setName(nombre);
        setAbreviatura(abreviatura);
    }

    String name;
    String abreviatura;
    ArrayList<Jugador> jugadores;

    /********************Comienzo encapsulacion********************/
    public String getName() {
        return name;
    }

    private void setName(String nombre) {
        this.name = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String ebreviaturaNombre) {
        this.abreviatura = ebreviaturaNombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    /**********************Fin encapsulacion**********************/

    public int jugadoresCantidad() { //TODO
        return getJugadores().size();
    }

    public Jugador obtenerJugador(int numero) { //TODO
        Jugador jugadorObtenido= null;
        for (Jugador jugador : getJugadores()) {
            if (jugador.getNumeroJugador() == numero) {
                jugadorObtenido= jugador;
            }
        }
        return jugadorObtenido;
    }

    public void agregar(Jugador jugador) { //TODO
        getJugadores().add(jugador);
    }
}