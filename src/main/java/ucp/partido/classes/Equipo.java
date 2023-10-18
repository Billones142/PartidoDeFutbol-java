package ucp.partido.classes;

import java.util.ArrayList;

public class Equipo {
    public Equipo(String nombre) {
        super();
        setNombre(nombre);
    }

    String nombre;
    ArrayList<Jugador> jugadores;

    /********************Comienzo encapsulacion********************/
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**********************Fin encapsulacion**********************/
}