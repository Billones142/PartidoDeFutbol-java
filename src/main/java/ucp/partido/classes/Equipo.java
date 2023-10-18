package ucp.partido.classes;

import java.util.ArrayList;

import ucp.partido.interfaces.IJugador;

public class Equipo {
    public Equipo(String nombre, String abreviatura) {
        super();
        setName(nombre);
        setAbreviatura(abreviatura);
    }

    private String name;
    private String abreviatura;
    private ArrayList<IJugador> jugadores= new ArrayList<>();

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

    private void setAbreviatura(String ebreviaturaNombre) {
        this.abreviatura = ebreviaturaNombre;
    }

    public ArrayList<IJugador> getJugadores() {
        return jugadores;
    }
    /**********************Fin encapsulacion**********************/

    public int jugadoresCantidad() {
        return getJugadores().size();
    }

    public IJugador obtenerJugador(int numero) {
        IJugador jugadorObtenido= null;
        for (IJugador jugador : getJugadores()) {
            if (jugador.getNumero() == numero) {
                jugadorObtenido= jugador;
            }
        }
        return jugadorObtenido;
    }

    public void agregar(IJugador jugador) { //TODO
        getJugadores().add(jugador);
    }

    public String imprimirPlantel() {
        String plantel= "";
        for (IJugador iJugador : getJugadores()) {
            if (!plantel.isEmpty()) {
                plantel.concat(", ");
            }
            plantel.concat("["+iJugador.getNumero()+"]"+iJugador.getName()+"("+iJugador.getPosicion()+")");
        }
        return plantel;
    }
}