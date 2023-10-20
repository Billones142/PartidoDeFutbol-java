package ucp.partido;

import java.util.ArrayList;
import java.util.Collections;

import ucp.partido.interfaces.IJugadoR;

public class Equipo {
    public Equipo(String nombre, String abreviatura) {
        super();
        setName(nombre);
        setAbreviatura(abreviatura);
    }

    private String name;
    private String abreviatura;
    private ArrayList<IJugadoR> jugadores= new ArrayList<>();

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

    public ArrayList<IJugadoR> getJugadores() {
        return jugadores;
    }
    /**********************Fin encapsulacion**********************/

    public int jugadoresCantidad() {
        return getJugadores().size();
    }

    public IJugadoR obtenerJugador(int numero) {
        IJugadoR jugadorObtenido= null;
        for (IJugadoR jugador : getJugadores()) {
            if (jugador.getNumero() == numero) {
                jugadorObtenido= jugador;
            }
        }
        return jugadorObtenido;
    }

    public void agregar(IJugadoR jugador) {
        getJugadores().add(jugador);
    }

    public String imprimirPlantel() {
        String plantel= "";
        ArrayList<Integer> orden= new ArrayList<>();
        
        for (int i = 0; i < getJugadores().size(); i++) {
            orden.add(getJugadores().get(i).getNumero());
        }

        Collections.sort(orden);

        for (int i = 0; i < orden.size(); i++) {
            for (IJugadoR jugador : getJugadores()) {
                if (jugador.getNumero() == orden.get(i)) {
                    if (!plantel.isEmpty()) {
                    plantel= plantel.concat(", ");
                    }
                    plantel= plantel.concat("["+jugador.getNumero()+"] "+jugador.getName()+" ("+jugador.getPosicion()+")");
                }
            }
        }

        return plantel;
    }
}