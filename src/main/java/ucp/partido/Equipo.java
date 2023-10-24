package ucp.partido;

import java.util.ArrayList;
import java.util.Collections;

import ucp.partido.interfaces.*;

public class Equipo implements IImprimible{
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

    public void agregar(IJugador jugador) {
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
            for (IJugador jugador : getJugadores()) {
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

    public String impresion() { //TODO
        return "[Equipo] " + getName() + " > " + getAbreviatura();
    }
}